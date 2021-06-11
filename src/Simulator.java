public final class Simulator {
    private int globalTime = 0;
    private PriorityQueue prioQ = new PriorityQueue();

    Simulator(Activity... activities) {for(Activity a : activities) prioQ.enqueue(a);}

    public void simulate(int time) {
        System.out.println("Max time: " + time);
        while(globalTime < time) {
            Activity temp = prioQ.dequeue();
            temp.act();
            System.out.println("Walked for " + temp.time + " min...");
            globalTime += temp.time;
            prioQ.enqueue(temp);
        }
    }
}