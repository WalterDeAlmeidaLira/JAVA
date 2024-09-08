import java.util.Scanner;
public class BuscaLinear{
    
    public static void main(String[] args) {
        //IMPORTANDO LEITOR
        Scanner leitor = new Scanner(System.in);
        // CRIANDO ARRAY 
        double[] vetor = new double[5];
        //INSERINDO VALORES NO ARRAY 
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("");
            System.out.print("digite um número:");
            vetor[i] = leitor.nextDouble();
        }

        System.out.println("Digite um número para buscar no vetor");
        double buscador = leitor.nextDouble();

        //VALOR PARA BUSCAR NO ARRAY
        buscaLinear(vetor,buscador);

        imprimirVetor(vetor);

       leitor.close();
    }

    public static void imprimirVetor(double[] vetor){
        //METODO PARA IMPRIMIR VETOR
        System.out.println("");
        System.out.println("=======================================");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("pos: "+i+" valor: "+ vetor[i]);
        }
        System.out.println("=======================================");
    }

    public static void  buscaLinear(double[] vetor, double busca){
        //ALGORITMO DE BUSCA LINEAR
        System.out.println("=======================================");
        for (int i = 0; i < vetor.length; i++) {
            if(busca == vetor[i]){                
                System.out.print("O número pesquisado está na posição "+ i +" do vetor!");
                break;
            }
        }      
        
    }
}