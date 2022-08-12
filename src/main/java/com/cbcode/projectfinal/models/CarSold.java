package com.cbcode.projectfinal.models;

import javax.persistence.*;

@Entity
@Table(name = "sold_car")
@PrimaryKeyJoinColumn(name = "id")
public class CarSold extends Car {

    private static final long serialVersionUID = 1L;

    private String vehicleCode;

    private boolean machinePolish;

    private boolean protectionApplication;

    public String getVehicleCode() {
        return vehicleCode;
    }

    public void setVehicleCode(String vehicleCode) {
        this.vehicleCode = vehicleCode;
    }

    public boolean isMachinePolish() {
        return machinePolish;
    }

    public void setMachinePolish(boolean machinePolish) {
        this.machinePolish = machinePolish;
    }

    public boolean isProtectionApplication() {
        return protectionApplication;
    }

    public void setProtectionApplication(boolean protectionApplication) {
        this.protectionApplication = protectionApplication;
    }
}
