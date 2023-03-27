package combuild.domain.parts;

import java.util.List;

public class Cooler implements Part {

    List<String> allowedCpuSocket;
    int cpuCoolerHeight;

    public List<String> getAllowedCpuSocket() {
        return allowedCpuSocket;
    }

    public void setAllowedCpuSocket(List<String> allowedCpuSocket) {
        this.allowedCpuSocket = allowedCpuSocket;
    }

    public int getCpuCoolerHeight() {
        return cpuCoolerHeight;
    }

    public void setCpuCoolerHeight(int cpuCoolerHeight) {
        this.cpuCoolerHeight = cpuCoolerHeight;
    }
}
