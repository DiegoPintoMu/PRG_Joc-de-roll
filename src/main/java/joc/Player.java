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

	// SETTERS -----------------------

	public void setAttackPoints(int attackPoints) { this.attackPoints = attackPoints; }

	public void setDefensePoints(int defensePoints) { this.defensePoints = defensePoints; }

	public void setLife(int life) { this.life = life; }


	// FUNCIONES -----------------------

	@Override
	public String toString() {
		return this.getName() +
				" PA:" + this.getAttackPoints() +
				" / PD:" + this.getDefensePoints() +
				" / PV:" + this.getLife();
	}


	public void attack (Player attacked) {

		// INFO JUGADORES
		System.out.println("// ABANS DE L'ATAC:");
		System.out.println("Atacant: " + this.toString());
		System.out.println("Atacat: " + attacked.toString());

		// INICIO ATAQUES
		System.out.println("//	ATAC:");

		attacked.hit(this.getAttackPoints());


		// contraataque (si "attacked" sigue vivo)
		if (attacked.getLife() > 0) {
			this.hit(attacked.getAttackPoints());
		}


		// RESULTADO
		System.out.println("//	DESPRÉS DE L'ATAC");
		System.out.println("Atacant: " + this.toString());
		System.out.println("Atacat: " + attacked.toString());
	}



	protected void hit (int attackPoints){

		// INFO ATAQUE
		System.out.println(this.getName() +
				" és colpejat amb " + attackPoints +
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
