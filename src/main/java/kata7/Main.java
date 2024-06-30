package kata7;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder inputBuilder = new StringBuilder();
        String line;

        System.out.println("Introduce initial state of the board ('X' -> alive cell, '.' -> dead cell):");
        while(!(line = scanner.nextLine()).isEmpty()){
            inputBuilder.append(line).append("\n");
        }

        String input = inputBuilder.toString().trim();

        Board board = new Board(input);
        Board nextBoard = board.next();
        System.out.println("Siguiente generacion: \n" + nextBoard.state());
    }
}