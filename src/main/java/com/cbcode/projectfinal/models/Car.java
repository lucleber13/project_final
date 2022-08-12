package com.cbcode.projectfinal.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) // JOINED
@SequenceGenerator(name = "seq_cars", sequenceName = "seq_cars", initialValue = 1, allocationSize = 1)
public abstract class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_cars")
    private Long id;

    @NotBlank(message = "The car model must be specified!")
    @NotNull(message = "The car model must be specified!")
    @Column(nullable = false)
    private String model;

    @NotBlank(message = "The car color must be specified!")
    @NotNull(message = "The car color must be specified!")
    @Column(nullable = false)
    private String color;

    @NotBlank(message = "The car reg number must be specified!")
    @NotNull(message = "The car reg number must be specified!")
    @Column(nullable = false)
    private String regNumber;

    @NotBlank(message = "The car keys number must be specified!")
    @NotNull(message = "The car keys number must be specified!")
    @Column(nullable = false)
    private int keysNumber;

//    @OneToOne(targetEntity = Car.class)
//    @JoinColumn(name = "stock_cars", nullable = true,
//            foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "stock_cars_id_fk"))
//    private Car carStock;
//    @OneToOne(targetEntity = Car.class)
//    @JoinColumn(name = "sold_cars", nullable = true,
//           foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "sold_cars_id_fk"))
//    private Car carSold;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public int getKeysNumber() {
        return keysNumber;
    }

    public void setKeysNumber(int keysNumber) {
        this.keysNumber = keysNumber;
    }

//    public Car getCarStock() {
//        return carStock;
//    }
//
//    public void setCarStock(Car carStock) {
//        this.carStock = carStock;
//    }
//
//    public Car getCarSold() {
//        return carSold;
//    }
//
//    public void setCarSold(Car carSold) {
//        this.carSold = carSold;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return keysNumber == car.keysNumber
                && id.equals(car.id)
                && model.equals(car.model)
                && color.equals(car.color)
                && regNumber.equals(car.regNumber)
                /*&& Objects.equals(carStock, car.carStock)
                && Objects.equals(carSold, car.carSold)*/;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, color, regNumber, keysNumber/*, carStock, carSold*/);
    }
}
