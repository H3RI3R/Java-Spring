package com.example.RitikGitHub.game;

public class GameRunner {
	private MarioGame game;

	public GameRunner(MarioGame game) {
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
