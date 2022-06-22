package HomeWork_04;

import Utils.Utils;

public class Car {
    public float tankVolume;
    public float consumption;
    public float remainder;
    public float wholeConsumption = 0;

    public Car() {
        this.tankVolume = 50;
        this.consumption = 7.5f;
        this.remainder = Utils.getRandomNumber(1,50);
    }

    public Car(float tankVolume, float consumption, float remainder){
        this.tankVolume = tankVolume;
        this.consumption = consumption;
        this.remainder = remainder;
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
    public double fullFullTank(){
        System.out.println("бак заправлен на " + (tankVolume - remainder) + " л." );
       wholeConsumption += tankVolume - remainder;

        return remainder = tankVolume;
    }
    public  double countFuelRemain(int way){
        if (way * consumption / 100 >= remainder) {
            System.out.println("Not enough fuel. Full fill your tank");
            fullFullTank();
            remainder -= way * consumption / 100;
            return remainder;
        }
        System.out.println("After taking  " + way + " kilometers remainder is  "
                + (remainder -= way * consumption / 100)+ "л.");

        return getRemainder();

    }
    public  double indicateFuel (int way ){
        if (way * consumption / 100 <= remainder){
            System.out.println(" There`s enough fuel. In tank " + remainder+ "litters of fuel");
            return 0;
        }
        else
            System.out.println("For taking way you need "+
                    ((way * consumption / 100) - remainder) +"litters of fuel");
        return((way * consumption / 100) - remainder);

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
