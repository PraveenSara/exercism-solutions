class RemoteControlCar
{
    // TODO: define the constructor for the 'RemoteControlCar' class

    public int speed;
    public int batteryDrain;
    private int distance = 0;
    private int battery = 100;

    public RemoteControlCar(int speed, int batteryDrain)
    {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public bool BatteryDrained() =>  battery < batteryDrain;

    public int DistanceDriven() =>  distance;


    public void Drive()
    {
        if (BatteryDrained())
        {
            return;
        }
        distance += speed;
        battery -= batteryDrain;
    }

    public static RemoteControlCar Nitro() =>  new RemoteControlCar(50, 4);

}

class RaceTrack
{
    // TODO: define the constructor for the 'RaceTrack' class

    private int distance;
    public RaceTrack(int distance)
    {
        this.distance = distance;
    }
    public bool TryFinishTrack(RemoteControlCar car)
    {
        int maxDrives = 100 / car.batteryDrain;
        int maxDistance = maxDrives * car.speed;

        return maxDistance >= distance;  
    }
}
