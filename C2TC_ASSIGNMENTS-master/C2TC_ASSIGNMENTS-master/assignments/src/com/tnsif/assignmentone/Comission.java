package com.tnsif.assignmentone;

import java.util.Scanner;

public class Comission {
	 String name;
	 String address;
	 String phone;
	 double salesAmount;
	 
	 public void acceptDetails() {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Name: ");
	        name = sc.nextLine();

	        System.out.print("Enter Address: ");
	        address = sc.nextLine();

	        System.out.print("Enter Phone: ");
	        phone = sc.nextLine();

	        System.out.print("Enter Sales Amount: ");
	        salesAmount = sc.nextDouble();
	       
	}
	 
	public double calculateCommission(double saleAmout) {
		double commission = 0;
		if (salesAmount >= 100000) {
            return commission = salesAmount * 0.10;
        } else if (salesAmount >= 50000) {
            return commission = salesAmount * 0.05;
        } else if (salesAmount >= 30000) {
            return commission = salesAmount * 0.03;
        } 
		return commission;
		
	}
	
	@Override
	public String toString() {
		acceptDetails();
		return "name=" + name + ", address=" + address + ", phone=" + phone + ", salesAmount=" + salesAmount
				+ ", commission=" + calculateCommission(salesAmount);
	}
	
	

}