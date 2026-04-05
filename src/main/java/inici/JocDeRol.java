package inici;

import joc.Alien;
import joc.Human;
import joc.Warrior;

public class JocDeRol {

	public static void provaFaseV2() {

		Human Freeman = new Human(8,2,32,"Gordon Freeman");

		Alien Gman = new Alien(10, 3, 14, "G-Man");

		Warrior Heavy = new Warrior(5,1,50,"The Heavy");

		Gman.attack(Freeman);
		Freeman.attack(Heavy);
		Heavy.attack(Gman);

	}

	public static void main(String[] args) {

		provaFaseV2();

	}
}
