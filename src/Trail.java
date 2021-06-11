public abstract class Trail {
    protected int length; // Meters

    /* Trail has two crossings */
    protected Crossing crossing1;
    protected Crossing crossing2; 

    Trail(int length, Crossing crossing1, Crossing crossing2) {
        this.length = length;
        this.crossing1 = crossing1;
        this.crossing2 = crossing2;
        crossing1.trails.add(this);
        crossing2.trails.add(this);
    }

    /* Given a crossing return the other crossing */
    public Crossing findOtherCrossing(Crossing crossing) {return (crossing == crossing1) ? crossing2 : crossing1;}

    /* Time = length / velocity, velocity given in meters per minunte */
    public int calculateWalkTime(int velocity) {return (length / velocity);}
}