import java.util.Scanner;


    public class Car {
        public static void main(String[] args) {
            Scanner object=new Scanner(System.in);
            System.out.println("rangini kirting");
            String rang =object.next();

            System.out.println("Modeli");
            String model=object.next();

            System.out.println("Narxi");
            String narxi=object.next();

            System.out.println("Tuzilmasi nima");
            String tuzilma=object.next();

            Car car=new Car();
            car.Rang(rang);
            car.Model(model);
            car.Narxi(narxi);
            car.Tuzilmasi(tuzilma);

        }
        public void Rang (String rang){
            System.out.println(rang);
        }

        public void Model (String model){
            System.out.println(model);
        }

        public void Narxi (String narxi){
            System.out.println(narxi);
        }

        public void Tuzilmasi (String tuzilma){
            System.out.println(tuzilma);
        }


}
