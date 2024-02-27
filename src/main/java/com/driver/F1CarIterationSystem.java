package com.driver;

import java.util.Scanner;

public class F1CarIterationSystem {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        F1CarCollection collection = new F1CarCollection();

	        System.out.println("Enter number of F1 cars to add:");
	        int numOfCars = scanner.nextInt();
	        scanner.nextLine();

	        for (int i = 0; i < numOfCars; i++) {
	            System.out.println("Enter car name:");
	            String carName = scanner.nextLine();

	            System.out.println("Enter speed:");
	            double speed = scanner.nextDouble();

	            System.out.println("Enter number of races won:");
	            int racesWon = scanner.nextInt();
	            scanner.nextLine();

	            collection.addCar(new F1Car(carName, speed, racesWon));
	        }

	        System.out.println("Enter speed threshold to display cars:");
	        double threshold = scanner.nextDouble();

	        System.out.println("Cars with speed above " + threshold + " are:");
	        for (F1Car car : collection) {
	            if (car.getSpeed() > threshold) {
	                System.out.println(car.getCarName());
	            }
	        }
	    }
}
