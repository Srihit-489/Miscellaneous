class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int x = m,y = n;
        for(int[] range : ops){
            int[] result = union(x,y,range);
            x = result[0];
            y = result[1];
        }
        
        return x*y;
    }
    
    public int[] union(int x,int y,int[] range){
        int[] result = new int[2];
        result[0] = Math.min(x,range[0]);
        result[1] = Math.min(y,range[1]);
        return result;
    }
}
