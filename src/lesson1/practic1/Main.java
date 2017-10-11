package lesson1.practic1;

public class Main {
    public static void main(String[] args) {

        Games mobaGames=new MobaGames();
        mobaGames.play();
        Games mmoGames=new MmoGames();
        mmoGames.play();

        MobaGames mobaGamesTest=new MobaGames();
        mobaGamesTest.play();
        mobaGamesTest.clear();

       System.out.println(mobaGamesTest.getTimeInGame());

    }
}
