package joc;

public class Player {

	private String name;
	private int attackPoints;
	private int defensePoints;
	private int life;

	// CONSTRUCTOR -----------------------

	public Player(int attackPoints, int defensePoints, int life, String name) {
		this.attackPoints = attackPoints;
		this.defensePoints = defensePoints;
		this.life = life;
		this.name = name;
	}

	// GETTERS -----------------------

	public int getAttackPoints() { return attackPoints; }

	public int getDefensePoints() { return defensePoints; }

	public int getLife() { return life; }

	public String getName() { return name; }


	// FUNCIONES -----------------------

	@Override
	public String toString() {
		return this.getName() +
				" PA:" + this.getAttackPoints() +
				" / PD:" + this.getDefensePoints() +
				" / PV:" + this.getLife();
	}


	public void attack (Player p) {

		// INFO JUGADORES
		System.out.println("// ABANS DE L'ATAC:");
		System.out.println("Atacant: " + this.toString());
		System.out.println("Atacat: " + p.toString());

		// INICIO ATAQUES
		System.out.println("//	ATAC:");

		p.hit(this.getAttackPoints());


		// contraataque (si "p" sigue vivo)
		if (p.getLife() > 0) {
			this.hit(p.getAttackPoints());
		}


		// RESULTADO
		System.out.println("//	DESPRÉS DE L'ATAC");
		System.out.println("Atacant: " + this.toString());
		System.out.println("Atacat: " + p.toString());
	}



	protected void hit (int attackPoints){

		// INFO ATAQUE
		System.out.println(this.getName() + " és colpejat amb " + attackPoints +
				" punts i es defén amb " + this.getDefensePoints() +
				". Vides: " + this.getLife() + " - " +
				(attackPoints - this.getDefensePoints()) + " =");

		// EJECUCION ATAQUE
		this.life -= attackPoints - this.getDefensePoints();

		// vida no puede ser menor de 0
		if (this.getLife() < 0) {
			this.life = 0;
		}

		// INFO ATAQUE (Vida restante)
		System.out.println("	" + this.getLife());
	}

}
