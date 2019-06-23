import java.sql.*;

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


        System.out.println(truck1);

        try{


        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_db", "root","");
            System.out.println("baglanti basarili");


        }

        catch(java.sql.SQLException e){
            System.out.println("baglanti hatasi");
        }




















    }
}
