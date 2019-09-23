package com.skilldistillery.foodTruckProject;

import java.util.Scanner;

public class FoodTruckApp {

	FoodTruck [][] truckList = new FoodTruck[4][3];
	

	public static void main(String[] args) {

		Scanner kb = new Scanner (System.in);
		System.out.println("Enter Food Truck Name: ");
		String name = kb.next();
		System.out.println("Enter Food that the Food Truck provides: ");
		String food = kb.next();
		System.out.println("Enter Food Truck Rating between '1' and '5'");
		int rating = kb.nextInt();
//		{
//			if (rating > 5) {
//				rating = 5;
//				System.out.println("Please Re-Enter a Rating between '1' and '5':");
//				int rating2 = kb.nextInt();
//				rating = rating2;
//		}

//		public listingOfTrucks {
//			int i;
//			rating = truckList[0]
//					for (i=0; i<=5; i++) {
//						if (rating[i] > max) max = rating [i];
//					}
//			System.out.println("\n\n This is the Rating for the Food Trucks: " + truckList[i]);
//			
//			}
//		}
		
		
		//
//		public boolean topRating = false;
//		
//		{
//			if (rating < 6) {
//				System.out.println("Please Enter a Rating between '1' and '5'");
//				boolean = true;
//			{
//		{

		FoodTruck fTruck = new FoodTruck (name, food, rating);		
		System.out.println(fTruck);
		kb.close();
	}
	

}	
	

