package fr.gtm.zoo;

public class Lion extends Animal{

	public Lion(String nom) {
		super(nom);
	}

	@Override	
	public void manger() {
		System.out.println("Le lion "+this.getNom()+" mange tout ce qui bouge");
	}
	
	@Override
	public void crier() {
		System.out.println("Le lion "+this.getNom()+" rugit rrrrrrrr");
	}
}
