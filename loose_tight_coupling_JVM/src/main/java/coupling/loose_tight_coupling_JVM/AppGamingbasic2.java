package coupling.loose_tight_coupling_JVM;

import coupling.loose_tight_coupling_JVM.loosegame.GameRunner;
import coupling.loose_tight_coupling_JVM.loosegame.SuperContragame;
import coupling.loose_tight_coupling_JVM.loosegame.MarioGame;

public class AppGamingbasic2 {
    public static void main(String args[]){
        var game = new MarioGame();    //object creation
        var gamerunner = new GameRunner(game); //object creation + wiring dependencies
        //Game is dependency of GameRunner
        gamerunner.run();

    }
}
