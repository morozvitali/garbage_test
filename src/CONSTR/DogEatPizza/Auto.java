package CONSTR.DogEatPizza;






public abstract class Auto {
    private String producer;
    private String model;
    private Engine engine;



    private int currentSpeed;
    private boolean isRunning;
    private int fuelPercent;

    public Auto(String producer, String model, int currentSpeed, boolean isRunning, int fuelPercent) {
        this.producer = producer;
        this.model = model;
        this.currentSpeed = currentSpeed;
        this.isRunning = isRunning;
        this.fuelPercent = fuelPercent;
    }

    public void Axelerate (int axelerate) {
        this.currentSpeed += axelerate;
    }

    public void Start() {
        if (!isRunning && (currentSpeed == 0)) {
            isRunning = true;
            currentSpeed += 10;
            System.out.println("Start engine");
        } else {
            System.out.println("Start error [car is running]");
        }
    }

    public void Stop() {
        if (isRunning && (currentSpeed > 0)) {
            isRunning = false;
            currentSpeed = 0;
            System.out.println("Stop engine");
        } else {
            System.out.println("Stop error [car not running]");
        }
    }

    public int getFuelPercent() {
        return fuelPercent;
    }

    public void setFuelPercent(int fuelPercent) {
        this.fuelPercent = fuelPercent;
    }
}