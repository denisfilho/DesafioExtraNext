package desafio.next.entities;

public class MagicIndex {
    public void busca(int[] vetor, int inicio, int fim){

        if(inicio<=fim){
            int meio = (inicio+fim)/2;
            if(vetor[meio] == meio){
                System.out.println("Magic Index: " + meio);
                System.exit(0);
            }
            if(vetor[meio]<meio){
                busca(vetor, meio, fim);
            }
            else{
                busca(vetor, inicio, meio);
            }
        }
        System.out.println("Não há Magic Index!");
    }
}
