package com.constructorAllTopic;

public class GameProject {
    public static void main(String[] args) {
        // Scenario 1: Basic Warrior (using this() chaining)
        Warrior player1 = new Warrior("Aragon");
        
        // Scenario 2: Boss Warrior (using super())
        Warrior boss = new Warrior("Dark Knight", 500, "Axe");

        // Scenario 3: Cloning the Boss (Copy Constructor)
        Warrior bossMinion = new Warrior(boss);
        bossMinion.name = "Dark Knight Minion"; // Modify the copy
        
        player1.showStats();
        bossMinion.showStats();
    }
}

//PARENT CLASS
class BaseCharacter {
	 String name;
	 int health;
	
	 // Parent Constructor
	 BaseCharacter(String name, int health) {
	     this.name = name;
	     this.health = health;
	     System.out.println("> Base Stats Loaded for: " + name);
	 }
}

//CHILD CLASS
class Warrior extends BaseCharacter {
	 String weapon;
	 int armor;
	
	 // 1. Constructor Overloading & Chaining (this)
	 Warrior(String name) {
	     // Chains to the constructor below with default health 100 and weapon "Sword"
	     this(name, 100, "Rusty Sword"); 
	 }
	
	 // 2. Main Constructor using 'super'
	 Warrior(String name, int health, String weapon) {
	     super(name, health); // Must be the first line!
	     this.weapon = weapon;
	     this.armor = 50; // Default armor
	     System.out.println("> Warrior Class Assigned.");
	 }
	
	 // 3. Copy Constructor (To clone enemies)
	 Warrior(Warrior target) {
	     super(target.name, target.health); // Copying parent data
	     this.weapon = target.weapon;
	     this.armor = target.armor;
	     System.out.println("> [System] Character Cloned Successfully.");
	 }
	
	 void showStats() {
	     System.out.println("Name: " + name + " | Health: " + health + " | Weapon: " + weapon);
	 }
}
















