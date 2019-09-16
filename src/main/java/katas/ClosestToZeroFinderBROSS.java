package katas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class ClosestToZeroFinder {
	public static Scanner userInput = new Scanner(System.in);
	ClosestToZeroFinder usersList = new ClosestToZeroFinder();
	
	public static void main(String[] args) {
		System.out.println("Welcome to my Closest To Zero Finder App! \n");
		System.out.println("Please enter the integers that you would like to evaluate:\n" + "Type \"Evaluate\" when all integers are entered.\n");
		System.out.println("First int: ");
		String userInt = userInput.nextLine().trim().toLowerCase();
		
		if(userInt == "evaluate") {
			System.out.println("You have not entered any values.\nNow exiting application.");
			System.exit(0);
		}else {
			usersList.addUserIntToDataSet(userInt);
		}
		
		
	}

	private void addUserIntToDataSet(String userInt) {
		int enterThis;
		try {
			enterThis = Integer.parseInt(userInt);
		}catch (NumberFormatException e) {
			enterThis = 0;
		}
		
	}

	public int findClosestToZero(List<Integer> integers) {
		return 1;
	}

	public List<Integer> sortData(List<Integer> enteredData) {
		Collections.sort(enteredData);
		List<Integer> sortedList = enteredData;
		return sortedList;
	}

	public int closestToZero(List<Integer> testData) {
		int thisOne = testData.get(0);
		for (int i=0; i < (testData.size()-1); i++) {
			if(Math.abs(thisOne) >= Math.abs(testData.get(i+1))) {
				thisOne = testData.get(i+1);
			}
		}
		return thisOne;
	}

	
	public List<Integer> addUserIntToDataSet() {
		int userInt1 = 4;
		int userInt2 = 2;
		int userInt3 = -1;
		int userInt4 = 3;
		List<Integer> userData = new ArrayList<>();
		userData.add(userInt1);
		userData.add(userInt2);
		userData.add(userInt3);
		userData.add(userInt4);
		
		return userData;
	}

}
