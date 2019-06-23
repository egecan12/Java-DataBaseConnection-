public class Car {

    public  String brand ;
    public  int model;
    public  int door;

    public Car(String brand, int model, int door) {
        this.brand = brand;
        this.model = model;
        this.door = door;
    }

    public Car(){
        this.brand = "belirsiz";
        this.model = 0000;
        this.door = 0000;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                ", door=" + door +
                '}';
    }


    public void modelYenileme(int model){

        this.model=model;
        System.out.println("arabaniz "+model+"model olmustur");
    }









}
