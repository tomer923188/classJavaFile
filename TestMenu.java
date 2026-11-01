
public class TestMenu {
	//gets a menu and finds the items with the most ings
	public static void maxIngs(Menu[] menu) {
		int max = 0;
		int counter = 0;
		for (int i = 0; i < menu.length; i++) {
			Food[] foods = menu[i].getFoods();
			if (foods[i].getNoOfIngs() > max) {
				max = foods[i].getNoOfIngs();
			}
		}
		for (int i = 0; i < menu.length; i++) {
			Food[] foods = menu[i].getFoods();
			for (int j = 0;j < foods.length; j++) {
				if (foods[j] != null && foods[j].getNoOfIngs() == max) {
					System.out.println("Code: "+foods[j].getCode());
					System.out.println("Name: "+foods[j].getName());
					counter++;
				}
			}
			System.out.println("There are: "+counter+" items with the biggest amount of numbers");
		}
		System.out.println("the max is: "+max);
	}
	//creates 10 menus
	public static Menu[] makes10Menus() {
		Menu[] menus = new Menu[10];
		for (int i = 0; i < menus.length; i++) {
			menus[i] = new Menu("Menu " + (i + 1));
		}
		return menus;
	}

	public static void main(String[] args) {
		//testing all the functions I made up until now
		Menu menu = new Menu("Restraunt Menu");
		Food steak = new Food(417, "ribeye steak");
		steak.addIngs("meat");
		steak.addIngs("salt");
		menu.addFood(steak);
		menu.setName("newMenu");
		menu.getName();
		menu.toString();
		menu.missingItem("meat"); //this will return false
	}

}
