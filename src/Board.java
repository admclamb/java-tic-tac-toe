
public class Board {
  String[][] positions = {{" ", " ", " "},{" ", " ", " "},{" ", " ", " "},};
  Board() {}

  public void addPosition(int x, int y, String playerCharacter) {
    this.positions[x][y] = playerCharacter;
  }

  public void render() {
    System.out.println(positions[0][0] + " | " + positions[0][1] + " | " + positions[0][2]);
    System.out.println("--+---+--");
    System.out.println(positions[1][0] + " | " + positions[1][1] + " | " + positions[1][2]);
    System.out.println("--+---+--");
    System.out.println(positions[2][0] + " | " + positions[2][1] + " | " + positions[2][2]);
  }
}
