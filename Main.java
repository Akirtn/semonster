public class Main {
  public static void main(String[] args) {
    System.out.println("SEMONSTER!!!");
    Monster monster = new Monster();
    System.out.println(monster.toString());
    Player p1 = new Player();
    p1.drawMonsters();
    p1.showDeck();
  }
}
