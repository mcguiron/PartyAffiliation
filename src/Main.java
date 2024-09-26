import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String partyAffil = "";


        System.out.print("Please enter your political party affiliation [RDI]: ") ;
        partyAffil = in.nextLine();

            if (partyAffil.equalsIgnoreCase("R")) {
                System.out.println("You get a Republican Elephant");
            } else if (partyAffil.equalsIgnoreCase("D")) {
                System.out.println("You get a Democratic Donkey");
            } else if (partyAffil.equalsIgnoreCase("I")) {
                System.out.println("You get a Independent Man");
            } else {
                System.out.println("I dont know what party you belong to!");
            }


    }
}