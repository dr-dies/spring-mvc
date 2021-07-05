package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car(1L,"audi",2021));
        carList.add(new Car(2L,"mers", 1991));
        carList.add(new Car(3L,"honda", 2010));
        carList.add(new Car(4L,"reno", 1995));
        carList.add(new Car(5L,"toyota", 2019));
    }

    public List<Car> getAllCars() {
        return carList;
    }


    public List<Car> getCountCars(int count) {
        return carList.subList(0, count);
    }
}
