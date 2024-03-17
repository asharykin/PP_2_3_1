package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(required = false, defaultValue = "0") int count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Brand1", "Model1", 111));
        cars.add(new Car("Brand2", "Model2", 222));
        cars.add(new Car("Brand3", "Model3", 333));
        cars.add(new Car("Brand4", "Model4", 444));
        cars.add(new Car("Brand5", "Model5", 555));
        CarService carService = new CarServiceImpl();
        model.addAttribute("cars", carService.subListByNumber(cars, count));
        return "cars";
    }
}
