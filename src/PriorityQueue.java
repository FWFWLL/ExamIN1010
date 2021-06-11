/* I have no fucking clue what I am doing -FFL */
public final class PriorityQueue {
    private Activity prioritized = null;

    /* Enqueue element with shitty sorting */
    public void enqueue(Activity activity) {
        if(prioritized = null) prioritized = activity;
        else {
            Activity temp = prioritized;
            /* AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA */
        }
    }

    /* Dequeue the element with lowest time */
    public Activity dequeue() {
        Activity temp = prioritized;
        prioritized = prioritized.prev;
        return temp;
    }

    public String toString() {
        String output = "[";
        Activity temp = prioritized;
        for(int i = 0; i < 3; i++) {
            output += temp + " ";
            temp = prioritized.prev;
        }
        return output + "]";
    }
}