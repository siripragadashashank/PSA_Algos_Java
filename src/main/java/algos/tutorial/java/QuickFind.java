package algos.tutorial.java;

import java.util.Arrays;

public class QuickFind {
    private int[] id;

    public void QuickFindUF(int N){
       id = new int[N];
       for (int i=0; i<N; i++){
           id[i]=i;
       }
    }

    public int find(int p) {
        return id[p];
    }

    public void union(int p, int q){
        int parentP = id[p];
        int parentQ = id[q];

        for ( int i=0; i<id.length; i++)
        {
            if (id[i]==parentP){
                id[i]=parentQ;
            }
        }
    }

    public boolean isConnected(int p, int q){
        return id[p]==id[q];
    }

    public static void main(String args[]){
        QuickFind uf = new QuickFind();
        uf.QuickFindUF(10);
        System.out.print(Arrays.toString(uf.id));
        uf.union(2, 3);
        System.out.print(Arrays.toString(uf.id));
        uf.union(1, 2);
        System.out.print(Arrays.toString(uf.id));
        System.out.print(uf.isConnected(1, 2));
    }
}
