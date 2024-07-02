import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Em que ano você nasceu? ");
        int nasc = t.nextInt();
        int i = 2024 - nasc;
        System.out.println("Sua idade é " + i);
        if (i >= 18) {
            System.out.println("Maior de idade");
            } else {
            System.out.println("Menor de idade");
        }
    }
}