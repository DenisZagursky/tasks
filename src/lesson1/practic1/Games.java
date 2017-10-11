package lesson1.practic1;

/**
 * Created by Dzenyaa on 06.10.2017.
 */
public abstract class Games {
   private int timeInGame;

    public int getTimeInGame() {
        return timeInGame;
    }

    public void setTimeInGame(int timeInGame) {
        this.timeInGame+= timeInGame;
    }

    abstract void play();

}
