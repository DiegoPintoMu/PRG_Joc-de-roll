package joc;

import java.util.ArrayList;

public class Player {

	private String name;
	private int attackPoints;
	private int defensePoints;
	private int life;
	private ArrayList<Team> teams;

	// CONSTRUCTOR -----------------------

	public Player(int attackPoints, int defensePoints, int life, String name) {
		this.attackPoints = attackPoints;
		this.defensePoints = defensePoints;
		this.life = life;
		this.name = name;
		teams = new ArrayList<>();
	}

	// GETTERS -----------------------

	public int getAttackPoints() { return attackPoints; }

	public int getDefensePoints() { return defensePoints; }

	public int getLife() { return life; }

	public String getName() { return name; }

	public ArrayList<Team> getTeams() { return teams; }

	// SETTERS -----------------------

	public void setAttackPoints(int attackPoints) { this.attackPoints = attackPoints; }

	public void setDefensePoints(int defensePoints) { this.defensePoints = defensePoints; }

	public void setLife(int life) { this.life = life; }


	// FUNCIONES -----------------------

	@Override
	public String toString() {
		String res = this.getName() +
				" PA:" + this.getAttackPoints() +
				" / PD:" + this.getDefensePoints() +
				" / PV:" + this.getLife() +
				" (pertany a " + this.getTeams().size() + " equip";
		if  (this.getTeams().size() != 1) { res += "s"; }

		return res + ")";
	}


		// ------------- combat ------------- \\

	public void attack (Player attacked) {

		// INFO JUGADORES
		System.out.println("\n// ABANS DE L'ATAC:");
		System.out.println("Atacant: " + this.toString());
		System.out.println("Atacat: " + attacked.toString());

		// INICIO ATAQUES
		System.out.println("\n// ATAC:");

		attacked.hit(this.getAttackPoints());

		// contraataque (si "attacked" sigue vivo)
		if (attacked.getLife() > 0) {
			this.hit(attacked.getAttackPoints());
		}

		// RESULTADO
		System.out.println("\n// DESPRÉS DE L'ATAC");
		System.out.println("Atacant: " + this.toString());
		System.out.println("Atacat: " + attacked.toString());
	}


	protected void hit (int attackPoints){

		//daño real tras recibir el ataque
		int hitPoints = attackPoints - this.getDefensePoints();

		// INFO ATAQUE
		System.out.println(this.getName() +
				" és colpejat amb " + attackPoints +
				" punts i es defén amb " + this.getDefensePoints() +
				". Vides: " + this.getLife() + " - " + hitPoints + " =");

		// EJECUCION ATAQUE
		this.setLife(this.getLife() - hitPoints);

		// vida no puede ser menor de 0
		if (this.getLife() < 0) {
			this.setLife(0);
		}

		// INFO ATAQUE (Vida restante)
		System.out.println("	" + this.getLife());
	}


		// ------------- team ------------- \\

	public void add(Team t) {
		if (!this.teams.contains(t)) {
			this.teams.add(t);
		}
		if (!t.getMembers().contains(this)) {
			t.add(this);
		}
	}

	public void remove(Team t) {
		if (this.teams.contains(t)) {
			this.teams.remove(t);
		}
		if (t.getMembers().contains(this)) {
			t.remove(this);
		}
	}

	public boolean equals(Player p) {
		if (this == p) {
			return true;
		}
		return false;
	}

}
