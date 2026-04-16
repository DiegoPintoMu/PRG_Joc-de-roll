package joc;

public class Warrior extends Human {

	public Warrior(int attackPoints, int defensePoints, int life, String name) {
		super(attackPoints, defensePoints, life, name);
	}


	@Override
	protected void hit (int attackPoints){

		//daño real tras recibir el ataque
		int hitPoints = attackPoints - this.getDefensePoints();

		// INFO ATAQUE
		System.out.print(this.getName() +
				" és colpejat amb " + attackPoints +
				" punts i es defén amb " + this.getDefensePoints() +
				". ");

		//CONDICION Warrior (ataques < 5 no afectan) --------
		if (hitPoints < 5) {
			System.out.println("\n-- AGUILITAT DEL GUERRER --");
			System.out.println("	-> L'atac no és suficientment potent com per a ferir al guerrer");

			hitPoints = 0;
		}
		// --------------------------------------------------

		System.out.println("Vides: " + this.getLife() + " - " + hitPoints + " =");


		// EJECUCION ATAQUE
		this.setLife(this.getLife() - hitPoints);

		// vida no puede ser menor de 0
		if (this.getLife() < 0) {
			this.setLife(0);
		}

		// INFO ATAQUE (Vida restante)
		System.out.println("	" + this.getLife());
	}
}
