package com.codetalksdna.Multithreading;

class BookTheatreSeat {
    int total_seats = 10;

   synchronized public void bookSeat(int seat) {
        if (total_seats >= seat) {
            System.out.println("The Seat has been Booked Successfully");
            total_seats = total_seats - seat;
            System.out.println("Available Seats are::" + " " + total_seats);
        } else {
            System.out.println("Sorry the Seat is full");
            System.out.println("Available Seats Currently are::" + " " + total_seats);
        }
    }
}

public class MovieBookingApplication extends Thread {
    static BookTheatreSeat bookTheatreSeat;
    int seats;

    @Override
    public void run() {
        bookTheatreSeat.bookSeat(seats);
    }

    public static void main(String[] args) {
        bookTheatreSeat=new BookTheatreSeat();
        MovieBookingApplication kavyaSeats = new MovieBookingApplication();
        kavyaSeats.seats = 7;
        kavyaSeats.start();

        MovieBookingApplication niteshSeats = new MovieBookingApplication();
        niteshSeats.seats = 6;
        niteshSeats.start();
    }
}
