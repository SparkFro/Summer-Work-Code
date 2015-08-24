
import java.util.Scanner;
class constructor{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        tuna1 tunaObject = new tuna1();
        System.out.println("Enter name of first gf here: ");
        String temp = input.nextLine();
        tunaObject.setName(temp);
        tunaObject.saying();
    }
}
