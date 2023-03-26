package com.example.RitikGitHub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.RitikGitHub.game.GameRunner;
import com.example.RitikGitHub.game.GamingConsole;
import com.example.RitikGitHub.game.MarioGame;
import com.example.RitikGitHub.game.SuperContraGame;

@SpringBootApplication
public class RitikGitHubApplication {

	public static void main(String[] args) {
				ConfigurableApplicationContext context = SpringApplication.run(RitikGitHubApplication.class, args);
//		MarioGame game = new MarioGame();
//		GamingConsole game = new SuperContraGame();
//		GameRunner runner = new GameRunner(game);
		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		
	}

}
