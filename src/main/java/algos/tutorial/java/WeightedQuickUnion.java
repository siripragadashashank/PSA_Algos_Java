package algos.tutorial.java;

public class WeightedQuickUnion {
    private int[] prnt;
    private int[] sz;

    public void QuickUnionUF(int N){
        prnt = new int[N];
        sz = new int[N];
        for(int i=0; i<N; i++) {
            prnt[i] = i;
            sz[i] = 0;
        }
    }

    public int find(int p){
        if (p!=prnt[p]){
            p=prnt[p];
        }
        return p;
    }

    public boolean isConnected(int p, int q){
        return prnt[p]==prnt[q];
    }

    public void union(int p, int q){
        
    }
}
