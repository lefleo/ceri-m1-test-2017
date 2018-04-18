package fr.univavignon.rodeo;

import static org.junit.Assert.*;
import org.junit.*;

import fr.univavignon.rodeo.api.Animal;

public class AnimalTest {

	public static Animal A;
	
	@BeforeClass
	public static void getAnimal(){
		A = new Animal();
	}
	@Test
	public void test(){
		IAnimalTest at = new IAnimalTest();
		A.XP=15;
		at.testXP();
	}
}
