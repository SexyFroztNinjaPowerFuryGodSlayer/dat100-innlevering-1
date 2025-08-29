import java.util.Scanner;

public class inlevering12 {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < 10; i++){
            
        System.out.println("Poäng: ");
        int pp = input.nextInt();
        
        if(pp < 0 || pp > 100){
        System.out.println("Ugyldigt poäng, skriv på nytt.");
        i--;    
        }else
        
        if (pp >= 0 && pp <= 39){
        System.out.println("F");
        
        }else if (pp >= 41 && pp <= 49){
        System.out.println("E");
        
        }else if (pp >= 51 && pp <= 59){
        System.out.println("D");
        
        }else if (pp >= 60 && pp <= 79){
        System.out.println("C");
        
        }else if (pp >= 81 && pp <= 89){
        System.out.println("B");
        
        }else if (pp >= 90 && pp <= 100){
        System.out.println("A");
        }
        }input.close();
}      
}        
