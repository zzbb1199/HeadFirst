package compound.mvc;

public interface HeartModelInterface {
    int getHeartRate();
    void registerBeatObserver(BeatObserver observer);
    void registerBPMObserver(BPMObserver observer);

    void removeBeatObserver(BeatObserver observer);
    void removeBpmObserver(BPMObserver observer);
}
