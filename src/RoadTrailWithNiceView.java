public final class RoadTrailWithNiceView extends RoadTrail implements NiceView {
    protected int viewValue; // How nice the view is from 1 to 6 inclusive

    RoadTrailWithNiceView(int length, Crossing crossing1, Crossing crossing2, int viewValue) throws BadViewException {
        super(length, crossing1, crossing2);
        if(viewValue < 1 || viewValue > 6) throw new BadViewException("viewValue must have a value between 1 to 6 inclusive but got " + viewValue + " instead");
        this.viewValue = viewValue;
    }

    public int getViewValue() {return viewValue;}
}