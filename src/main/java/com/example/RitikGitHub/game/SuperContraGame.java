package com.example.RitikGitHub.game;

import org.springframework.stereotype.Component;

@Component 
public class SuperContraGame implements GamingConsole {
	
public void up() {
	System.out.println("Jump");
}
public void down() {
	System.out.println("Down");
}
public void left() {
	System.out.println("Less speed");
}
public void right() {
	System.out.println("Accelerate");
}
}
