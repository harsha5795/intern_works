package coupling.loose_tight_coupling_JVM.loosegame;

public class MarioGame implements GamingConsole {
  public void up(){
      System.out.println("jump");
  }
  public void down(){
      System.out.println("Go into the hole");
  }
  public void left(){
      System.out.println("Go back");
  }
  public void right(){
      System.out.println("move front");
  }
}
