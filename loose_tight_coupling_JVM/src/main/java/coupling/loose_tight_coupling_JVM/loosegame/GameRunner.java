
package coupling.loose_tight_coupling_JVM.loosegame;


public class GameRunner {

    private GamingConsole game;

    public GameRunner(GamingConsole game) {
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