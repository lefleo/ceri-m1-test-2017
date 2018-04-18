package fr.univavignon.rodeo.api;

import java.util.List;

public class teste {

	public static void main(String[] args) {
		EnvironmentProvider ep = new EnvironmentProvider();
		List<String> ls = ep.getAvailableEnvironments();
		for(int i=0;i<ls.size();i++){
			System.out.println(ls.get(i));
			for(int j=0;j<ep.environments.get(i).species.size();j++){
				String s=ep.environments.get(i).species.get(j).getName();
				int nb=ep.environments.get(i).species.get(j).getAnimals().size();
				System.out.println(s+" : "+nb+" animaux");
			}
		}
	}

}
