import java.util.Scanner;
import java.util.Locale;

public class degreeConverter{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        float user_degree,convertion_result;
        System.out.println("---Conversor de Graus---");


        System.out.println("1.Converter para Fahrenheit\n2.Converter para Celsius");
        int user_option = scanner.nextInt();

        switch (user_option) {
            case 1:
                System.out.print("Digite o valor em Cº para converter: ");
                user_degree = scanner.nextFloat();
                convertion_result = (user_degree * (9f/5f)) + 32f;
                System.out.printf("Valor de %.2fº Celsius para Fahrenheit é: %.2fºF\n ",user_degree,convertion_result);
                break;
            case 2:
                System.out.print("Digite o valor em Fº para converter: ");
                user_degree = scanner.nextFloat();
                convertion_result = (user_degree - 32f) * (5f/9f);
                System.out.printf("Valor de %.2fº Fahrenheit para Celsius é: %.2fºC\n",user_degree,convertion_result);
                break;
            default:
                System.out.println("Digite uma opção valida.");
                break;
        }
        scanner.close();
    }
}