package algos.tutorial.java;

import java.util.Arrays;

public class PQ_BinaryHeap<Key extends Comparable<Key>> {
    private Key[] pq;
    private int N;

    public PQ_BinaryHeap(int capacity){
        // increment capacity by 1 as we are using 1-based index.
        pq = (Key[]) new Comparable[capacity + 1];
        N = 0;
    }

    public boolean less(int a, int b){
        return pq[a].compareTo(pq[b])<0;
    }

    public void swap(int a, int b){
        Key tmp = pq[a];
        pq[a] = pq[b];
        pq[b] = tmp;
    }

    public void insert(Key node){
        if (N==pq.length){
            N--;
        }
        pq[++N] = node; // add node to the end of array
        swim(N);  // avoid heap order violation by swimming the last node
    }

    public void swim(int k){
        while(k>1 && less(k/2, k)){
            swap(k/2, k);
            k = k/2;
        }
    }

    public void sink(int k){
        while (2*k <=N){
            int j = 2*k;
            if(j<N && less(j, j+1)){
                j++;
            }
            if(!less(k, j)){
                break;
            }
            swap(k, j);
            k=j;
        }
    }

    public Key delMax(){
        Key max = pq[1];
        swap(1, N--);
        pq[N+1]=null;
        sink(1);
        //pq[N+1]=max;
        return max;

    }
    public static void main(String args[]) {
        PQ_BinaryHeap pqBH = new PQ_BinaryHeap(5);
        pqBH.insert(10);
        pqBH.insert(20);
        pqBH.insert(15);
        pqBH.insert(30);
        pqBH.insert(40);
        System.out.print(Arrays.toString(pqBH.pq));
        pqBH.delMax();
        System.out.print(Arrays.toString(pqBH.pq));
    }
}
