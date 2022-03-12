package algos.tutorial.java;

public class PQ_OrderedArray<Key extends Comparable<Key>> {
    private final Key[] pq;
    private int M=0;

    public PQ_OrderedArray(int capacity){
        pq = (Key[]) new Comparable[capacity];
    }

    public boolean isEmpty(){
        return M==0;
    }

    public void insert(Key x){
        int i = M-1;
        while (i >= 0 && less(x, pq[i])) {
            pq[i+1] = pq[i];
            i--;
        }
        pq[i+1] = x;
        M++;
    }
    public boolean less(Key a, Key b){
        return a.compareTo(b)<0;
    }

    public void swap(int a, int b){
        Key tmp = pq[a];
        pq[a] = pq[b];
        pq[b] = tmp;
    }

    public Key remove(){
        return pq[--M];
    }
}
