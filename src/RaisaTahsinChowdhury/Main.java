package raisa;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new
                Scanner(System.in);
        System.out.println("Enter the section : ");
        String section;
        section = input.nextLine();

        Hobby myHobby = new Hobby();
        Info myInfo = new Info();

        System.out.println("Your section is : " + section);
        System.out.println("Your name is : " + myInfo.name);
        System.out.println("Your id is : " + myInfo.id);
        System.out.println("Your hobby is : " + myHobby.hobbyName);
    }
    /*
    Name: Raisa Tahsin Chowdhury
    ID: 2012020140
    Section: 5(C)
    Email: cse_2012020140@lus.ac.bd
    Date: 16.07.21
 */
}
