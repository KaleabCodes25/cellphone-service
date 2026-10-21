package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CellPhone newPhone = new CellPhone();

        System.out.print("What is the serial number?: " );
        newPhone.setSerial(input.nextInt());
        input.nextLine();

        System.out.print("What model is the phone?: ");
        newPhone.setModel(input.nextLine());

        System.out.print("Who is the carrier?: ");
        newPhone.setCarrier(input.nextLine());

        System.out.print("What is the phone number?: ");
        newPhone.setPhoneNumber(input.nextLine());

        System.out.print("Who is the owner of the phone?: ");
        newPhone.setOwner(input.nextLine());

        /*String owner = newPhone.getOwner();
        String model = newPhone.getModel();
        String carrier = newPhone.getCarrier();
        int serialNumber = newPhone.getSerial();
        String newPhoneNumber = newPhone.getPhoneNumber();

        System.out.println(owner);
        System.out.println(model);
        System.out.println(carrier);
        System.out.println(serialNumber);
        System.out.println(newPhoneNumber);
*/




    }
}
