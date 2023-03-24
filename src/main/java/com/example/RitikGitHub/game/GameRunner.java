package com.example.RitikGitHub.game;

public class GameRunner {
	private GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game = game;
		// TODO Auto-generated constructor stub
	}

	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
		// TODO Auto-generated method stub
		
	}

}
