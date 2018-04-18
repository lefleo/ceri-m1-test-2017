package fr.univavignon.rodeo.api;

public class Animal implements IAnimal{

	public String name;
	public int XP;
	public boolean secret;
	public boolean Boss;
	public boolean endangered;
	public boolean caught;
	
	public Animal(){
		this.name="";
		this.XP=0;
		this.secret=false;
		this.Boss=false;
		this.endangered=false;
		this.caught=false;
	}
	
	public Animal(String n, boolean secret,boolean boss, boolean e){
		this.name=n;
		this.XP=0;
		this.secret=secret;
		this.Boss=boss;
		this.endangered=e;
		this.caught=false;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getXP(){
		return this.XP;
	}
	
	public boolean isSecret(){
		return this.secret;
	}
	
	public boolean isBoss(){
		return this.Boss;
	}
	
	public boolean isEndangered(){
		return this.endangered;
	}
}
