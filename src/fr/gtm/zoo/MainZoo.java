package fr.gtm.zoo;

public class MainZoo {

	
	public static void main(String[] args) {

		Zoo zoo= new Zoo();
		Animal a1 = new Chat("Biquette");
		Animal a2 = new Chien("Norbert");
		Animal a3 = new Lion("Simba");
		Animal a4 = new Lion ("Nala");
		Animal a5 = new Chien ("Hector");
		
		zoo.add(a1);
		zoo.add(a2);
		zoo.add(a3);
		zoo.add(a4);
		zoo.add(a5);
	
		System.out.println("Nourrissage:");
		zoo.nourrirTous();
		System.out.println("===================================================================");
		System.out.println("Concert:");
		zoo.faireCrierTous();
	}

}
