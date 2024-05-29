package coupling.loose_tight_coupling_JVM.tightgame;
//gameRunner is tightly coupled with a single game.
//Tight coupling means high dependency  i.e at an instant Gamerunner class can
//points to a single game(parent) only
//if we want a change from one game to another we need to make an entire code change to
//the Gamerunner class



public class GameRunner {
//    private MarioGame game;

//    public GameRunner(MarioGame game){
//        this.game = game;
//    }

    private SuperContragame game;

    public GameRunner(SuperContragame game) {
      this.game = game;
    }



    public void run() {
        System.out.println("running game:" + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }

}

