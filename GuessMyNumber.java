import java.util.ArrayList;
import java.util.Scanner;



public class GuessMyNumber{
    public static void main(String[] args) {
        System.out.println("hello I'm Comp ( * o * )/. Can you guess my number? it's between 0 and 100");
        // generating Comps number
        int randomNr=(int)(Math.random()*101);
        System.out.println("");

        // Eingabe des Spielers
        Scanner scan=new Scanner(System.in);

        ArrayList<Integer> attempts=new ArrayList<>();

        boolean guessed=false;
        while (!guessed){
            System.out.print("Your attempts: ");
            for (int i=0; i<attempts.size(); i++){
                System.out.print(attempts.get(i) + "  ");
            }
            System.out.println("");
            System.out.print("You assume ... is my number");
            int playerNr=Integer.parseInt(scan.next());
            if(playerNr==randomNr){
                guessed=true;
                System.out.println("YAY---YOU---WIN---( * o * )// <3");
            }else{
                System.out.println("NOPE---TRY---AGAIN---");
                attempts.add(playerNr);
                if(playerNr<randomNr){
                    System.out.println("my number is bigger");
                }else{
                    System.out.println("my number is smaller");
                }
            }
        }
    }
}