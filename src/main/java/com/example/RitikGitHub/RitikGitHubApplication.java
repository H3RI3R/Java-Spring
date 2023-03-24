package com.example.RitikGitHub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.RitikGitHub.game.GameRunner;
import com.example.RitikGitHub.game.MarioGame;
import com.example.RitikGitHub.game.SuperContraGame;

@SpringBootApplication
public class RitikGitHubApplication {

	public static void main(String[] args) {
		//		SpringApplication.run(RitikGitHubApplication.class, args);
		MarioGame game = new MarioGame();
//		SuperContraGame game = new SuperContraGame();
		GameRunner runner = new GameRunner(game);
		
		runner.run();
		
	}

}
