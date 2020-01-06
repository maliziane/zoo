package fr.gtm.zoo;

public class Chien extends Animal {

	public Chien(String nom) {
		super(nom);
	}

	@Override
	public void manger() {
		System.out.println("Le chien "+this.getNom()+" mmange du paté");
	}
	
	@Override
	public void crier() {
		System.out.println("Le chien "+this.getNom()+" aboie ouaff!!");
	}
}
