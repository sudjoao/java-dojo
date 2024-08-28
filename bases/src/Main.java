import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Digite 1 para rodar as notas e 2 para a sequencia de fibonnaci");
        int choiche = scanner.nextInt();
        if(choiche == 1){
            runScore();
        } else {
            getRange();
        }
    }

    static void runScore() {
        int x, y, z;
        System.out.println("Digite a primeira nota");
        x = scanner.nextInt();

        System.out.println("Digite a segunda nota");
        y = scanner.nextInt();

        System.out.println("Digite a terceira nota");
        z = scanner.nextInt();

        String result = """
                O resultado da soma entre %d %d %d é: %d
                """.formatted(x, y, z, x+y+z);

        System.out.println(result);
    }

    static void getRange(){
        int rightNumber = 0, leftNumber =1;
        int num;


        System.out.println("Digite a quantidade de números");
        num = scanner.nextInt();

        for (int i=0; i<num; i++) {
            int result = rightNumber + leftNumber;
            System.out.println(result);
            leftNumber = rightNumber;
            rightNumber = result;
        }
    }
}