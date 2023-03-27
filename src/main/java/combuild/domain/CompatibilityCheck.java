package combuild.domain;

import combuild.domain.parts.*;

import java.util.List;

public class CompatibilityCheck {

    // implements X limits Y as limit(X, Y)
    public static boolean mainBoardCpu(MainBoard mainBoard, Cpu cpu) {
        String cpuSocket = cpu.getCpuSocket();
        String allowedCpuSocket = mainBoard.getAllowedCpuSocket();
        return cpuSocket.equals(allowedCpuSocket);
    }

    public static boolean pcCaseGpu(PcCase pcCase, Gpu gpu) {
        int gpuLength = gpu.getGpuLength();
        int allowedGpuLength = pcCase.getAllowedGpuLength();
        return (gpuLength <= allowedGpuLength);
    }

    public static boolean noOfRamLimit(MainBoard mainBoard, Ram ram) {
        int maxNoOfRamBank = mainBoard.getMaxNoOfRamBank();
        int noOfRamSticks = ram.getNoOfRamSticks();
        return (noOfRamSticks <= maxNoOfRamBank);
    }

    public static boolean pcCaseMainBoardSize(PcCase pcCase, MainBoard mainBoard) {
        List<String> allowedMainBoardFormat = pcCase.getAllowedMainBoardFormat();
        String allowedSizeFormat = mainBoard.getAllowedSizeFormat();
        return allowedMainBoardFormat.contains(allowedSizeFormat);
    }

    public static boolean cpuCpuCooler(Cpu cpu, Cooler cooler) {
        List<String> allowedCpuSocket = cooler.getAllowedCpuSocket();
        String cpuSocket = cpu.getCpuSocket();
        return allowedCpuSocket.contains(cpuSocket);
    }

    public static boolean cpuCoolerHeight(PcCase pcCase, Cooler cooler) {
        int allowedCpuHeight = pcCase.getAllowedCpuCoolerHeight();
        int cpuCoolerHeight = cooler.getCpuCoolerHeight();
        return (cpuCoolerHeight <= allowedCpuHeight);
    }

    public static boolean gpuLength(PcCase pcCase, Gpu gpu) {
        int allowedGpuLength = pcCase.getAllowedGpuLength();
        int gpuLength = gpu.getGpuLength();
        return (gpuLength <= allowedGpuLength);
    }

    public static boolean psuFormat(PcCase pcCase, Psu psu) {
        List<String> allowedPsuFormat = pcCase.getAllowedPsuFormat();
        String psuFormat = psu.getPsuFormat();
        return allowedPsuFormat.contains(psuFormat);
    }

    public static boolean isM2Allowed(MainBoard mainBoard, HddSsd hddSsd) {
        boolean hasMDot2Slot = mainBoard.isM2SlotExist();
        String connectionInterface = hddSsd.getConnectionInterface();
        if(!connectionInterface.equals("M2")) return true;
        return hasMDot2Slot;
    }

    public static boolean IsMoreThanRecommendedPower(Gpu gpu, Psu psu) {
        // TODO: implement this method
    }


    /*
    recommendedPsuWattage
    PSU: wattage
    */
}
