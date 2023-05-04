package com.jordan.zookeeper;

public class Mammal {

	private int energyLevel;
	
	public Mammal() {
		
	}
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	 public int displayEnergy() {
		 System.out.println("Energy level: " + energyLevel);
	       return energyLevel;
	 }

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel += energyLevel;
	}
	  
}

