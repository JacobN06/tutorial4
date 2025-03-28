import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;
    private String email;
    private ArrayList<Event> reservationList = new ArrayList<>();

    // getters and setters
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<Event> getReservationList() {
        return reservationList;
    }

    // first time user
    Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // loyal customer ig
    Customer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    public void addToReservationList(Event event) {
        System.out.println();
        System.out.println("Adding to Reservation List");
        reservationList.add(event);
        event.reserve1Seat();
        System.out.println("Reservation has been added to the list");
        System.out.println("Added event: ");
        System.out.println(event.eventInfo(event));
        System.out.println();
    }
    public void removeFromReservationList(Event event) {
        reservationList.remove(event);
        event.unreserve1Seat();
        System.out.println("Reservation has been removed from the list");
        System.out.println("Removed event: ");
        System.out.println(event.eventInfo(event));
        System.out.println();
    }
}

