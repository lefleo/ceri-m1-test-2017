package fr.univavignon.rodeo.api;

import java.util.List;

public class GameState implements IGameState {

	public String name;
	public List<Environment> envs;
	public int area;
	public int progress;
	
	public String getName(){
		return this.name;
	}
	
	public void catchAnimal(Animal animal) throws IllegalArgumentException, IllegalStateException{
		if(animal==null){
			throw new IllegalArgumentException();
		}else{
			boolean ok=false;
			for(int i=0;i<this.area;i++){
				for(int j=0;j<envs.get(i).getSpecies().size();j++){
					for(int k=0;k<envs.get(i).getSpecies().get(j).animals.size();k++){
						if(envs.get(i).getSpecies().get(j).animals.get(k).getName().equals(animal.getName())){
							ok=true;
						}
					}
				}
			}
			if(!ok){
				throw new IllegalStateException();
			}else{
				animal.caught=true;
			}
		}
	}
	
	public int getProgression(){
		double prog=0.0;
		for(int i=0;i<=this.envs.size();i++){
			for(int j=0;j<envs.get(i).getSpecies().size();j++){
				for(int k=0;k<envs.get(i).getSpecies().get(j).animals.size();k++){
					if(envs.get(i).getSpecies().get(j).animals.get(k).caught==true){
						prog+=0.25;
					}
				}
			}
		}
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
	
	public SpecieLevel getSpecieLevel(Specie s){
		if(s==null){
			throw new IllegalArgumentException();
		}else{
			return s.level;
		}
	}
}
