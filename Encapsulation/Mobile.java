class Mobile {
    private String brand;
    private int price;

    public void setBrand(String b) {
        brand = b;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(int p) {
        price = p;
    }

    public int getPrice() {
        return price;
    }

    public static void main(String[] args) {
        Mobile m = new Mobile();

        m.setBrand("iPhone 17 Pro Max");
        m.setPrice(189900);

        System.out.println("Brand: " + m.getBrand());
        System.out.println("Price: " + m.getPrice());
    }
}