package fr.univavignon.rodeo.api;

import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EnvironmentProvider implements IEnvironmentProvider{

	List<Environment> environments;
	
	public EnvironmentProvider(){
		try {
			this.environments=new ArrayList<Environment>();
			BufferedReader br = new BufferedReader(new FileReader("docs/Rodeo Stampede Animals - Animal List.csv"));
			String s=br.readLine();
			int i=1;
			int env=-1;
			while(s!=null && !s.equals("")){
				String[] data = s.split(",");
				if((i%8==1 && i<44)|| i==50){
					String name=data[0];
					int nb=7;
					Environment e = new Environment(name,nb,new ArrayList<Specie>());
					this.environments.add(e);
					env++;
				}else{
					if(data.length>11){
						String spc=data[0];
						Specie esp=new Specie(spc,i,new ArrayList<Animal>());
						for(int j=1;j<11;j++){
							if(!data[j].equals("-")){
								esp.animals.add(new Animal(data[j],false,false,false));
							}
						}
						if(!data[11].equals("-")){
							esp.animals.add(new Animal(data[11],true,false,false));
						}
						if(!data[12].equals("-")){
							esp.animals.add(new Animal(data[12],false,true,false));
						}
						if(!data[13].equals("-")){
							esp.animals.add(new Animal(data[13],false,false,true));
						}
						this.environments.get(env).species.add(esp);
					}
				}
				i++;
				s=br.readLine();
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public List<String> getAvailableEnvironments(){
		List<String> ls = new ArrayList<String>();
		for(int i=0;i<this.environments.size();i++){
			ls.add(this.environments.get(i).getName());
		}
		return ls;
	}
	
	public Environment getEnvironment(String name){
		Environment e=new Environment();
		boolean ok=false;
		for(int i=0;i<this.environments.size();i++){
			if(this.environments.get(i).getName().equals(name)){
				e=this.environments.get(i);
				ok=true;
			}
		}
		if(ok){
			return e;
		}else{
			return null;
		}
		
	}
	
}
