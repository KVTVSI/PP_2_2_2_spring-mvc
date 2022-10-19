package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImp implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1L,"Daewoo", "Matiz", 2013));
        cars.add(new Car(2L,"Rolls-Royce", "Phantom", 2019));
        cars.add(new Car(3L,"Audi", "A5", 2017));
        cars.add(new Car(4L,"Mazda", "RX-7", 1992));
        cars.add(new Car(5L,"Volvo", "C70", 2007));
    }

    @Override
    public List<Car> countCar(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
