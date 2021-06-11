public class Forest {
    private final int numTrails;
    private final int numCrossings;
    private Crossing[] crossings;

    Forest(int numTrails, int numCrossings) {
        this.numTrails = numTrails;
        this.numCrossings = numCrossings;
        crossings = new Crossing[numCrossings];
        for(int i = 0; i < numCrossings; i++) crossings[i] = new Crossing();
        for(int i = 0; i < numTrails; i++) {
            int randInt = Draw.drawInt(1, 4);
            switch(randInt) {
                case 1 -> new NatureTrail(Draw.drawInt(220, 2500), crossings[Draw.drawInt(0, numCrossings)], crossings[Draw.drawInt(0, numCrossings)]);
                case 2 -> new RoadTrail(Draw.drawInt(220, 2500), crossings[Draw.drawInt(0, numCrossings)], crossings[Draw.drawInt(0, numCrossings)]);
                case 3 -> new NatureTrailWithNiceView(Draw.drawInt(220, 2500), crossings[Draw.drawInt(0, numCrossings)], crossings[Draw.drawInt(0, numCrossings)], Draw.drawInt(1, 6));
                case 4 -> new NatureTrailWithNiceView(Draw.drawInt(220, 2500), crossings[Draw.drawInt(0, numCrossings)], crossings[Draw.drawInt(0, numCrossings)], Draw.drawInt(1, 6));
            }
        }
    }

    /* Return a random crossing */
    public Crossing getRandCrossing() {return crossings[Draw.drawInt(0, numCrossings)];}

    /* Return a random start crossing, requires atleast one trail */
    public Crossing getRandStart() {
        Crossing temp = getRandCrossing();
        while(temp.isIsolated()) {temp = getRandCrossing();}
        return temp;
    }
}