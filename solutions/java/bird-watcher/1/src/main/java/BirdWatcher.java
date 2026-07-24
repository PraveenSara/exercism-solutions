
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[] {0,2,5,3,7,8,4};
    }

    public int getToday() {
        int lenDays = birdsPerDay.length;
        return birdsPerDay[lenDays - 1];
    }

    public void incrementTodaysCount() {
        int lenDays = birdsPerDay.length;
        birdsPerDay[lenDays - 1] += 1; 
    }

    public boolean hasDayWithoutBirds() {

        int flag = 0;
        
        for (int count : birdsPerDay){
            
            if (count == 0){
                flag += 1;
            }
        }
        return flag > 0;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;

        int days = numberOfDays;

        if (numberOfDays > 7){
            days = 7;
        }
        
        for (int i = 0; i < days; i++){
            sum += birdsPerDay[i];
        }
        
        return sum;
    }

    public int getBusyDays() {
        
        int busyDays = 0;

        for (int count : birdsPerDay){
            if (count >= 5) {
                busyDays += 1;
            }
        }
        
        return busyDays;
    }
}
