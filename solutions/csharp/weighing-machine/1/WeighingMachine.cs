class WeighingMachine
{
    // TODO: define the 'Precision' property
    public int Precision {get;}

    public WeighingMachine(int precision)
    {
        Precision = precision;
    }
    // TODO: define the 'Weight' property
    private double weight;
    public double Weight
    {
        get => weight;
        set
        {
            if (value < 0)
            {
                throw new ArgumentOutOfRangeException(nameof(value));
            }
            weight = value;
        }
    }

    // TODO: define the 'TareAdjustment' property
    public double TareAdjustment {get; set;} = 5.0;
    

    // TODO: define the 'DisplayWeight' property
    public string DisplayWeight => $"{(Weight - TareAdjustment).ToString($"F{Precision}")} kg";
    
}
