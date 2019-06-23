public class Truck extends Car {

    public String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Truck(String brand, int model, int door,  String color) {
        super(brand, model, door);
        this.color=color;
    }

    @Override
    public String toString() {
        return "Truck{" +"brand='" + brand + '\'' +
                ", model=" + model +
                ", door=" + door +
                "color='" + color + '\'' +
                '}';
    }

    public Truck() {
    }


}
