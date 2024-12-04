package hw1;

public class Car {
    private String model;
    private String power;
    private int volumeEngine;
    private boolean turbo;

    public Car(String model, String power, int volumeEngine, boolean turbo) {
        this.model = model;
        this.power = power;
        this.volumeEngine = volumeEngine;
        this.turbo = turbo;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getPower() {
        return power;
    }
    public void setPower(String power) {
        this.power = power;
    }
    public int getVolumeEngine() {
        return volumeEngine;
    }
    public void setVolumeEngine(int volumeEngine) {
        this.volumeEngine = volumeEngine;
    }
    public boolean isTurbo() {
        return turbo;
    }
    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", power='" + power + '\'' +
                ", volumeEngine=" + volumeEngine +
                ", turbo=" + turbo +
                '}';
    }
}
