
public class Menu {
	private String name;
	private Food foods[];
	//constructor
	public Menu(String name) {
		this.foods = new Food[22];
		this.name = name;
	}
	//adds food returns true if it's possible and false if not.
	public boolean addFood(Food food) {
		for (int i = 0; i < foods.length; i++) {
			if (foods[i] == null) {
				foods[i] = new Food(food);
				return true;
			}
		}
		return false;
	}
	//sets a new name
	public void setName(String name) {
		this.name = name;
	}
	//returns the name
	public String getName() {
		return name;
	}
	public Food[] getFoods() {
		return foods;
	}
	//prints out the information
	public String toString() {
		return "The menu's name is: "+this.name+" The foods: "+this.foods;
	}
	//gets a ing that is missing and prints all the items in the menu that don't have it
	public void missingItem(String f) {
	    for (int i = 0; i < foods.length; i++) {
	        if (foods[i] != null) {
	            boolean found = false;
	            for (int j = 0; j < foods[i].getNoOfIngs(); j++) {
	                if (foods[i].getIngs()[j].equals(f)) {
	                    found = true;
	                    break;
	                }
	            }
	            if (!found) {
	                System.out.println(foods[i].getCode());
	            }
	        }
	    }
	}
}

