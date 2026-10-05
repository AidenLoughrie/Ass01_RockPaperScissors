

import java.util.Scanner;

public class TaskRPS {
    static void main () {

Scanner sc = new Scanner(System.in);
String playerA;
 String playerB;
 String playAgain = "Y";

while (playAgain.equals("Y")) {

System.out.println("Player A, enter R, P, or S: ");
playerA = sc.nextLine();

System.out.println("Player B, enter R, P, or S: ");
playerB = sc.nextLine();

    if (playerA.equals(playerB)) {
        System.out.println(playerA + " vs " + playerB + " It's a Tie!"); }

    else if (playerA.equals("R") && playerB.equals("S")) {
        System.out.println("Rock breaks Scissors, Player A wins!"); }
    else if (playerA.equals("P") && playerB.equals("R")) {
        System.out.println("Paper covers Rock, Player A wins!"); }
    else if (playerA.equals("S") && playerB.equals("P")) {
        System.out.println("Scissors cuts Paper, Player A wins!"); }
    else if (playerB.equals("R") && playerA.equals("S")) {
        System.out.println("Rock breaks Scissors, Player B wins!"); }
    else if (playerB.equals("P") && playerA.equals("R")) {
        System.out.println("Paper covers Rock, Player B wins!"); }
    else if (playerB.equals("s")&& playerA.equals("P")){ System.out.println("Scissors cuts Paper, Player B wins!"); }

    else{ System.out.println("Invalid Input!"); }

    System.out.print("Play again? Enter Y or N: ");
    playAgain = sc.next(); }


System.out.println("Thanks for playing!");
sc.close();



        }
    }


