package com.plasencia.quickfind;

public class QuickFindUF {

    private int[] id;

//    {0, 1, 2, ..., N-1}
    public QuickFindUF(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public boolean connected (int p, int q) {
        return id[p] == id[q];
    }

    public void union (int head, int tail) {
        int indexOfTail = id[tail];
        int indexOfHead = id[head];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == indexOfHead) {
                id[i] = indexOfTail;
            }
        }
    }
}
