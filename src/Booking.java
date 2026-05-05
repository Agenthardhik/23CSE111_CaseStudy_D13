class Booking {
    private int seat1, seat2, seat3;
    private Movie movie;
    private SnackOrder snackOrder;

    public Booking(Movie movie, int s1, int s2, int s3) {
        this.movie = movie;
        this.seat1 = s1;
        this.seat2 = s2;
        this.seat3 = s3;
        this.snackOrder = new SnackOrder();
    }

    public SnackOrder getSnackOrder() {
        return snackOrder;
    }

    public double calculateTotal() {
        double seatCost = 3 * 150; // fixed seat cost
        return seatCost + snackOrder.calculateSnackTotal();
    }

    public void generateTicket() {
        System.out.println("\n------ TICKET ------");
        System.out.println(movie.getDetails());
        System.out.println("Seats: " + seat1 + ", " + seat2 + ", " + seat3);
        System.out.println("Snacks:");
        snackOrder.showSnacks();
        System.out.println("Total Amount: ₹" + calculateTotal());
    }
}
