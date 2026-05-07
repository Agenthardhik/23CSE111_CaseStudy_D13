package oops;

class Snack {
    private String name;
    private double price;

    
    public Snack(String name, double price) {
        this.name = name;
        this.price = price;
    }

    
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class SnackOrder {
    private Snack snack1, snack2;
    private int qty1, qty2;

   
    public void addFirstSnack(Snack s, int q) {
        snack1 = s;
        qty1 = q;
    }

    
    public void addSecondSnack(Snack s, int q) {
        snack2 = s;
        qty2 = q;
    }

    
    public double calculateSnackTotal() {
        double total = 0;

        if (snack1 != null) {
            total += snack1.getPrice() * qty1;
        }

        if (snack2 != null) {
            total += snack2.getPrice() * qty2;
        }

        return total;
    }

    
    public void showSnacks() {
        if (snack1 != null) {
            System.out.println(snack1.getName() + " x " + qty1);
        }

        if (snack2 != null) {
            System.out.println(snack2.getName() + " x " + qty2);
        }
    }
}
