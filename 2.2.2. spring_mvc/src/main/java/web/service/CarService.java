package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarService {
    private static final Car car1 = new Car("bmw", 6, "2012");
    private static final Car car2 = new Car("audi", 8, "1999");
    private static final Car car3 = new Car("honda", 4, "2002");
    private static final Car car4 = new Car("lada", 9, "1984");
    private static final Car car5 = new Car("reno", 12, "2019");

    private final static List<Car> cars = new ArrayList<>(Arrays.asList(car1, car2, car3, car4, car5));

    public static List<Car> getCars(Integer count) {
        if (count == null || count >= 5) {
            return cars;
        }
        return cars.subList(0, count);
    }
}
