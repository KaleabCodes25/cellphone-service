package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CellPhone cellPhone1 = new CellPhone();

        System.out.print("What is the serial number?: " );
        int serial = input.nextInt();
        input.nextLine();
        cellPhone1.setSerial(serial);

        System.out.print("What model is the phone?: ");
        String model = input.nextLine();
        cellPhone1.setModel(model);

        System.out.print("Who is the carrier?: ");
        String carrier = input.nextLine();
        cellPhone1.setCarrier(carrier);

        System.out.print("What is the phone number?: ");
        String phoneNumber = input.nextLine();
        cellPhone1.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone?: ");
        String owner = input.nextLine();
        cellPhone1.setOwner(owner);

        System.out.println("\nCellPhone Details:");
        System.out.println("Serial Number: " + cellPhone1.getSerial());
        System.out.println("Model: " + cellPhone1.getModel());
        System.out.println("Carrier: " + cellPhone1.getCarrier());
        System.out.println("Phone Number: " + cellPhone1.getPhoneNumber());
        System.out.println("Owner: " + cellPhone1.getOwner());
    }

}
