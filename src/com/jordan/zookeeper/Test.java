package com.jordan.zookeeper;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla gorilla1 = new Gorilla(50);
		gorilla1.throwSomething();
		gorilla1.eatBananas();
		gorilla1.eatBananas();
		gorilla1.climb();
		
		Bat bat1 = new Bat();
		bat1.fly();
		bat1.eatHumans();
		bat1.attackTown();
	}
	

}