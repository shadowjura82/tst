package TestingProject.tst.services;

import TestingProject.tst.models.Car;
import TestingProject.tst.repositories.CarRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    public Collection<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car getCarById(Integer id) {
        return carRepository.findById(id).orElse(null);
    }

    public Car updateCar(Car car) {
        if (getCarById(car.getId()) == null) {
            return null;
        }
        return carRepository.save(car);
    }

    public Car deleteCar(Car car) {
        Car carToDelete = getCarById(car.getId());
        if (carToDelete == null) {
            return null;
        }
        carRepository.delete(carToDelete);
        return carToDelete;
    }
}