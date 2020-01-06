package fr.gtm.zoo;

public abstract class Animal {

	private String nom;
	
	public  Animal(String nom) {
			this.setNom(nom);

	}

	public abstract void manger();
	
	
	public abstract void crier();

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
		
		

	
	
	
	
}
