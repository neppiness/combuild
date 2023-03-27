package combuild.domain.parts;

public class Ram implements Part {

    String ramSocket;
    int noOfRamSticks;

    public String getRamSocket() {
        return ramSocket;
    }

    public void setRamSocket(String ramSocket) {
        this.ramSocket = ramSocket;
    }

    public int getNoOfRamSticks() {
        return noOfRamSticks;
    }

    public void setNoOfRamSticks(int noOfRamSticks) {
        this.noOfRamSticks = noOfRamSticks;
    }
}
