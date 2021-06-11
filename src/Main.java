public class Main {
    public static void main(String[] args) {
        Forest f0rest = new Forest(1000, 250);
        Hiker sivert = new Hiker(Draw.drawInt(20, 200), f0rest.getRandStart());
        Hiker nikos = new Hiker(Draw.drawInt(20, 200), f0rest.getRandStart());
        Hiker svend = new Hiker(Draw.drawInt(20, 200), f0rest.getRandStart());
        Simulator simulator2077 = new Simulator(sivert, nikos, svend);
        System.out.println("Starting Simulation...");
        simulator2077.simulate(Draw.drawInt(30, 480));
    }
}