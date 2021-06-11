import java.util.ArrayList;

public final class Crossing {
    ArrayList<Trail> trails = new ArrayList<Trail>(); // Trails that meet at the crossing

    /* Return a random trail */
    public Trail randTrail() {return trails.get(Draw.drawInt(0, trails.size()));}

    /* Returns true if crossing has no trails leading to or from the crossing (Makes no fucking sense but whatevs) */
    public Boolean isIsolated() {return (trails.size() == 0) ? true : false;}
}