import java.util.Scanner;


public class TicTacToe {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Printer.welcome();
    String gameChoice = scanner.nextLine();
    if (gameChoice == "1") {
      
    }

    Board board = new Board();
    board.render();
  }
}
