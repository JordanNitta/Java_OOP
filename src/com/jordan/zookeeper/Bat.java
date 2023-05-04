package com.jordan.zookeeper;

public class Bat extends Mammal{


	public Bat() {
		super(300);
	}
//	Create a Bat class that can fly(), eatHumans(), and attackTown() 
//and has a default energy level of 300.
	public void fly() {
		this.setEnergyLevel(-50);
		System.out.println("Bat is flying " + "Energy Level: " + this.getEnergyLevel());
	}
	
	public void eatHumans() {
        this.setEnergyLevel(25);
        System.out.println("Bat is eating humans " + "Energy Level: " + this.getEnergyLevel());
    }
	
	 public void attackTown() {
		 this.setEnergyLevel(25);
	     System.out.println("Bat is attacking the town retreat " + "Energy Level: " + this.getEnergyLevel());
	 }
}

