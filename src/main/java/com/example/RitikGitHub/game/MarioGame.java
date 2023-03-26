package com.example.RitikGitHub.game;

//import org.springframework.context.annotation.Primary;
//import org.springframework.stereotype.Component;
////@Primary
////@Component
public class MarioGame implements GamingConsole {
	public void up() {
		System.out.println("Jump");
	}
	public void down() {
		System.out.println("Roll down");
	}
	public void left() {
		System.out.println("Decrease Speed");
	}
	public void right() {
		System.out.println("Slide");
	}
	
}
