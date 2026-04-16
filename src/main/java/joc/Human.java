package joc;

public class Human extends Player {

	public Human(int attackPoints, int defensePoints, int life, String name) {
		super(attackPoints, defensePoints, life, name);


		// CONDICION Human (PV no puede ser > 100)
		if (life > 100) {
			this.setLife(100);
		}
	}
}
