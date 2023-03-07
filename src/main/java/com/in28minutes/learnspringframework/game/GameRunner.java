package com.in28minutes.learnspringframework.game;

import org.springframework.beans.factory.annotation.Autowired;

public class GameRunner {
	//MarioGame game;
	@Autowired
	private GamingConsole game;
	public GameRunner(GamingConsole game)
	{
		this.game=game;
	}
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running game: "+ game);
		game.up();
		game.down();
		game.right();
		game.left();
	}
}
