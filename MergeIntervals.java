class Solution {
    public int[][] merge(int[][] intervals) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comp());
        for(int[] point : intervals){
            pq.add(new int[]{point[0],0});
            pq.add(new int[]{point[1],1});
        }
        int current = -1;
        int lcount = 0;
        List<int[]> finallist = new ArrayList<int[]>();
        while(pq.size() != 0){
            int[] cur = pq.remove();
            if(cur[1] == 0){
                if(lcount == 0){
                     current = cur[0];
                    lcount++;
                }else{
                    lcount++;
                }
            }else{
                lcount--;
                if(lcount == 0){
                    finallist.add(new int[]{current,cur[0]});
                }
                
            }
        }
        int[][] retarray = new int[finallist.size()][2];
        for(int i = 0;i<finallist.size();i++){
            retarray[i] = finallist.get(i);
        }
        return retarray;
    }
    
    public class Comp implements Comparator<int[]>{
        public int compare(int[] obj1,int[] obj2){
            if(obj1[0] != obj2[0])
                return obj1[0] - obj2[0];
            else if(obj1[1] == 0)
                return -obj1[0];
            else if(obj2[1] == 0)
                return obj2[0];
            else
                return obj1[0];
        }
    }
}
