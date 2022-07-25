package tictactoe;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    static {
        System.out.print("Enter cells: ");
    }

    static char[] cells = scanner.nextLine().toCharArray();
    static char[][] game = new char[3][3];
    static int count = 0, countX = 0, countO = 0, dash = 0;

    public static void main(String[] args) {
        String gameState = " ";
        printGame();
    }

    static void printGame() {
        System.out.println("---------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                game[i][j] = cells[count++];
                System.out.print(game[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }


}


//
//    public static void main(String[] args) {
//        game = field.split("");
//        printGame();
//        gettingGame();
//    }
//
//    static void printGame() {
//        System.out.println("---------");
//        System.out.println("| " + game[0] + " " + game[1] + " " + game[2] + " |");
//        System.out.println("| " + game[3] + " " + game[4] + " " + game[5] + " |");
//        System.out.println("| " + game[6] + " " + game[7] + " " + game[8] + " |");
//        System.out.println("---------");
//    }
//
//    static void gettingGame() {
//        int xCount = 0, oCount = 0, find = 0, length = field.length();
//        int[] count = new int[256];
//        for (int i = 0; i < length; i++)
//            count[field.charAt(i)]++;
//        char[] ch = new char[field.length()];
//        for (int i = 0; i < length; i++) {
//            ch[i] = field.charAt(i);
//            for (int j = 0; j <= i; j++) {
//                if (field.charAt(i) == ch[j]) find++;
//            }
//            if (field.charAt(i) == 'X') {
//                xCount = count[field.charAt(i)];
//            }
//            if (field.charAt(i) == 'O') {
//                oCount = count[field.charAt(i)];
//            }
//        }
//
//        for (int i = 0; i < 1; i++) {
//            if (xCount == 3) {
//                System.out.println("X wins");
//            } else if (oCount == 3) {
//                System.out.println("O wins");
//            } else if (oCount == xCount) {
//                System.out.println("Draw");
//            }
//        }
//    }
//}