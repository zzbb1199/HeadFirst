package adapter.facade;

public class HomeTheaterFacade {
    Amplifier amplifier;
    CdPlayer cdPlayer;

    public HomeTheaterFacade(Amplifier amplifier,CdPlayer cdPlayer){
        this.amplifier = amplifier;
        this.cdPlayer = cdPlayer;
    }

    public void watchMovie(){
        amplifier.on();
        cdPlayer.on();
    }

    public void endMovie(){
        amplifier.off();
        cdPlayer.off();
    }

}
