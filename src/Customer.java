class Customer {
    private String name;
    private Booking booking;

    public Customer(String name) {
        this.name = name;
    }

    public void createBooking(Booking b) {
        booking = b;
    }

    public void viewBooking() {
        System.out.println("\nBooking for " + name);
        booking.generateTicket();
    }
}