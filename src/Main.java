public class Main {
    public static void main(String[] args) {

        Movie movie = new Movie("Inception", "Sci-Fi", 148, "English");

        Snack popcorn = new Snack("Popcorn", 120);
        Snack coke = new Snack("Coke", 80);

        Customer customer = new Customer("Hardhik");

        Booking booking = new Booking(movie, 5, 6, 7);

        booking.getSnackOrder().addFirstSnack(popcorn, 2);
        booking.getSnackOrder().addSecondSnack(coke, 1);

        customer.createBooking(booking);

        customer.viewBooking();
    }
}