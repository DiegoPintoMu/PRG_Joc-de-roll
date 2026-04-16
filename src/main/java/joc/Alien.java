package joc;

public class Alien extends Player {

	public Alien(int attackPoints, int defensePoints, int life, String name) {
		super(attackPoints, defensePoints, life, name);
	}


	@Override
	public void attack (Player attacked) {

		// INFO JUGADORES
		System.out.println("\n// ABANS DE L'ATAC:");
		System.out.println("Atacant: " + this.toString());
		System.out.println("Atacat: " + attacked.toString());


		// CONDICION Alien (PV > 20 = PA +3 & PD -3) -----------
		if (this.getLife() > 20) {
			String res = "\n-- EMBOIG DE L'ALIEN --\n" +
					"	-> " + this.getName() +
					" PA: " + this.getAttackPoints() + "+3 = ";

			this.setAttackPoints(this.getAttackPoints() + 3);

			res+= getAttackPoints() + " / " +
					"PD: " + this.getDefensePoints() + "-3 = ";

			if (getDefensePoints() > 0) {
				this.setDefensePoints(this.getDefensePoints() - 3);
			}
			else if (getDefensePoints() < 0) {
				this.setDefensePoints(0);
			}

			res+= getDefensePoints();
			System.out.println(res);
		}
		// -----------------------------------------------------


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
}
