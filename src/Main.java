public class Main {
    public static void main(String[] args) {
        ReservationSystem reservationSystem = new ReservationSystem();
        //events
        Event e1 = new Event("remote meeting",20);
        Event e2 = new Event("Metalica concert",200,"August 24th","Stadion Narodowy");
        System.out.println(e1.getLocation());
        System.out.println(e2.getLocation());
        System.out.println();
        //adding events to list
        reservationSystem.addEventToTotalList(e1);
        reservationSystem.addEventToTotalList(e2);
        System.out.println();
        //customers
        Customer customer1 = new Customer("Magda","Nowak");
        Customer customer2 = new Customer("matthew","Nowak","matnowak@gmail.com");
        reservationSystem.addCustomerToTotalList(customer1);
        reservationSystem.addCustomerToTotalList(customer2);
        System.out.println();
        // making reservations
        reservationSystem.makeReservation(customer1,e1);
        reservationSystem.makeReservation(customer2,e1);
        reservationSystem.makeReservation(customer1,e2);
        System.out.println();
        // display customers reservations
        System.out.println(customer1.getReservationList());
        System.out.println();
        // find an event that exists and one that does not exist
        reservationSystem.findEvent("spiderman");
        reservationSystem.findEvent("Metalica concert");
        System.out.println();
        //find a customer that exists and one that does not exist
        reservationSystem.findCustomer("Magda","Nowak");
        reservationSystem.findCustomer("daniel","Nowak");
        reservationSystem.findCustomer("Spider","man");
        System.out.println();
        // change an event
        reservationSystem.changeEventPrice("remote meeting",30);
        customer1.displayReservationList();
        System.out.println();
        // customer cancels reservation
        customer2.removeFromReservationList(e2);
        System.out.println("seats available at e2: " + e2.getAvailableSeats());
        // checking seats for other concert
        System.out.println("seats available at e1: " + e1.getAvailableSeats());
        System.out.println();

    }

}