package compound.mvc;

public class HeartAdapter implements BeatModelInterface {

    HeartModelInterface heart;

    public HeartAdapter(HeartModelInterface heart) {
        this.heart = heart;
    }

    @Override
    public void initialize() {

    }

    @Override
    public void on() {

    }

    @Override
    public void off() {

    }

    @Override
    public void setBPM(int bpm) {

    }

    @Override
    public int getBPM() {
        return heart.getHeartRate();
    }

    @Override
    public void registerObserver(BeatObserver observer) {
        heart.registerBeatObserver(observer);
    }

    @Override
    public void removeObserver(BeatObserver observer) {
        heart.removeBeatObserver(observer);
    }

    @Override
    public void registerObserver(BPMObserver observer) {
        heart.registerBPMObserver(observer);
    }

    @Override
    public void removeObserver(BPMObserver observer) {
        heart.removeBpmObserver(observer);
    }
}
