package TestingProject.tst.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Car {
    private String model;
    private String type;
    private Integer maxSpeed;
    private String Color;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Car() {
    }

    public Car(String model, String type, Integer maxSpeed, String color, Integer id) {
        this.model = model;
        this.type = type;
        this.maxSpeed = maxSpeed;
        Color = color;
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(type, car.type) && Objects.equals(maxSpeed, car.maxSpeed) && Objects.equals(Color, car.Color) && Objects.equals(id, car.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, type, maxSpeed, Color, id);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", Color='" + Color + '\'' +
                ", id=" + id +
                '}';
    }
}
