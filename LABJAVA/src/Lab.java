public class Lab {
    public static void main(String[] args) {
        Experiment exp = new Experiment();
//        exp.summary = "Measurement Weight and Temperature:";
        exp.addMeasurement("Initial Weight", 24.57, "kg");
        exp.addMeasurement("Quite cold", -33.9, "F");
        exp.addMeasurement("Imperial unit check", 42, "lb");

        Experiment exp2 = new Experiment();
        exp2.summary = "Measurement Distance:";
        exp2.addMeasurement("Quite close", 12.5, "m");
        exp2.addMeasurement("Imperial unit check", 12.5 / 0.3048, "ft");
        exp2.addMeasurement(null, 5, "ft");

        System.out.println(exp.experimentReport());
        System.out.println(exp2.experimentReport());

        exp.summary = "Measured different things:";
        System.out.println(exp.experimentReport());
    }
}
