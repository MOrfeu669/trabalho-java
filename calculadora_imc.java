import java.util.Scanner;

public class IMCCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu gênero (M, F, N):");
        char genero = scanner.next().toUpperCase().charAt(0);
        
        System.out.println("Digite sua altura em metros (por exemplo, 1.75):");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso em quilogramas (por exemplo, 70):");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String classificacao = "";
        if (genero == 'M') {
            if (imc < 20.7) classificacao = "Abaixo do peso";
            else if (imc <= 26.4) classificacao = "Peso normal";
            else if (imc <= 27.8) classificacao = "Marginalmente acima do peso";
            else if (imc <= 31.1) classificacao = "Acima do peso ideal";
            else classificacao = "Obeso";
        } else {
            if (imc < 19.1) classificacao = "Abaixo do peso";
            else if (imc <= 25.8) classificacao = "Peso normal";
            else if (imc <= 27.3) classificacao = "Marginalmente acima do peso";
            else if (imc <= 32.3) classificacao = "Acima do peso ideal";
            else classificacao = "Obeso";
        }

        System.out.println("\nResultado:");
        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Peso: " + peso + " kg");
        System.out.println("IMC: " + String.format("%.2f", imc));
        System.out.println("Classificação: " + classificacao);
    }
}
