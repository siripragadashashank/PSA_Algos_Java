package algos.tutorial.java;

import java.util.Arrays;

public class WQUPathCompression {
    private int[] prnt;
    private int[] sz;

    public void WQUPC(int N){
        prnt = new int[N];
        sz = new int[N];
        for(int i=0; i<N; i++){
            prnt[i]=i;
            sz[i]=i;
        }
    }

    public boolean isConnected(int p, int q){
        return prnt[p]==prnt[q];
    }

    public int find(int p){
        while(p!=prnt[p]){
            p=prnt[p];
        }
        return p;
    }

    public void union(int p, int q){
        return;
    }

    public static void main(String args[]){
        WQUPathCompression uf = new WQUPathCompression();
        uf.WQUPC(10);
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
