package fr.univavignon.rodeo.api;

import java.util.List;

public class GameState implements IGameState {

	public String name;
	public List<Environment> envs;
	public List<Animal> caught;
	public int area;
	public int progress;
	
	public String getName(){
		return this.name;
	}
	
	public void catchAnimal(IAnimal animal) throws IllegalArgumentException, IllegalStateException{
		if(animal==null){
			throw new IllegalArgumentException();
		}else{
			boolean ok=false;
			for(int i=0;i<this.area;i++){
				for(int j=0;j<envs.get(i).getSpecies().size();j++){
					for(int k=0;k<envs.get(i).getSpecies().get(j).getAnimals().size();k++){
						if(envs.get(i).getSpecies().get(j).getAnimals().get(k).getName().equals(animal.getName())){
							ok=true;
						}
					}
				}
			}
			if(!ok){
				throw new IllegalStateException();
			}else{
				Animal a = (Animal)animal;
				this.caught.add(a);
			}
		}
	}
	
	public int getProgression(){
		double prog=this.caught.size()*0.25;
		this.progress=(int)prog;
		return (int)prog;
	}
	
	public void exploreArea(){
		if(this.area<this.envs.size()-1){
			area++;
		}else{
			throw new IllegalStateException();
		}
	}
	
	public SpecieLevel getSpecieLevel(ISpecie s){
		Specie sp = (Specie)s;
		if(s==null){
			throw new IllegalArgumentException();
		}else{
			return sp.level;
		}
	}
}
