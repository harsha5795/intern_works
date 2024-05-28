package coupling.loose_tight_coupling_JVM;


import coupling.loose_tight_coupling_JVM.tightgame.GameRunner;
import coupling.loose_tight_coupling_JVM.tightgame.SuperContragame;
import coupling.loose_tight_coupling_JVM.tightgame.MarioGame;

public class AppGamingbasic {
    public static void main(String args[]){
//        var marioGame = new MarioGame();
//        var gameRunner = new GameRunner(marioGame);

        var Supercontragame = new SuperContragame();
        var gameRunner = new GameRunner(Supercontragame);

        gameRunner.run();
    }
}
