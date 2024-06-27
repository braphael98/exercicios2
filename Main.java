import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = 0; //a primeira vale 4
        double n2 = 0;//a segunda vale 6;
        double mediaGeral = 0;

        double media = 0;

        for (int i = 0; i < 2 ; i++) {
            System.out.println("Digite suas medias: ");
            n1 = sc.nextDouble();
            sc.nextLine();
            n2 = sc.nextDouble();
            media =  media+(n1 + n2)/10;
            System.out.println(media);
        }
        System.out.println(media+media/2);





    }
}