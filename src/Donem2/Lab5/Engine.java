
package Donem2.Lab5;

public class Engine extends Cars {
    private double volume;
    private int cylinders;

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public double getVolume() {
        return volume;
    }

    public int getCylinders() {
        return cylinders;
    }
    public Engine()
    {
        volume =0.0;
        cylinders =0;
    }
    public Engine(int volume, double cylndr)
    {
        volume=100;
        cylndr=25;
    }
  
}
