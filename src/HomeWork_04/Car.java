package HomeWork_04;

import Utils.Utils;

public class Car {
    public float tankVolume;
    public float consumption;
    public float remainder;
    public float wholeConsumption = 0;

    public Car() {
        this.tankVolume = 50;
        this.consumption = Utils.getRandomNumber(1,50);
        this.remainder = 7.5f;
    }

    public float getWholeConsumption() {
        return wholeConsumption;
    }

    public void setWholeConsumption(float wholeConsumption) {
        this.wholeConsumption = wholeConsumption;
    }

    public float getTankVolume() {
        return tankVolume;
    }

    public void setTankVolume(float tankVolume) {
        this.tankVolume = tankVolume;
    }

    public float getConsumption() {
        return consumption;
    }

    public void setConsumption(float consumption) {
        this.consumption = consumption;
    }

    public float getRemainder() {
        return remainder;
    }

    public void setRemainder(float remainder) {
        this.remainder = remainder;
    }
    public float fullFillTank(){
        return 0;
    }
    public float indicateConsumption(){
        return 0;
    }
    public float checkNeededFuel(){
        return 0;
    }


    @Override
    public String toString() {
        return "Car{" +
                "tankVolume=" + tankVolume +
                ", consumption=" + consumption +
                ", remainder=" + remainder +
                '}';
    }
}
