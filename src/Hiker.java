public final class Hiker extends Activity {
    private int velocity; // Meters per minute
    private Crossing crossing; // Current crossing

    Hiker(int velocity, Crossing crossing) {
        this.velocity = velocity;
        this.crossing = crossing;
    }

    public void act() {
        Trail temp = crossing.randTrail();
        time = temp.calculateWalkTime(velocity);
        crossing = temp.findOtherCrossing(crossing);
    }
}