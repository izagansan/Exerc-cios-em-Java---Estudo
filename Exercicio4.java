class BirdWatcher {
    private final int[] birdsPerDay;
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }
    public int[] getLastWeek() {
        return new int[] {0, 2, 5, 3, 7, 8, 4};
    }
    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }
    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }
    public boolean hasDayWithoutBirds() {
        for (int IndiceBirdsPerDay: birdsPerDay) {
            if (IndiceBirdsPerDay == 0) {
                return true;
            }
        }
        return false;
    }
    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        for (int i = 0; i < limit; i++) {
            sum += birdsPerDay[i];
        }
        return sum;
    }
    public int getBusyDays() {
        int contador = 0;
        for (int i = 0; i < birdsPerDay.length; i++) {
            if (birdsPerDay[i] >= 5) {
                contador++;
            }
        }
        return contador; 
    }

    public static void main(String[] args) {
        int[] birds = {2, 5, 0, 7, 4, 1};
        BirdWatcher watcher = new BirdWatcher(birds);
        System.out.println(java.util.Arrays.toString(watcher.getLastWeek()));
        System.out.println(watcher.getToday());
        watcher.incrementTodaysCount(); // NÃO imprime
        System.out.println(watcher.getToday()); // agora incrementado
        System.out.println(watcher.hasDayWithoutBirds());
        System.out.println(watcher.getCountForFirstDays(4));
        System.out.println(watcher.getBusyDays());
    }
}
