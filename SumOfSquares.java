class Solution {
    public boolean judgeSquareSum(int c) {
      
        HashMap<Integer,Integer> myhash = new HashMap<>();
        for(int i = 2;i*i <= c ; i++){
            if(c%i == 0){
                int count = 0;
                while(c%i == 0){
                    count++;
                    c = c/i;
                }
                myhash.put(i,count);
            }
        }
        
        if(c != 1){
            myhash.put(c,1);
        }
        
        for(int num : myhash.keySet()){
            if((num-3)%4 == 0){
                if(myhash.get(num)%2 != 0)
                    return false;
            }
        }
        
        return true;
    }
}
