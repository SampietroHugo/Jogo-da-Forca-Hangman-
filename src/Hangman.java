import java.util.*;

public class Hangman{
    public static Scanner input = new Scanner(System.in);
    public static void Banner(){
        System.out.println();
        System.out.println();
        System.out.println("╔═══════════════════════════════╗");
        System.out.println("║        *JOGO DA FORCA*        ║");
        System.out.println("╚═══════════════════════════════╝");
        System.out.println();
        System.out.println("╔═══════════════════════════════╗");
        System.out.println("║            REGRAS:            ║");
        System.out.println("║                               ║");
        System.out.println("║ -> Tema: Animais.             ║");
        System.out.println("║ -> Não utilize acentos.       ║");
        System.out.println("║ -> 5 vidas (tentativas)!      ║");
        System.out.println("║ -> Apenas letras minúsculas.  ║");
        System.out.println("╚═══════════════════════════════╝");
        System.out.println();
        System.out.println();
    }
    public static char menu(){
        char resposta;
        System.out.println();
        System.out.println("        -=-=-=-=- Deseja Jogar novamente? -=-=-=-=-");
        System.out.println(("-=-=-=-=- S(sim) ou qualquer outro botão para não -=-=-=-=-"));
        System.out.print("-=-=-=- Resposta: ");
        return resposta = input.next().charAt(0);
    }
    public static void main(String[] args) {
        String[] palavras = {"cavalo", "coelho", "coruja", "jacare", "macaco",
                             "ovelha", "raposa", "zangao", "gaviao", "arraia",
                             "moscas", "urubus", "peixes", "galope", "abelha"};
        Random sorteio = new Random();
        char[] acertos = {'_', '_', '_', '_', '_', '_'};
        int vida = 5, fim = 1;
        char resposta, letra;

        do{
            Banner();
            int numero = sorteio.nextInt(15);
            String forca = palavras[numero];

            do {
                System.out.println();
                System.out.print("Digite uma letra: ");
                letra = input.next().charAt(0);

                if (letra == forca.charAt(0)) {
                acertos[0] = letra;
                System.out.println("Acertou: " +
                        acertos[0] + " " + acertos[1] + " " + acertos[2] + " " + acertos[3] + " " + acertos[4]
                        + " " + acertos[5]);

            }
            if (letra == forca.charAt(1)) {
                acertos[1] = letra;
                System.out.println("Acertou: " +
                        acertos[0] + " " + acertos[1] + " " + acertos[2] + " " + acertos[3] + " " + acertos[4]
                        + " " + acertos[5]);

            }
            if (letra == forca.charAt(2)) {
                acertos[2] = letra;
                System.out.println("Acertou: " +
                        acertos[0] + " " + acertos[1] + " " + acertos[2] + " " + acertos[3] + " " + acertos[4]
                        + " " + acertos[5]);

            }
            if (letra == forca.charAt(3)) {
                acertos[3] = letra;
                System.out.println("Acertou: " +
                        acertos[0] + " " + acertos[1] + " " + acertos[2] + " " + acertos[3] + " " + acertos[4]
                        + " " + acertos[5]);

            }
            if (letra == forca.charAt(4)) {
                acertos[4] = letra;
                System.out.println("Acertou: " +
                        acertos[0] + " " + acertos[1] + " " + acertos[2] + " " + acertos[3] + " " + acertos[4]
                        + " " + acertos[5]);

            }
            if (letra == forca.charAt(5)) {
                acertos[5] = letra;
                System.out.println("Acertou: " +
                        acertos[0] + " " + acertos[1] + " " + acertos[2] + " " + acertos[3] + " " + acertos[4]
                        + " " + acertos[5]);

            }
            if (letra != forca.charAt(0) && letra != forca.charAt(1) && letra != forca.charAt(2)
                    && letra != forca.charAt(3) && letra != forca.charAt(4) && letra != forca.charAt(5)) {
                System.out.println("!Ay Caramba! Perdeu uma vida!");
                vida = vida - 1;
                System.out.println("Total de vidas: " + vida + ".");

            }
            if (acertos[0] == forca.charAt(0) && acertos[1] == forca.charAt(1) && acertos[2] == forca.charAt(2)
                    && acertos[3] == forca.charAt(3) && acertos[4] == forca.charAt(4)
                    && acertos[5] == forca.charAt(5)) {
                fim -= 1;
            }

            }while (vida > 0 && fim > 0);

        if (vida == 0) {
            System.out.println();
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Você PERDEU :( a resposta era: " + palavras[numero]);
        } else {
            System.out.println();
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("Você Acertou!! A resposta final era " + palavras[numero] + "!!");
        }

            vida = 5;
            fim = 1;
            acertos = new char[]{'_','_','_','_','_','_'};
            resposta = menu();

        }while(resposta == 'S' || resposta == 's');

        System.out.println();
        System.out.println();
        System.out.println("╔═══════════════════════════════╗");
        System.out.println("║     *OBRIGADO POR JOGAR*      ║");
        System.out.println("╚═══════════════════════════════╝");        
        

    }
}
