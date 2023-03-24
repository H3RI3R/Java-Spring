package com.example.RitikGitHub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.RitikGitHub.game.GameRunner;
import com.example.RitikGitHub.game.MarioGame;

@SpringBootApplication
public class RitikGitHubApplication {

	public static void main(String[] args) {
//		SpringApplication.run(RitikGitHubApplication.class, args);
		MarioGame game = new MarioGame();
		GameRunner runner = new GameRunner(game);
		runner.run();
		
	}

}
