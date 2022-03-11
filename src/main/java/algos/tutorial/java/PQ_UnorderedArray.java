package algos.tutorial.java;

public class PQ_UnorderedArray<Key extends Comparable<Key>> {
    private final Key[] pq;
    private int M=0;

    public PQ_UnorderedArray(int capacity){
        pq = (Key[]) new Comparable[capacity];
    }

    public boolean isEmpty(){
        return M==0;
    }

    public void insert(Key x){
        pq[M++]=x;
    }

    public boolean less(int a, int b){
        boolean out = false;
        return out;
    }

    public void swap(int a, int b){
        return;
    }
    public Key remove(){
        int max=0;
        for(int i=0; i<M; i++){
            if(less(max, i)){
                max=i;
            }
        }
        swap(max, M-1);
        return pq[--M];
    }
}
