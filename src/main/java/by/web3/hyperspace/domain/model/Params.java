package by.web3.hyperspace.domain.model;

public class Params {
    private int repeatLastN;
    private double repeatPenalty;
    private int sampleLen;
    private int seed;
    private double temperature;
    private double topP;

    public int getRepeatLastN() {
        return repeatLastN;
    }

    public void setRepeatLastN(int repeatLastN) {
        this.repeatLastN = repeatLastN;
    }

    public double getRepeatPenalty() {
        return repeatPenalty;
    }

    public void setRepeatPenalty(double repeatPenalty) {
        this.repeatPenalty = repeatPenalty;
    }

    public int getSampleLen() {
        return sampleLen;
    }

    public void setSampleLen(int sampleLen) {
        this.sampleLen = sampleLen;
    }

    public int getSeed() {
        return seed;
    }

    public void setSeed(int seed) {
        this.seed = seed;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getTopP() {
        return topP;
    }

    public void setTopP(double topP) {
        this.topP = topP;
    }
}
