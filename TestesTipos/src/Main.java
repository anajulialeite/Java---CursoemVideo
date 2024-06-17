//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);*/

        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.printf("%.2fr", idade);
    }
}