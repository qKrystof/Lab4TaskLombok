public class Main {

    public static void main(String[] args) {


        Car car = new Car("911 Carrera", "Porsche", 2022, 688_000.0, "Red", 10);
        Car car2 = new Car("Cayenne", "Porsche", 2024, 446_000.0, "Black", 10);

        System.out.println(car);
        System.out.println(car2);
        System.out.println(car.getColor());
        int year = car.getYear();
        car.setColor("Black");
        System.out.println("are these objects equal? " + car.equals(car2));
        System.out.println("the hashcode of this object is: " + car.hashCode());
        System.out.println("the hashcode of this object is: " + car2.hashCode());

    }
}