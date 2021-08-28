 public static int countingValleys(int steps, String path) {
       int val = 0;
       int height = 0;
       int cur = 1;
       for(int i=0;i<path.length();i++){
           if(path.charAt(i) == 'D'){
               height--;
           }else{
               height++;
           }
           if(height < 0 && cur != -1){
               cur = -1;
               val++;
           }else if(height >= 0 ){
               cur = 1;
           }
       }
       
       return val;

    }
