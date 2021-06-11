public abstract class Activity implements Comparable<Activity> {
    int time;
    Activity next;
    Activity prev;

    public abstract void act();

    public int compareTo(Activity activity) {
        if(time == activity.time) return 0;
        else if(time > activity.time) return 1;
        else return -1;
    }
}