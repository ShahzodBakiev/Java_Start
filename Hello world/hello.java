public class hello {
    private String brand;
    private String model;
    private int year;
    private double price;

    public hello() {
      this.brand = "";
      this.model = "";
      this.year = 0;
      this.price = 0.0;
    }

    public hello(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void startEngine(){
        System.out.println("Engine started!");
    }

    public void stopEngine(){
        System.out.println("Stop!");
    }

    public static void main(String[] args) {
        hello myhello = new hello("Toyota", "Civic", 2021, 20000.00);

        System.out.println("Brand: " + myhello.getBrand());
        System.out.println("Model: " + myhello.getModel());
        System.out.println("Year: " + myhello.getYear());
        System.out.println("Price: " + myhello.getPrice());

        myhello.startEngine();
        myhello.stopEngine();
    }
}