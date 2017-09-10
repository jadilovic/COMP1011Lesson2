package AssigHero;

public class Training {

	public static void main(String[] args) {
		
		// Intantiate first hero
		Hero first = new Hero("Superman");
		
		first.show();
		first.fight();
		
		SuperHero myNew = new SuperHero("BatMan");
		myNew.showPowers();
	}

}
