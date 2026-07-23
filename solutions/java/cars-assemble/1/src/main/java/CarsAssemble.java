public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        int productionPerHour = speed * 221;
        if (speed <= 4){
            return productionPerHour;
        }
        else if (speed <= 8){
            return productionPerHour * 0.90;
        }
        else if (speed <= 9){
            return productionPerHour * 0.80;
        }
        else{
            return productionPerHour * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed) / 60;
    }
}
