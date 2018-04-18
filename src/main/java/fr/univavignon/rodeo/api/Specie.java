package fr.univavignon.rodeo.api;

import java.util.List;

public class Specie implements ISpecie {

	public String name;
	public int Area;
	public List<IAnimal> animals;
	public SpecieLevel level;
	
	public Specie(){
		this.name="";
		this.Area=0;
		this.animals=null;
		this.level=SpecieLevel.NOVICE;
	}
	
	public Specie(String name, int area, List<IAnimal> animals){
		this.name=name;
		this.Area=area;
		this.animals=animals;
		this.level=SpecieLevel.NOVICE;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getArea(){
		return this.Area;
	}
	
	public List<IAnimal> getAnimals(){
		return this.animals;
	}
}
