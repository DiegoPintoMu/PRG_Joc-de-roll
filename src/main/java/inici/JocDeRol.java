package inici;

import joc.Alien;
import joc.Human;
import joc.Team;
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

		Human reigen = new Human(3,10,25,"Arataka Reigen");

		Human ritsu = new Human(6,2,75,"Ritsu Kageyama");

		Human teruki = new Human(11,3,50,"Teruki Hanazawa");

		Warrior mob = new Warrior(10,6,22,"Shigeo Kageyama");

		Alien hoyuelo = new Alien(6,1,100,"Hoyuelo");

		Team poison = new Team("White T Poison");
		Team garra = new Team("Organizacion garra");

		mob.add(poison);
		poison.add(hoyuelo);
		reigen.add(garra);
		hoyuelo.add(garra);

		System.out.println(poison.toString());
		System.out.println(garra.toString());

		// comprobar que no se dupliquen
		garra.add(teruki);
		teruki.add(garra);
		poison.add(ritsu);
		ritsu.add(poison);

		System.out.println(teruki.toString());
		System.out.println(ritsu.toString());

		System.out.println(poison.toString());
		System.out.println(garra.toString());

		//Borrar
		garra.remove(teruki);
		teruki.remove(poison); // nunca ha estado en 'poison' (comprobar que no de error)
		hoyuelo.remove(garra);
		poison.remove(ritsu);

		System.out.println(poison.toString());
		System.out.println(garra.toString());

	}


	// MAIN --------------------------------------------

	public static void main(String[] args) {

		// provaFaseV2();
		// provaFaseV3();
		provaFaseV4();

	}
}
