package algos.tutorial.java;

import java.util.Arrays;

public class QuickUnion {
    private int[] prnt;

    public void QuickUnionUF(int N){
        prnt = new int[N];
        for (int i=0; i<N; i++){
            prnt[i]=i;
        }
    }

    public int find(int i)
    {
        while(i!=prnt[i]){
            i=prnt[i];
        }
        return i;
    }

    public void union(int p, int q){
        int parentP = find(p);
        int parentQ = find(q);

        prnt[parentP]=parentQ;
    }

    public boolean isConnected(int p, int q){
        return find(p)==find(q);
    }

    public static void main(String args[]){
        QuickUnion uf = new QuickUnion();
        uf.QuickUnionUF(10);
        System.out.print(Arrays.toString(uf.prnt));
        uf.union(2, 3);
        System.out.print(Arrays.toString(uf.prnt));
        uf.union(1, 2);
        System.out.print(Arrays.toString(uf.prnt));
    }
}
