package com.main;

import java.util.Scanner;
import com.dao.HospitalDao;

public class MainClass {

	public static void main(String[] args) {

		HospitalDao hospitalDao = new HospitalDao();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Please select an operation:");
			System.out.println("1. Insert data of patient");
			System.out.println("2. Update data of patient");
			System.out.println("3. Delete data of patient");
			System.out.print("Enter your choice (1/2/3): ");
			String input = scanner.nextLine();

			switch (input) {
			case "1":
				System.out.println("Insert data of patient");
				System.out.print("Enter patient name: ");
				String name = scanner.nextLine();
				System.out.print("Enter patient age: ");
				int age = Integer.parseInt(scanner.nextLine());
				System.out.print("Enter patient address: ");
				String address = scanner.nextLine();
				hospitalDao.insertData(name, age, address);
				return;
			case "2":
				System.out.println("Update data of patient");
				System.out.print("Enter patient ID: ");
				int idToUpdate = Integer.parseInt(scanner.nextLine());
				System.out.print("Enter patient name: ");
				String nameToUpdate = scanner.nextLine();
				System.out.print("Enter patient age: ");
				int ageToUpdate = Integer.parseInt(scanner.nextLine());
				System.out.print("Enter patient address: ");
				String addressToUpdate = scanner.nextLine();
				hospitalDao.updateData(idToUpdate, nameToUpdate, ageToUpdate, addressToUpdate);
				return;
			case "3":
				System.out.println("Delete data of patient");
				System.out.print("Enter patient ID to delete: ");
				int id = Integer.parseInt(scanner.nextLine());
				hospitalDao.deleteData(id);
				return;
			default:
				System.out.println("Please provide a valid operation: insert, update, or delete.");
			}
			System.out.println();
			System.out.println("Do you want to perform another operation? (yes/no)");
			String continueInput = scanner.nextLine();
			if (!continueInput.equalsIgnoreCase("yes")) {
				System.out.println("Exiting the application.");
				scanner.close();
				return;
			}
		}
	}
}
