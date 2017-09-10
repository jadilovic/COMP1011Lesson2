
package AssigHero;
/**
 * @author Jasmin Adilovic
 * Date last modified: 10.09.2017.
 * Program description: Implement the SuperHero Class, Assignment #2
 * Revisions History: 3
 *
 */
public class SuperHero extends Hero {

	// PRIVATE VARIABLES +++++++++++++++++++++++++++++++
	private String[] superPowers = new String[3];
	private String[] powerList = {"Super Speed", "Super Strength", "Body Armor", "Flight", "Fire Generation", "Weather Control"};
	
	
	// CONSTRUCTOR +++++++++++++++++++++++++++++++++++++++
	public SuperHero(String name) {
		super(name);
		
		generateRandomPowers();
	}
	
	// METHODS ++++++++++++++++++++++++++++++++++++++++
	public void generateRandomPowers(){
		for(int i = 0; i < 3; i++){
				superPowers[i] = selectPowers();
		}
	}
	
	public void showPowers(){
		for(int i = 0; i < 3; i++){
			System.out.println(this.superPowers[i]);
		}
	}
	
	public String selectPowers(){
		String temp = "X";
			int random;
			do{
				random = (int)(Math.random()*6);
		}while(powerList[random] == null);
			temp = powerList[random];
			powerList[random] = null;
		return temp;
	}

}
