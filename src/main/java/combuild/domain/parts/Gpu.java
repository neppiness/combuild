package combuild.domain.parts;

public class Gpu implements Part {

    int gpuLength, gpuTdp, recommendedPsuWattage;

    public int getGpuLength() {
        return gpuLength;
    }

    public void setGpuLength(int gpuLength) {
        this.gpuLength = gpuLength;
    }

    public int getGpuTdp() {
        return gpuTdp;
    }

    public void setGpuTdp(int gpuTdp) {
        this.gpuTdp = gpuTdp;
    }

    public int getRecommendedPsuWattage() {
        return recommendedPsuWattage;
    }

    public void setRecommendedPsuWattage(int recommendedPsuWattage) {
        this.recommendedPsuWattage = recommendedPsuWattage;
    }
}
