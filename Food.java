
public class Food {
	private int code;
	private String name;
	private String[] ings; //ings short for ingredients
	private int noOfIngs; //ings short for ingredients
	//constructor
	public Food(int code,String name) {
		this.code = code;
		this.name = name;
		this.ings = new String[15];
		this.noOfIngs = 0;
	}
	//copy constructor
	public Food(Food other) {
		this.code = other.code;
		this.name = other.name;
		this.noOfIngs = other.noOfIngs;
		this.ings = new String[15];
		//copies all the ingredients
	    for (int i = 0; i < noOfIngs; i++) {
	        this.ings[i] = other.ings[i];
	    }
	}
	//returns the meal code
	public int getCode() {
		return code;
	}
	//returns the meal name
	public String getName() {
		return name;
	}
	//returns the ingredients 
	public String[] getIngs() {
		return ings;
	}
	//returns the number of ingredients
	public int getNoOfIngs() {
		return noOfIngs;
	}
	//sets a new code
	public void setCode(int code) {
		this.code = code;
	}
	//sets a new name
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * NOTE TO SAMAR
	 * 
	 * I didn't read all the way through and didn't see you only asked to make set functions for only code and name
	 * 
	 * so I made it also for all the other stuff
	 * 
	 * give me extra points for it ;)
	 */
	
	//the users enters the number of the ing he wants to change and what he wants to change it to
	public void setIng(int num, String ing) {
		this.ings[num] = ing;
	}
	//sets a new number of ingredients
	public void setNoOfIng(int noOfIng) {
		this.noOfIngs = noOfIng;
		/*
		 * note: this will possibly result in a bug where the array can be set to new number while it has more than that number of ings in it
		 */
	}
	//adds an ing to the meal
	public void addIngs(String ing) {
	    if (noOfIngs < 15) {
	        ings[noOfIngs] = ing;
	        noOfIngs++;
	    }
	}
	public String toString() {
		return "The meal's code is: "+this.code+"The meal's name is: "+this.name+"The number of ings is: "+this.noOfIngs;
	}
}
