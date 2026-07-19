public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven()
    {
        return 40;
    }

    public int remainingMinutesInOven(int actual_minutes)
    {
        return expectedMinutesInOven() - actual_minutes;
    }

    public int preparationTimeInMinutes(int layers)
    {
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int minutes)
    {
        return preparationTimeInMinutes(layers) + minutes;
    }
}
