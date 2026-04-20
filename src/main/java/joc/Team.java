package joc;

import java.util.ArrayList;

public class Team {
	private String name;
	private ArrayList<Player> players;

	// CONSTRUCTOR -----------------------

	public Team(String name) {
		this.name = name;
		players = new ArrayList<>();
	}

	// GETTERS -----------------------

	public String getName() { return name; }


	// FUNCIONES -----------------------

	@Override
	public String toString() {
		String res = "Equip " + this.getName() + " :";

		for (Player p : this.players) {
			res += "\n	" + p.toString();
		}
		return res;
	}

	public ArrayList<Player> getMembers() {
		ArrayList<Player> members = new ArrayList<>();

		for (Player p : this.players) {
			members.add(p);
		}
		return members;
	}

	public void add(Player p) {
		if (!this.players.contains(p)) {
			this.players.add(p);
		}
		if (!p.getTeams().contains(this)) {
			p.add(this);
		}
	}

	public void remove(Player p) {
		if (this.players.contains(p)) {
			this.players.remove(p);
		}
		if (p.getTeams().contains(this)) {
			p.remove(this);
		}
	}

	public boolean equals(Team t) {
		if (this == t) {
			return true;
		}
		return false;
	}
}
