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
        switch (id){
            case 1:
                dept ="sales";
                break;
            case 2:
                dept= "it";
                break;
            case 3:
                dept = "HR";
                break;
            default:
                dept = " ";
        };

        emailGen e = new emailGen(fname,lname,dept,comp);
        System.out.println(e.gen_email());
    }
}
