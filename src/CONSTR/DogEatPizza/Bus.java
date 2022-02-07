package CONSTR.DogEatPizza;

public class Bus extends Auto {
    public Bus(String producer, String model, int currentSpeed, boolean isRunning, int fuelPercent) {
        super(producer, model, currentSpeed, isRunning, fuelPercent);
    }

    @Override
    public void Start() {
        super.Start();
    }

    @Override
    public void Stop() {
        super.Stop();
    }

    @Override
    public void Axelerate(int axelerate) {
        super.Axelerate(axelerate);
    }

    @Override
    public int getFuelPercent() {
        return super.getFuelPercent();
    }

    @Override
    public void setFuelPercent(int fuelPercent) {
        super.setFuelPercent(fuelPercent);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
