
public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hero sup = new Hero("Superman");
		sup.showAbilities();
		
		// Instantiate Hero
		Hero hero = new Hero("Big Man");
		hero.fight();
		hero.run();
		hero.showAbilities();
		System.out.println(hero.getHealth());
	
		// Instantiate Villan
		
		Villan villan = new Villan("Sly Man");
		villan.run();
		villan.steals();
		villan.showAbilities();
		
		// Instantiate Vigilante
		Vigilante vigilante = new Vigilante("Ms Savage");
		vigilante.run();
		vigilante.run();
		vigilante.steals();
		vigilante.dealsJustice();
		vigilante.showAbilities();
		
	}

}
