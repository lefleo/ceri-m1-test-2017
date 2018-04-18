package fr.univavignon.rodeo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;

import fr.univavignon.rodeo.api.Animal;
import fr.univavignon.rodeo.api.Environment;
import fr.univavignon.rodeo.api.EnvironmentProvider;
import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.Specie;

public class Tests {

	public static Animal A;
	public static Animal B;
	public static Environment E,F;
	public static EnvironmentProvider EP;
	public static Specie S,Z;
	
	@BeforeClass
	public static void init(){
		EP=new EnvironmentProvider();
		E=EP.environments.get(0);
		F=EP.environments.get(1);
		S=(Specie)E.species.get(0);
		Z=(Specie)F.species.get(0);
		A=(Animal)S.animals.get(0);
		B=(Animal)Z.animals.get(Z.animals.size()-1);
	}
	
	@Test
	public void testXP(){
		assertEquals(0,A.getXP());
	}
	
	@Test
	public void testSecret(){
		assertEquals(false,A.isSecret());
		assertEquals(false,B.isSecret());
	}
	
	@Test
	public void testEndangered(){
		assertEquals(false,A.isEndangered());
		assertEquals(false,B.isEndangered());
	}
	
	@Test
	public void testBoss(){
		assertEquals(false,A.isBoss());
		assertEquals(false,B.isBoss());
	}
	
	@Test
	public void testAreas(){
		assertEquals(7,E.getAreas());
	}
	
	@Test
	public void testSpecies(){
		
		assertEquals(7, E.getSpecies().size());
	}
	
	@Test
	public void testArea(){
		assertEquals(1,S.getArea());
	}
	
	@Test
	public void testAnimals(){
		assertEquals(8,S.getAnimals().size());
	}
	
	@Test
	public void TestAvailable(){
		List<String> noms = new ArrayList();
		noms.add("SAVANNAH");
		noms.add("JUNGLE");
		noms.add("MOUNTAIN");
		noms.add("OUTBACK");
		noms.add("TUNDRA");
		noms.add("JURASSIC");
		noms.add("OLYMPUS");
		assertEquals(noms,EP.getAvailableEnvironments());
	}
	
	@Test
	public void TestEnvironment(){
		assertEquals(E,EP.getEnvironment("SAVANNAH"));
	}
}
