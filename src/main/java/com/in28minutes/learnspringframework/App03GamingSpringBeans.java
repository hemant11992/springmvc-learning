package com.in28minutes.learnspringframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;
import com.in28minutes.learnspringframework.game.PacManGame;


@Configuration
@EnableAutoConfiguration 
@ComponentScan("com.in28minutes.learnspringframework.game")

public class App03GamingSpringBeans {
	
//	@Bean
//	public GamingConsole game() {
//	var game= new PacManGame();
//		return game;
//	}
//	
//	@Bean
//	public GameRunner gameRunner( GamingConsole game) {
//		var gameRunner= new GameRunner(game);
//		return gameRunner;
//	}

	@Autowired
	GameRunner gameRunner;
	public static void main(String[] args) {
	try(var context =	
			new AnnotationConfigApplicationContext(App03GamingSpringBeans.class))
	{
		context.getBean(GamingConsole.class).up();
		context.getBean(GameRunner.class).run();
	}
		
	
	}

}
