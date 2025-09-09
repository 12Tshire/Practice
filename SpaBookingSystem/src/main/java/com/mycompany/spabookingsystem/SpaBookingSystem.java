/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.spabookingsystem;

/**
 *
 * @author DYICT
 */
// Abstract base class representing a general spa service
abstract class SpaService {

    protected String customerName;
    protected double price;

    public SpaService(String customerName, double price) {
        this.customerName = customerName;
        this.price = price;
    }

    // Polymorphic method to be implemented by subclasses
    public abstract void bookService();
}

// Massage service subclass
class MassageService extends SpaService {

    private String massageType;
    private String appointmentTime;

    public MassageService(String customerName, String massageType, String appointmentTime, double price) {
        super(customerName, price);
        this.massageType = massageType;
        this.appointmentTime = appointmentTime;
    }

    @Override
    public void bookService() {
        System.out.println("WELCOME TO BEAUTY SPA BOTIQUE");
        System.out.println(" Massage Booking Confirmed for " + customerName);
        System.out.println("Type: " + massageType);
        System.out.println("Time: " + appointmentTime);
        System.out.println("Price: R" + price);
    }
}

// Facial service subclass
class FacialService extends SpaService {

    private String facialType;

    public FacialService(String customerName, String facialType, double price) {
        super(customerName, price);
        this.facialType = facialType;
    }

    @Override
    public void bookService() {
        System.out.println("Facial Booking Confirmed for " + customerName);
        System.out.println("Type: " + facialType);
        System.out.println("Price: R" + price);
    }
}

// Sauna service subclass
class SaunaService extends SpaService {

    private int durationMinutes;

    public SaunaService(String customerName, int durationMinutes, double price) {
        super(customerName, price);
        this.durationMinutes = durationMinutes;
    }

    @Override
    public void bookService() {
        System.out.println(" Sauna Booking Confirmed for " + customerName);
        System.out.println("Duration: " + durationMinutes + " minutes");
        System.out.println("Price: R" + price);
    }
}

// Main class to demonstrate polymorphism
public class SpaBookingSystem {

    public static void main(String[] args) {
        // Array of different spa services
        SpaService[] bookings = {
            new MassageService("Thabo", "Deep Tissue", "10:30", 500.00),
            new FacialService("Naledi", "Hydrating Facial", 350.00),
            new SaunaService("Kabelo", 45, 300.00)
        };

        // Polymorphic booking confirmation
        for (SpaService service : bookings) {
            service.bookService();
            System.out.println("---------------------------");
        }
    }
}
