import java.util.*;
import java.lang.*;

public class cfq{
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args){
		int n = scanner.nextInt();
		scanner.nextLine();
		
		char[][] arr = new char[n][n];
		for(int i = 0;i<n;i++){
			String str = scanner.nextLine();
			char[] in = str.toCharArray();
			arr[i] = in;
		}
		List<int[]> track = new ArrayList<int[]>();
		List<int[]> ans = reachend(arr,0,0,n,track);
		
		for(int i = 0;i<n;i++){
			for(int j= 0;j<n;j++){
               arr[i][j] = '0';
			}
		}
		
		for(int[] point : ans)
		    arr[point[0]][point[1]] = '1';
		    
		 System.out.println("The Route is : ");
		for(int i = 0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
	}
	
	public static List<int[]> reachend(char[][] arr,int x,int y,int n,List<int[]> track){
		if(x == n-1 && y == n-1){
			track.add(new int[]{x,y});
			return track;
		}
		
		if(x == n || y == n)
		   return null;
		
		track.add(new int[]{x,y});
		List<int[]> retlist;
		if(x+1 != n && arr[x+1][y] == '1'){
			List<int[]> newtrack = new ArrayList<int[]>();
			newtrack.addAll(track);
			retlist = reachend(arr,x+1,y,n,track);
			if(retlist != null)
			   return retlist;
		}
		
		if(y+1 != n && arr[x][y+1] == '1'){
			List<int[]> newtrack = new ArrayList<int[]>();
			newtrack.addAll(track);
			retlist = reachend(arr,x,y+1,n,newtrack);
			if(retlist != null)
			   return retlist;
		}
		
		return null;
		
	}
}
