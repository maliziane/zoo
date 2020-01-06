package fr.gtm.zoo;

public class Chat extends Animal{

	public Chat(String nom) {
		super(nom);
	}

@Override
public void manger() {
System.out.println("Le chat "+this.getNom()+" mange des croquettes");
	}
	
@Override
public void crier() {
System.out.println("Le chat "+this.getNom()+" miaule miaawww");
	}
}
