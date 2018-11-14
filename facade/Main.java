package facade;

public class Main {
    public static void main(String[] args){
        //init facade
        Amplifier amplifier = new Amplifier();
        CdPlayer cdPlayer = new CdPlayer();
        HomeTheaterFacade theaterFacade = new HomeTheaterFacade(amplifier,cdPlayer);

        //run
        theaterFacade.watchMovie();
        theaterFacade.endMovie();

    }
}
