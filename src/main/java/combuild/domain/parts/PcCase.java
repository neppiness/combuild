package combuild.domain.parts;

import java.util.List;

public class PcCase implements Part {

    List<String> allowedMainBoardFormat, allowedPsuFormat;
    int allowedCpuCoolerHeight, allowedGpuLength;

    public List<String> getAllowedMainBoardFormat() {
        return allowedMainBoardFormat;
    }

    public void setAllowedMainBoardFormat(List<String> allowedMainBoardFormat) {
        this.allowedMainBoardFormat = allowedMainBoardFormat;
    }

    public List<String> getAllowedPsuFormat() {
        return allowedPsuFormat;
    }

    public void setAllowedPsuFormat(List<String> allowedPsuFormat) {
        this.allowedPsuFormat = allowedPsuFormat;
    }

    public int getAllowedCpuCoolerHeight() {
        return allowedCpuCoolerHeight;
    }

    public void setAllowedCpuCoolerHeight(int allowedCpuCoolerHeight) {
        this.allowedCpuCoolerHeight = allowedCpuCoolerHeight;
    }

    public int getAllowedGpuLength() {
        return allowedGpuLength;
    }

    public void setAllowedGpuLength(int allowedGpuLength) {
        this.allowedGpuLength = allowedGpuLength;
    }
}
