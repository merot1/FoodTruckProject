package com.skilldistillery.foodTruckProject;
//Scanner kb = new Scanner(System.in);


public class FoodTruck {
	private int id;
	private String name;
	private String food;
	private int rating;
	
	private int nextId = 1;

	public FoodTruck() {
		super();
		this.id = nextId;
		nextId++;
	}

	public FoodTruck(String name, String food, int rating) {
		super();
		this.name = name;
		this.food = food;
		this.rating = rating;
		this.id = nextId;
		nextId++;
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getNextId() {
		return nextId;
	}

	public void setNextId(int nextId) {
		this.nextId = nextId;
	}

	@Override
	public String toString() {
		return "FoodTruck [id=" + id + ", name=" + name + ", food=" + food + ", rating=" + rating + "]";
	}	
	
}

//public static void main(Static [] args) {
//	String [] foodTrucks = n
//		 for (int i = 0; i < foodTrucks.length; i++);
//	if (i !=  0 && i != foodTrucks.length -1) {
//		System.out.println(fTruck);
//	}
//}


//public void displayFoodTruck(Scanner kb) {
//
//System.out.println("Choose which Food Truck you want to display.  Choose 1,2,3,4 or 5.");
//
//
//String i = kb.next();
//		
//switch(i) {
//{
//
//		case "1":
//				System.out.println(FoodTruck1);
//				break;				
//		case "2":
//				System.out.println(FoodTruck2);
//				break;			
//		case "3":
//				System.out.println(FoodTruck3);
//				break;
//						
//		case "4":
//				System.out.println(FoodTruck4);
//				break;
//						
//		case "5":
//				System.out.println(FoodTruck5);
//				break;
//		default:
//			    System.out.println("Choose between 1 and 5");
//			    
//	}
//	
//}
//}
//}



