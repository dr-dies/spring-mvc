package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

import java.util.Optional;

@Controller

public class CarController {

/*    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model) {
        CarService carService = new CarService();
        model.addAttribute("cars", carService.getAllCars());
        return "cars";
    }*/

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count") Optional<Integer> count, ModelMap model) {
        CarService carService = new CarService();
        if (count.isPresent() && count.get() < 5) {
            model.addAttribute("cars", carService.getCountCars(count.get()));
        } else {
            model.addAttribute("cars", carService.getAllCars());
        }

        return "cars";
    }
}
