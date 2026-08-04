class NeedForSpeed {

    public int distance = 0;
    private int batteryRemaining = 100;
    public int batteryDrain;
    public int speed;
    
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryDrain > batteryRemaining;
    }

    public int distanceDriven() {
        return distance;
    }

    public void drive() {
        if (batteryRemaining > 0){
            distance += speed;
            batteryRemaining -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {

    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return 100 / car.batteryDrain *  car.speed >= distance;
    }
}
