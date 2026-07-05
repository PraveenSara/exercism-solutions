using System.Globalization;


public enum Location
{
    NewYork = 4,
    London = -1,
    Paris = -2
}

public enum AlertLevel
{
    Early,
    Standard,
    Late
}

public static class Appointment
{
    public static DateTime ShowLocalTime(DateTime dtUtc)
    {
        return dtUtc;
    }

    public static DateTime Schedule(string appointmentDateDescription, Location location)
    {
        DateTime dt = DateTime.Parse(appointmentDateDescription);

        return dt.AddHours((int)location);
    }

    public static DateTime GetAlertTime(DateTime appointment, AlertLevel alertLevel)
    {
        return alertLevel switch
        {
                AlertLevel.Early => appointment.AddDays(-1),
                AlertLevel.Standard => appointment.AddHours(-1).AddMinutes(-45),
                AlertLevel.Late => appointment.AddMinutes(-30),
                _ => appointment
        };
    }

    public static bool HasDaylightSavingChanged(DateTime dt, Location location)
    {
        string timeZoneId = location switch
        {
            Location.London => "Europe/London",
            Location.NewYork => "Eastern Standard Time",
            Location.Paris => "Europe/Paris",
            _ => throw new ArgumentException("Unknown location")
        };

        TimeZoneInfo tz = TimeZoneInfo.FindSystemTimeZoneById(timeZoneId);

        bool nowDst = tz.IsDaylightSavingTime(dt);
        bool weekAgoDst = tz.IsDaylightSavingTime(dt.AddDays(-7));

        return nowDst != weekAgoDst;
    }

    public static DateTime NormalizeDateTime(string dtStr, Location location)
    {
        string format = location switch
        {
            Location.London => "dd/MM/yyyy HH:mm:ss",   
            Location.NewYork => "MM/dd/yyyy HH:mm:ss", 
            Location.Paris => "dd/MM/yyyy HH:mm:ss",  
            _ => "dd/MM/yyyy HH:mm:ss"
        };

        try
        {
            return DateTime.ParseExact(dtStr, format, CultureInfo.InvariantCulture);
        }
        catch
        {
            
            return new DateTime(1, 1, 1);
        }
    }
}
