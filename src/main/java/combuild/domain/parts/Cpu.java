package combuild.domain.parts;

public class Cpu implements Part {

    String cpuSocket;
    int cpuTdp;

    public String getCpuSocket() {
        return cpuSocket;
    }

    public void setCpuSocket(String cpuSocket) {
        this.cpuSocket = cpuSocket;
    }

    public int getCpuTdp() {
        return cpuTdp;
    }

    public void setCpuTdp(int cpuTdp) {
        this.cpuTdp = cpuTdp;
    }

}
