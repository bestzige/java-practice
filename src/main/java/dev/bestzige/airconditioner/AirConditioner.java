package dev.bestzige.airconditioner;

public class AirConditioner {

    private int MIN_TEMPERATURE = 20;
    private int MAX_TEMPERATURE = 30;
    private int MAX_FAN_SPEED = 2;
    private int MIN_FAN_SPEED = 0;

    private boolean airOn;
    private boolean fanOn;
    private int targetTemperature;
    private int fanSpeed;

    public AirConditioner(int targetTemperature, int fanSpeed) {
        if(targetTemperature < 20) {
            this.targetTemperature = this.MIN_TEMPERATURE;
        } else if(targetTemperature > 30) {
            this.targetTemperature = this.MAX_TEMPERATURE;
        } else {
            this.targetTemperature = targetTemperature;
        }

        if(fanSpeed < 0) {
            this.fanSpeed = this.MIN_FAN_SPEED;
        } else if(fanSpeed > 2) {
            this.fanSpeed = this.MAX_FAN_SPEED;
        } else {
            this.fanSpeed = fanSpeed;
        }
    }

    public boolean isAirOn() {
        return airOn;
    }

    public int getTargetTemperature() {
        return targetTemperature;
    }

    public void turnAirOnOff() {
        this.fanOn = !this.fanOn;
        this.airOn = !this.airOn;
    }

    public void increaseTemperature() {
        if(this.targetTemperature + 1 >= MAX_TEMPERATURE) {
            this.targetTemperature = this.MAX_TEMPERATURE;
        } else {
            this.targetTemperature++;
        }
    }

    public void decreaseTemperature() {
        if(this.targetTemperature - 1 <= MIN_TEMPERATURE) {
            this.targetTemperature = this.MIN_TEMPERATURE;
        } else {
            this.targetTemperature--;
        }
    }

    public void changeFanSpeed() {
        if(this.fanSpeed + 1 > MAX_FAN_SPEED) {
            this.fanSpeed = this.MIN_FAN_SPEED;
        } else {
            this.fanSpeed++;
        }
    }

    @Override
    public String toString() {
        String text;
        String fanSpeedText = this.fanSpeed == 0 ? "low" : this.fanSpeed == 1 ? "medium" : "high";

        if(!this.isAirOn()){
            text = "Air Conditioner {Status: off}";
        } else {
            text = "Air Conditioner {Status: on, Temp: " + targetTemperature + ", Fan: " + fanSpeedText + "}";
        }

        return text;
    }
}
