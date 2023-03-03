package org.campus02.arrays;

import java.sql.Array;
import java.util.Arrays;

public class CarDemo {
    public static void main(String[] args) {
        Car herbie = new Car("Cabrio", 1945, 250000);
        Car fritzi = new Car("Coupe", 2015, 150000);
        Car s = new Car("Model S", 2021, 25000);

        Car[] cars = {fritzi,s, herbie};

        System.out.println(Arrays.toString(cars));
        Car.sortByProductionYear(cars);
        System.out.println(Arrays.toString(cars));



    }

}
