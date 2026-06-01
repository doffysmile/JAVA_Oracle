public class Experiment {
    String summary;
    Measurement[] measurements = new Measurement[3];

    public Experiment() {
    }

    void addMeasurement(String note, double value, String unit) {
        for(int i = 0; i < this.measurements.length; ++i) {
            if (this.measurements[i] == null) {
                this.measurements[i] = new Measurement();
                this.measurements[i].setMeasurementDetaisl(note, value, unit);
                return;
            }
        }

        System.out.println("Cannot add measurement: experiment is full.");
    }

    String experimentReport() {
        String result = "\n" + this.summary + "\nMeasurements:";

        for(int i = 0; i < this.measurements.length; ++i) {
            if (this.measurements[i] != null) {
                result = result + "\n\t" + (i + 1) + " " + this.measurements[i].note + " " + this.measurements[i].value + " " + this.measurements[i].unit;
            }
        }

        return result;
    }

}
