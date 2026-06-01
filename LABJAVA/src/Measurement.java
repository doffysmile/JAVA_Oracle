public class Measurement {
    final String[] SI_UNITS = new String[]{"s", "m", "kg", "A", "K", "mol", "cd"};
    final String[] IMPERIAL_UNITS = new String[]{"ft", "lb", "F"};
    final double ft2m = 0.3048;
    final double lb2kg = 0.4536;
    String note;
    double value;
    String unit;

    public Measurement() {
    }

    boolean isSI(String unit) {
        for(String u : this.SI_UNITS) {
            if (u.equals(unit)) {
                return true;
            }
        }

        return false;
    }

    boolean isImperial(String unit) {
        for(String u : this.IMPERIAL_UNITS) {
            if (u.equals(unit)) {
                return true;
            }
        }

        return false;
    }

    String convertUnit(String unit) {
        String var10000;
        switch (unit) {
            case "ft" -> var10000 = this.SI_UNITS[1];
            case "lb" -> var10000 = this.SI_UNITS[2];
            case "F" -> var10000 = this.SI_UNITS[4];
            default -> var10000 = unit;
        }

        return var10000;
    }

    double convertValue(String unit, double value) {
        double var10000;
        switch (unit) {
            case "ft" -> var10000 = value * 0.3048;
            case "lb" -> var10000 = value * 0.4536;
            case "F" -> var10000 = (value - (double)32.0F) * (double)5.0F / (double)9.0F + 273.15;
            default -> var10000 = value;
        }

        return var10000;
    }

    void setMeasurementDetaisl(String note, double value, String unit) {
        this.note = note == null ? "No notes" : note;
        if (this.isSI(unit)) {
            this.unit = unit;
            this.value = value;
        } else if (this.isImperial(unit)) {
            this.unit = this.convertUnit(unit);
            this.value = this.convertValue(unit, value);
        } else {
            this.unit = unit;
            this.value = value;
        }

    }
}
