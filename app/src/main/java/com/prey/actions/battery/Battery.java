/*******************************************************************************
 * Created by Orlando Aliaga
 * Copyright 2015 Prey Inc. All rights reserved.
 * License: GPLv3
 * Full license at "/LICENSE"
 ******************************************************************************/
package com.prey.actions.battery;

import android.os.BatteryManager;

public class Battery {

    private int health;
    private int iconSmall;
    private int level;
    private int plugged;
    private boolean present;
    private int scale;
    private int status;
    private String technology;
    private int temperature;
    private int voltage;
    private boolean charging;
    private float percentage;

    private boolean usbCharge;
    private boolean acCharge;
    private boolean connected;


    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }


    public boolean isUsbCharge() {
        return usbCharge;
    }

    public void setUsbCharge(boolean usbCharge) {
        this.usbCharge = usbCharge;
    }

    public boolean isAcCharge() {
        return acCharge;
    }

    public void setAcCharge(boolean acCharge) {
        this.acCharge = acCharge;
    }

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public boolean isCharging() {
        return charging;
    }

    public void setCharging(boolean charging) {
        this.charging = charging;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getIconSmall() {
        return iconSmall;
    }

    public void setIconSmall(int iconSmall) {
        this.iconSmall = iconSmall;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPlugged() {
        return plugged;
    }

    public void setPlugged(int plugged) {
        this.plugged = plugged;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }


}

