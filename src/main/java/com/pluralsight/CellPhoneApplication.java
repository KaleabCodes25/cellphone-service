package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CellPhone newPhone = new CellPhone();

        System.out.print("What is the serial number?: " );
        int serial = input.nextInt();
        input.nextLine();
        newPhone.setSerial(serial);

        System.out.print("What model is the phone?: ");
        String model = input.nextLine();
        newPhone.setModel(model);

        System.out.print("Who is the carrier?: ");
        String carrier = input.nextLine();
        newPhone.setCarrier(carrier);

        System.out.print("What is the phone number?: ");
        String phoneNumber = input.nextLine();
        newPhone.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone?: ");
        String owner = input.nextLine();
        newPhone.setOwner(owner);

       /* String owner = newPhone.getOwner();
        String model = newPhone.getModel();
        String carrier = newPhone.getCarrier();
        int serialNumber = newPhone.getSerial();
        String newPhoneNumber = newPhone.getPhoneNumber();
*/


        System.out.println("Serial number is: " + newPhone.getSerial());
        System.out.println("Phone model is: " + newPhone.getModel());
        System.out.println("Carrier is : " + newPhone.getCarrier());
        System.out.println("Phone number is: " + newPhone.getPhoneNumber());
        System.out.println("Phone owner is: " + newPhone.getOwner());



    }
}
