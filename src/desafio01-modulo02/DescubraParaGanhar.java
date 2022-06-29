import java.util.Random;
import java.util.Scanner;

public class DescubraParaGanhar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número de 1 a 10 para iniciar o jogo de descoberta: ");
        int respostaUsuario = input.nextInt();
        Random numeroGerado = new Random();
        int valor = numeroGerado.nextInt(11);
        int pontuaçãoTotal = 0;
        input.close();
        if (respostaUsuario >= 12) {
            System.out.println("Número inválido, escolha um dentro da escala sugerida inicialmente!");
        }
        if (valor == respostaUsuario){
            System.out.println("Você fez 10 pontos!");
            pontuaçãoTotal =+ 10;
        } else if (valor == (respostaUsuario -1)) {
            System.out.println("você fez 5 pontos!");
            pontuaçãoTotal =+ 5;

        } else if (valor == (respostaUsuario +1)) {
            System.out.println("Você fez 5 pontos!");
            pontuaçãoTotal =+5;

        } else {
            System.out.println("você perdeu, tente novamente!");
        }
        System.out.println("Sua pontuação total foi: " +pontuaçãoTotal);
    }
}
