package web.service;

import web.model.Car;

import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> subListByNumber(List<Car> list, int count) {
        if (count == 0 || count >= list.size()) {
            return list;
        } else {
            return list.subList(0, count);
        }
    }
}
