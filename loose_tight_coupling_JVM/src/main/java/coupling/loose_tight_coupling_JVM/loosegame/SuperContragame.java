package coupling.loose_tight_coupling_JVM.loosegame;

public class SuperContragame implements GamingConsole{
    public void up(){
        System.out.println("jump");
    }
    public void down(){
        System.out.println("sit down");
    }
    public void left(){
        System.out.println("Go back");
    }
    public void right() {
        System.out.println("shoot a bullet");
    }
}
