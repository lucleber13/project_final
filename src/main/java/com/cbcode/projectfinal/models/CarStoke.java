package com.cbcode.projectfinal.models;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "stock_car")
@PrimaryKeyJoinColumn(name = "id")
public class CarStoke extends Car {

    private static final long serialVersionUID = 1L;

    private boolean machinePolish;

    private boolean interiorWashing;

    public boolean isMachinePolish() {
        return machinePolish;
    }

    public void setMachinePolish(boolean machinePolish) {
        this.machinePolish = machinePolish;
    }

    public boolean isInteriorWashing() {
        return interiorWashing;
    }

    public void setInteriorWashing(boolean interiorWashing) {
        this.interiorWashing = interiorWashing;
    }
}
