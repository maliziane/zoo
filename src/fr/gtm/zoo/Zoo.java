package fr.gtm.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	List<Animal> animaux = new ArrayList<Animal>();
	
	
	public void add(Animal animal) {
		animaux.add(animal);
		
	}
	
	
	public void nourrirTous() {
		for (int i=0;i<animaux.size();i++) {
			animaux.get(i).manger();
		}
		
	}
	
	public void faireCrierTous() {
		for (int i=0;i<animaux.size();i++) {
			animaux.get(i).crier();
		
	}}

}
