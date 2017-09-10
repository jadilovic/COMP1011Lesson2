
public class Villan extends Hero {

	// CONSTRUCTOR ++++++++++++++++++++++++++++++++++++++++
	public Villan(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	// PUBLIC METHODS ===================================
	public void steals(){
		System.out.println(this.name + " is stealing!");
	}
	
	public void kills(){
		System.out.println(this.name + " is killing");
	}
}
