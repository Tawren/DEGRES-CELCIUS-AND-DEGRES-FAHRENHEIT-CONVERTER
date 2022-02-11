import java.util.Scanner;

public class convert1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        double aConvertir, convertit=0;
        char reponse=' ', mode=' ';
        
        System.out.println("DEGRES CELCIUS AND DEGRES FAHRENHEIT CONVERTER");
        System.out.println("----------------------------------------------------------------------------");
        
        do{
            
            do{
                mode = ' ';
                System.out.println("Choose the conversion mode:");
                System.out.println("1 - Converter Celsius - Fahrenheit");
                System.out.println("2 - Converter Fahrenheit - Celsius");
                mode = sc.nextLine() .charAt(0);
                
                if(mode != '1' && mode != '2')
                    System.out.println("Unknown mode, please repeat your choice.");
                
            }while (mode != '1' && mode != '2');
            
            System.out.println("Temperature to convert:");
            aConvertir = sc.nextDouble();
            
            sc.nextLine();
            
            if(mode == '1') {
                convertit = ((9.0/5.0) * aConvertir) + 32.0;
                System.out.print(aConvertir + " °C corresponds to :");
                System.out.println(arrondi(convertit, 2) + " °F.");
            }
            else {
                convertit = ((aConvertir - 32) * 5) / 9;
                System.out.print(aConvertir + " °F corresponds to :");
                System.out.println(arrondi(convertit, 2) + " °C.");
            }
            
            
            do{
                System.out.println("Do you want to convert another temperature? (Y/N)");
                reponse = sc.nextLine() .charAt(0);
                
            }while(reponse != 'Y' && reponse != 'N');
            
        }while(reponse == 'Y');
        
        System.out.println("Good bye!");

    }
    
    public static double arrondi(double A, int B) {
        return (double) ( (int) (A * Math.pow(10,  B) + .5)) / Math.pow(10,  B);
    }

}