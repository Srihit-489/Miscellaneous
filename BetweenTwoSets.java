 public static int gcd(int a,int b){
         if(b == 0)
         return a;
         else
         return gcd(b,a%b);
     }
     
     public static int LCM(int a,int b){
         return a*b/gcd(a,b);
     }

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    
     
     int lcm = a.get(0);
     for(int i = 1;i<a.size();i++){
         lcm =LCM(a.get(i),lcm);
     }
    
     
      int gcd2 = b.get(0);
      for(int i=1;i<b.size();i++)
          gcd2 = gcd(gcd2,b.get(i));
       int count = 0;
       int val = lcm;
       int i = 1;
       Collections.sort(b);
        while(val <= b.get(0)){
            if(gcd2%val == 0){
                count++;
            }
            i++;
            val = i * lcm;
            
        }
      return count;
    }

}
