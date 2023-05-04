package com.jordan.zookeeper;

public class Gorilla extends Mammal{
	
	
	public Gorilla(){
		
	}
	
	public Gorilla(int energyLevel) {
		// TODO Auto-generated constructor stub
		super(energyLevel);
	}

	public void throwSomething() {
	     this.setEnergyLevel(-5);
	     System.out.println("Gorilla has thrown something " + this.getEnergyLevel());
	}
	
	public void eatBananas() {
		this.setEnergyLevel(10);
		System.out.println("Gorillas satisfaction " + "Energy level: " + this.getEnergyLevel());
	}
	
	public void climb() {
		this.setEnergyLevel(-10);
		System.out.println("Gorrilla climb a tree " + "Energy level: " + this.getEnergyLevel());
	}
	
	
}
