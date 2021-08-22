public static int migratoryBirds(List<Integer> arr) {
        Collections.sort(arr);
        int id = arr.get(0);
        int count = 1;
        int start = 0;
        int max = 1;
        for(int i=1;i<arr.size();i++){
            int cur = arr.get(i);
            if(cur == arr.get(start)){
                count++;
                if(count > max){
                    max = count;
                    id = cur;
                }
            }else{
                count = 1;
                start = i;
            }
        }
        
        return id;

    }
