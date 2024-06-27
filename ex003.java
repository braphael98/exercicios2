import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma temperatura em celcius");
        double c1 = sc.nextDouble();
        double celciusToFarenheit = (c1*1.8)+32;

        System.out.println("A temperatura em Farneheit é: "+celciusToFarenheit);
        System.out.println("Digite a temperatura em farneheit: ");
        double f1 = sc.nextDouble();
        double farenheitToCelcius = (f1- 32)*5/9;
        System.out.println("Sua tempereatura em Celcius é: "+farenheitToCelcius);

        }
    }
