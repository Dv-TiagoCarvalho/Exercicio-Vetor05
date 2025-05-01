import java.util.Scanner;

public class vetor05 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[12];
        int soma=0;
        int contador=0;
        int media;
        int contadorv2 =0;

        System.out.println("Digite 12 numeros (calcular Média)");

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
            contador++;
            soma+= vetor[i];

             } 
             
             media = soma/contador;

            for (int i = 0; i < vetor.length; i++) {
            
            if (vetor[i]>media) {
                
                contadorv2++;
                
            }

        }
              System.out.println("Média: " + media);
        System.out.println("Quantidade de Numeros maiores que a Média: " + contadorv2);
        scanner.close();
        
        }
        

        
    }

