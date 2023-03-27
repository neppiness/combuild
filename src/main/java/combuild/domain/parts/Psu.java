package combuild.domain.parts;

public class Psu implements Part {

    int wattage;
    String psuFormat;

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public String getPsuFormat() {
        return psuFormat;
    }

    public void setPsuFormat(String psuFormat) {
        this.psuFormat = psuFormat;
    }
}
