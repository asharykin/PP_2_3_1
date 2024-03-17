package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> subListByNumber(List<Car> list, int count);
}
