package de.telran.homeWorks;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        Ticket ticket1 = new Ticket("Susan Delfino", 5, "Dr.Schneider");
        Ticket ticket2 = new Ticket("Mike Tyson", 7, "Dr.Schneider");
        Ticket ticket3 = new Ticket("Gabriel Solis", 4, "Dr.Peterson");
        Ticket ticket4 = new Ticket("Bree Van de Kamp", 1, "Dr.Schneider");
        Ticket ticket5 = new Ticket("Linette Scavo", 3, "Dr.Peterson");
        Ticket ticket6 = new Ticket("Tom Scavo", 2, "Dr.Schneider");
        Ticket ticket7 = new Ticket("Carl White", 6, "Dr.Peterson");

        Set<Ticket> queue = new TreeSet<>();
        queue.add(ticket1);
        queue.add(ticket2);
        queue.add(ticket3);
        queue.add(ticket7);
        queue.add(ticket4);
        queue.add(ticket6);
        queue.add(ticket5);

        for (Ticket ticket : queue) {
            System.out.println(ticket.getNumber() + ": " + ticket.getName() + ": " + ticket.getDoctor());

        }

    }

}
