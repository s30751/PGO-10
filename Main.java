import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("M3", 2019);
        Car car2 = new Car("X4", 2017);
        Car car3 = new Car("A46",2020);
        Car car4 = new Car("218s",2018);
        Car car5 = new Car("f40",1987);
        Car car6 = new Car("GLC 300", 2022);
        Car car7 = new Car("E46", 2004);
        Car car8 = new Car("A7", 2015);
        Car car9 = new Car("RAV 4", 2023);
        Car car10 = new Car("911", 2024);

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);

       Collections.sort(cars);

       for(Car car : cars) {
           System.out.println(car);
       }
    }
}