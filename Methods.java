import java.util.Scanner;
class Methods{
    public static void main(String args[]){
    
        Scanner input = new Scanner(System.in);
        Tuna2 tunaObject = new Tuna2();
        
        System.out.println("Enter your name here: ");
        String name = input.nextLine();
        
        tunaObject.simpleMessage(name);

    }
}
