import java.util.Scanner;

public class inlevering11 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bruttolön: ");
        int blon = input.nextInt();
        
        double trinn1 = 0.017;
        double trinn2 = 0.04;
        double trinn3 = 0.137;
        double trinn4 = 0.167;
        double trinn5 = 0.177;
        
        int trinnmax1 = (int) ((306050 - 217400) * trinn1);
        int trinnmax2 = (int) (((697150 - 306051) * trinn2) + trinnmax1);
        int trinnmax3 = (int) (((942400 - 697151) * trinn3) + trinnmax2);
        int trinnmax4 = (int) (((1410750 - 697151) * trinn2) + trinnmax3);
        
        
        if(blon <= 217400){
             System.out.println("Ingen trinskatt.");
             
        }
        else if(blon >= 217401 && blon <= 306050){
            System.out.println("Du må betale " + (int)((blon - 217400) * trinn1) + "kr i trinnskatt.");
            
        }
        else if(blon >= 306051 && blon <= 697150){
            System.out.println("Du må betale " + (int)(((blon - 306050) * trinn2) + trinnmax1) + "kr i trinnskatt.");
        
        }
        else if(blon >= 697151 && blon <= 942400){
            System.out.println("Du må betale " + (int)(((blon - 697150) * trinn3) + trinnmax2) + "kr i trinnskatt.");
        
        }
        else if(blon >= 942401 && blon <= 1410750){
            System.out.println("Du må betale " + (int)(((blon - 942400) * trinn4) + trinnmax3) + "kr i trinnskatt.");
        
        }
        else if(blon >= 1410751){
            System.out.println("Du må betale " + (int)(((blon - 1410750) * trinn5) + trinnmax4) + "kr i trinnskatt.");
        
        }
        input.close();
    }
}
