package coupling.loose_tight_coupling_JVM;
import coupling.loose_tight_coupling_JVM.loosegame.GameRunner;
import coupling.loose_tight_coupling_JVM.loosegame.GameRunner;
import coupling.loose_tight_coupling_JVM.loosegame.SuperContragame;
import coupling.loose_tight_coupling_JVM.loosegame.MarioGame;

//Here Gamerunner dont interact directly with the Games, instaed it interacts with the gaming console interface
//and Gaming console interface can be any game according to the parameter sent.

public class AppGamingbasic2 {
    public static void main(String args[]){
        var game = new MarioGame();    //object creation
        var gamerunner = new GameRunner(game); //object creation + wiring dependencies
        //Game is dependency of GameRunner

        gamerunner.run();
        System.out.println("hello world");
        System.out.println("hi harsha");
        System.out.println("hi buddi");

    }
}
