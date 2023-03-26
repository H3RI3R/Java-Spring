package com.example.RitikGitHub.game;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component 

public class GameRunner {
	@Autowired
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
