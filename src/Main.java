public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Event e1 = new Event("remote meeting",20);
        System.out.println(e1.getLocation());
        Customer customer1 = new Customer("Magda","Nowak");
        customer1.addToReservationList(e1);
    }

}