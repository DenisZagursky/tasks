package lesson1.practic1;

/**
 * Created by Dzenyaa on 06.10.2017.
 */
public class MobaGames extends MmoGames implements ClearUltil {
    public MobaGames() {
        super();
    }

    @Override
    public void clear() {
        int a = getTimeInGame();
        setTimeInGame(-a);
    }

    @Override
    void play() {
        setTimeInGame(48);
        System.out.println("forgot 2 days");
    }
}
