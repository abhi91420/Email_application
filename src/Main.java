/*
* This project takes into account an employee details and generate the following using different functions -
* Email
* Password
* */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String fname;
        String lname;
        String dept;
        String comp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter details :");
        System.out.println("First Name - ");
        fname =sc.nextLine();
        System.out.println("last Name - ");
        lname = sc.nextLine();
        System.out.println("Company - ");
        comp = sc.nextLine();
        System.out.println("Select Department - ");
        System.out.println("1.sales\n2.it\n3.HR");
        int id = sc.nextInt();
        dept = switch (id) {
            case 1 -> "sales";
            case 2 -> "it";
            case 3 -> "HR";
            default -> " ";
        };

        emailGen e = new emailGen(normalize(fname),normalize(lname),dept,normalize(comp));
        System.out.println("Generated Email : "+e.gen_email());
        System.out.println("Corresponding pass :"+e.get_pass());
    }

    private static String normalize(String S) {
        return S.toLowerCase();
    }
}
