package com.in28minutes.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component

public class PacManGame implements GamingConsole {

	public void up()
	{
		System.out.println("Up Move");
	}
	
	public void down()
	{
		System.out.println("Down Move");
	}
	
	
	public void left()
	{
		System.out.println("Left Move");
	}
	
	public void right()
	{
		System.out.println("Right Move");
	}
}
