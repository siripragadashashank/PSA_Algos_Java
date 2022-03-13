package algos.tutorial.java;

import java.util.Arrays;

public class WeightedQuickUnion {
    private int[] prnt;
    private int[] sz;

    public void WQuickUnionUF(int N){
        prnt = new int[N];
        sz = new int[N];
        for(int i=0; i<N; i++) {
            prnt[i] = i;
            sz[i] = i;
        }
    }

    public int find(int p){
        while (p!=prnt[p]){
            p=prnt[p];
        }
        return p;
    }

    public boolean isConnected(int p, int q){
        return find(p)==find(q);
    }

    public void union(int p, int q){
        int parentP = find(p);
        int parentQ = find(q);

        if (parentP==parentQ){
            return;
        }

        if (sz[parentP]<sz[parentQ]){
            prnt[parentP] = parentQ;
            sz[parentQ] += sz[parentP];
        }
        else{
            prnt[parentQ] = parentP;
            sz[parentP] += sz[parentQ];
        }
    }

    public static void main(String args[]){
        WeightedQuickUnion uf = new WeightedQuickUnion();
        uf.WQuickUnionUF(10);
        System.out.print(Arrays.toString(uf.prnt));
        uf.union(2, 3);
        System.out.print(Arrays.toString(uf.prnt));
        uf.union(1, 2);
        System.out.print(Arrays.toString(uf.prnt));
        uf.union(2, 4);
        System.out.print(Arrays.toString(uf.prnt));
        System.out.print(uf.isConnected(1, 2));
    }
}
