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
        boolean out = false;
        return out;
    }

    public void swap(int a, int b){
        return;
    }

    public Key remove(){
        return pq[--M];
    }
}
