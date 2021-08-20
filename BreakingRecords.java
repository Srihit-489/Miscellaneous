public static List<Integer> breakingRecords(List<Integer> scores) {
      int minscore = scores.get(0);
      int maxscore = scores.get(0);
      int min = 0;
      int max = 0;
      
      for(int score : scores){
          if(score > maxscore){
              max++;
              maxscore = score;
          }
          if(score < minscore){
              min++;
              minscore = score;
          }
      }
      List<Integer> retlist = new ArrayList<Integer>();
      retlist.add(max);
      retlist.add(min);
      return retlist;

    }
