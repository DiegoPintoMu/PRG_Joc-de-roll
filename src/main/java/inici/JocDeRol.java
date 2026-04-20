package inici;

import joc.Alien;
import joc.Human;
import joc.Warrior;

public class JocDeRol {

	// PRUEBAS --------------------------------------------

	public static void provaFaseV2() {

		Human Freeman = new Human(8,2,32,"Gordon Freeman");

		Alien Gman = new Alien(10, 3, 14, "G-Man");

		Warrior Heavy = new Warrior(5,1,50,"The Heavy");

		Gman.attack(Freeman);
		Freeman.attack(Heavy);
		Heavy.attack(Gman);

	}

	public static void provaFaseV3() {

		Human Luffy = new Human(9,2,125,"Monkey D. Luffy");

		Warrior Zoro = new Warrior(12,5,75,"Roronoa Zoro");

		Alien Ace = new Alien(3,8,55,"Portogas D. Ace");

		Luffy.attack(Zoro);
		Ace.attack(Luffy);
		Ace.attack(Zoro);
		Zoro.attack(Ace);
		Ace.attack(Zoro);
		Luffy.attack(Ace);
		Ace.attack(Luffy);

	}

	public static void provaFaseV4() {


	}


	// MAIN --------------------------------------------

	public static void main(String[] args) {

		// provaFaseV2();
		// provaFaseV3();
		provaFaseV4();

	}
}
