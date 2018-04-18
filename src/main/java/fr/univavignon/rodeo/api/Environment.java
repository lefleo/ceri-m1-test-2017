package fr.univavignon.rodeo.api;

import java.util.List;

public class Environment implements IEnvironment {

	public String name;
	public int nbAreas;
	public List<Specie> species;
	
	public Environment(){
		this.name="";
		this.nbAreas=0;
		this.species=null;
	}
	
	public Environment(String n, int nb, List<Specie> spc){
		this.name=n;
		this.nbAreas=nb;
		this.species=spc;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAreas(){
		return this.nbAreas;
	}
	
	public List<Specie> getSpecies(){
		return this.species;
	}
	
}
