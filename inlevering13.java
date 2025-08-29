import java.util.Scanner;

public class inlevering13 {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Skriv et heltal: ");
        int n = input.nextInt();
        int tal = n;
        
        for(int i = 1; i < n;){
        tal = (tal * (n - 1));
        n--;
        }
        System.out.println("n! er: " + tal);

}      
}        

