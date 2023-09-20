package TestingProject.tst.controllers;

import TestingProject.tst.models.Car;
import TestingProject.tst.models.Human;
import TestingProject.tst.services.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(path = "cars")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public Car createCar(@RequestBody Car car) {
        return carService.createCar(car);
    }

    @GetMapping
    public Collection<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Car> getCarById(@PathVariable Integer id) {
        Car car = carService.getCarById(id);
        if (car == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(car);
    }

    @PutMapping
    public ResponseEntity<Car> updateCar(@RequestBody Car car) {
        Car updatedCar = carService.updateCar(car);
        if (updatedCar == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(updatedCar);
    }

    @DeleteMapping
    public ResponseEntity<Car> deleteCar(@RequestBody Car car) {
        Car deletedCar = carService.deleteCar(car);
        if (deletedCar == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(deletedCar);
    }
}