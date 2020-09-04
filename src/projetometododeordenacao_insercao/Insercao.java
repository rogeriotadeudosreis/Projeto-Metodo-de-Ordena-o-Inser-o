
package projetometododeordenacao_insercao;

public class Insercao {

    public static void main(String[] args) {
        int[] vetor = {12, 35, 48, 62, 11, 8, 63, 24, 28, 30};
        
        Insercao vet = new Insercao();
        vet.ordena_insercao(vetor, 10);
        for (int valores : vetor) {
            System.out.print(valores + " ");
        }        
    }
    
    public void ordena_insercao(int vetor[], int tamanho){
        int atual;
        int i;
        int j;
        for (i = 1; i < tamanho; i++) {
            atual = vetor[i];
             j = i -1;
            while (j>= 0 && atual < vetor[j]){
                vetor[j+1] = vetor[j];
                j--;                
            }
            vetor[j+1] = atual;
        }
    }
}
