package joc;

import java.util.ArrayList;

public class Team {
	private String name;
	private ArrayList<Player> players;

	// CONSTRUCTOR -----------------------

	public Team(String name) {
		this.name = name;
		players = new ArrayList<Player>();
	}

	// FUNCIONES -----------------------

	@Override
	public String toString() {
		int teamCount = 0;
		String res = "Equip " + this.name + " :";

		for (Player p : players) {
			res += "\n" + players.get(i).toString() ;

		}

		return res;
	}

	@Override
	public boolean equals(Object obj) {

	}


}
