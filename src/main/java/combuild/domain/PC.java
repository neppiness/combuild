package combuild.domain;

import combuild.domain.part.*;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PC {
    final CPU cpu;
    final CPUCooler cpuCooler;
    final GPU gpu;
    final RAM ram;
    final SecondaryMemory secondaryMemory;
    final PSU psu;
    final PCCase pcCase;

    public boolean isCompatible() {
        if (this.cpu == null) return false;
        if (!this.cpu.hasIGpu && this.gpu == null) return false;
        if (this.ram == null) return false;
        if (this.secondaryMemory == null) return false;
        if (this.psu == null) return false;
        if (this.pcCase == null) return false;
        return true;
    }

    public boolean wattageCheck() {
        // TODO: power capacity check
        return true;
    }
}
