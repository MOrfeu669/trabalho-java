import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int numeroDeTentativas = 10; // Limite de tentativas
        int tentativasUsadas = 0;
        boolean acertou = false;

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Estou pensando em um número entre 1 e 100.");
        System.out.println("Você tem " + numeroDeTentativas + " tentativas para adivinhar.");
        
        while (tentativasUsadas < numeroDeTentativas && !acertou) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();
            tentativasUsadas++;

            if (palpite == numeroSecreto) {
                acertou = true;
            } else if (palpite < numeroSecreto) {
                System.out.println("Seu palpite é menor que o número secreto.");
            } else {
                System.out.println("Seu palpite é maior que o número secreto.");
            }

            if (!acertou) {
                System.out.println("Tentativas restantes: " + (numeroDeTentativas - tentativasUsadas));
            }
        }

        if (acertou) {
            System.out.println("Parabéns! Você acertou o número em " + tentativasUsadas + " tentativas!");
        } else {
            System.out.println("Você não conseguiu adivinhar o número. O número era " + numeroSecreto + ".");
        }
    }
}
