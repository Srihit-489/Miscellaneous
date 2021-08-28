 public static int pageCount(int n, int p) {
       int fromstart = p/2;
       int fromback = n/2 - p/2;
       return Math.min(fromstart,fromback);

    }
