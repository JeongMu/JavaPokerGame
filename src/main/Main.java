package main;

import game.GameClient;

public class Main {
	static GameClient game = new GameClient();
	
	public static void main(String[] args) {
		
		boolean go = true;
		while(go) go = game.start();
	}
}
