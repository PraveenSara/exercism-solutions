public class JedliksToyCar {

    public int distanceTravelled = 0;
    public int batteryRemaining = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", distanceTravelled);
    }

    public String batteryDisplay() {
        return batteryRemaining > 0 ? "Battery at " + String.valueOf(batteryRemaining) + "%" : "Battery empty";
    }

    public void drive() {
        if (batteryRemaining > 0){
            distanceTravelled += 20;
            batteryRemaining -= 1;
        }
        
    }
}
