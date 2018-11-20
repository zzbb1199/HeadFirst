package compound.mvc;

import java.util.ArrayList;

public class HeartModel implements HeartModelInterface {

    ArrayList<BeatObserver> beatObservers = new ArrayList<>();

    ArrayList<BPMObserver> bpmObservers = new ArrayList<>();


    @Override
    public int getHeartRate() {
        return 60;
    }

    @Override
    public void registerBeatObserver(BeatObserver observer) {
        beatObservers.add(observer);
    }

    @Override
    public void registerBPMObserver(BPMObserver observer) {
        bpmObservers.add(observer);
    }

    @Override
    public void removeBeatObserver(BeatObserver observer) {

    }

    @Override
    public void removeBpmObserver(BPMObserver observer) {

    }
}
