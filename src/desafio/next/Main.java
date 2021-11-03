package desafio.next;

import desafio.next.entities.MagicIndex;

public class Main {

    public static void main(String[] args) {

        int[] A = {-1, 0, 1, 2, 4, 10};
        MagicIndex magicIndex = new MagicIndex();
        magicIndex.busca(A,0,A.length);

    }
}
