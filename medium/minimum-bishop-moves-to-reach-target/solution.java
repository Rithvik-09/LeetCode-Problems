class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        int sr = source[0];
        int sc = source[1];

        int tr = source[0];
        int tc = source[1];

        if(sr == tr && sc == tc){
            return 0;
        }

        if(Math.abs(sr-tr) == Math.abs(sc-tc)){
            return 1;
        }

        return -1;
    }
}