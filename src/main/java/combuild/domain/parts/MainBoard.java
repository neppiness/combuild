package combuild.domain.parts;

public class MainBoard implements Part {

    String allowedCpuSocket, allowedRamSocket, allowedSizeFormat;
    int maxNoOfRamBank;
    boolean M2SlotExist;

    public String getAllowedCpuSocket() {
        return allowedCpuSocket;
    }

    public void setAllowedCpuSocket(String allowedCpuSocket) {
        this.allowedCpuSocket = allowedCpuSocket;
    }

    public String getAllowedRamSocket() {
        return allowedRamSocket;
    }

    public void setAllowedRamSocket(String allowedRamSocket) {
        this.allowedRamSocket = allowedRamSocket;
    }

    public String getAllowedSizeFormat() {
        return allowedSizeFormat;
    }

    public void setAllowedSizeFormat(String allowedSizeFormat) {
        this.allowedSizeFormat = allowedSizeFormat;
    }

    public int getMaxNoOfRamBank() {
        return maxNoOfRamBank;
    }

    public void setMaxNoOfRamBank(int maxNoOfRamBank) {
        this.maxNoOfRamBank = maxNoOfRamBank;
    }

    public boolean isM2SlotExist() {
        return M2SlotExist;
    }

    public void setM2SlotExist(boolean m2SlotExist) {
        M2SlotExist = m2SlotExist;
    }
}
