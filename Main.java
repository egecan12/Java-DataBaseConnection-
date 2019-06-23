import java.sql.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Car car1 = new  Car("mercedes",1998,4) ;

        Car car2 = new  Car("mercedes",1998,4) ;

        Car car3 = new  Car() ;



        String s1 = new String("egecan");
         String s2 = new String("egecan");



        if(s1.equals(s2)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }


        car2.modelYenileme(2002);

        Truck truck1 = new Truck("dodge",2010,2,"blue");

        Truck truck2 = new Truck("dodge",2010,2,"red");




        try{


        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root","");
            System.out.println("baglanti basarili");



            Scanner input = new Scanner(System.in);
            System.out.println("Enter Car brand: ");
            String carBrand = input.nextLine();
            System.out.println("Enter Car model: ");
            int carModel = input.nextInt();
            input.nextLine();   //why ????
            System.out.println("Enter Car door number: ");
            int carDoor = input.nextInt();
            input.nextLine();   //why ????

            System.out.println(carBrand+" "+carModel+" "+carDoor);

            System.out.printf("first value is '%s', next value is " +
                            "'%d', last value is '%d'%n",
                    carBrand, carModel, carDoor);

            Statement statement = connection.createStatement();

            String sql = String.format("INSERT INTO `cars` " +
                            "(`brand`,`model`, `door`) " +
                            "VALUES ('%s', %d, %d)",
                    carBrand, carModel, carDoor);

            System.out.println(sql);// to see the query

            int numRowsAffected = statement.executeUpdate(sql);

            System.out.println("Number of rows affected = " + numRowsAffected);  // to see how many rows has been effected



            connection.close();

        }

        catch(java.sql.SQLException e){
            System.out.println("baglanti hatasi");
        }




















    }
}
