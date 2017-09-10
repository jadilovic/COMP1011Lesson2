//Author: Jasmin Adilovic
//
package AssigHero;

public class Hero {

	// PRIVATE +++++++++++++++++++++++++++++++++++
	private int strength;
	private int speed;
	private int health;
	
	//PUBLIC +++++++++++++++++++++++++++++++++++++++++++++++
	public String name;
	
	//CONSTRUCTOR +++++++++++++++++++++++++++++++++++++++
	public Hero(String name){
		this.name = name;
		generateAbilities();
	}

	// PRIVATE METHODS ++++++++++++++++++++++++++++++++++++
	private void generateAbilities() {
		this.strength = (int)(Math.random()*100+1);
		this.speed = (int)(Math.random()*100+1);
		this.health = (int)(Math.random()*100+1);
	}
	
	// PUBLIC METHODS +++++++++++++++++++++++++++++++++++++++
	public void fight(){
		if(hitAttempt()){
			System.out.println(this.name + " created " + hitDamage() + " damage");
		}
	}
	
	public void show(){
		System.out.println(this.name + " ability scores:");
		System.out.println("Strength: " + this.strength);
		System.out.println("Speed: " + this.speed);
		System.out.println("Health: " + this.health);
	}

	// PRIVATE METHODS +++++++++++++++++++++++++++++++++++++++
	private int hitDamage() {
		int damage = this.strength * (int)(Math.random()*6+1);
		return damage;
	}

	private boolean hitAttempt() {
		int random = (int)(Math.random()*10+1);
		if(random>2)
		return false;
		else
			return true;
	}
	
}
