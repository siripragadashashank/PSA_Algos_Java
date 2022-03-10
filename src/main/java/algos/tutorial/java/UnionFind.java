package algos.tutorial.java;

import java.util.Arrays;

public class UnionFind {
    private int[] id;

    public void QuickFindUF(int N){
       id = new int[N];
       for (int i=0; i<N; i++){
           id[i]=i;
       }
    }

    public int find(int p)
    {
        return id[p];
    }

    public void union(int p, int q){
        int pid = id[p];
        int qid = id[q];

        for ( int i=0; i<id.length; i++)
        {
            if (id[i]==pid){
                id[i]=qid;
            }
        }
    }

    public static void main(String args[]){
        UnionFind uf = new UnionFind();
        uf.QuickFindUF(10);
        System.out.print(Arrays.toString(uf.id));
        uf.union(2, 3);
        System.out.print(Arrays.toString(uf.id));
        uf.union(1, 2);
        System.out.print(Arrays.toString(uf.id));
    }
}
