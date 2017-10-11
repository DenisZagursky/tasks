package lesson1.practic1;

public class MmoGames extends Games {

    public MmoGames() {
    }

    @Override
    void play() {
        setTimeInGame(2);
        System.out.println("forgot 2 ours");
    }
}
