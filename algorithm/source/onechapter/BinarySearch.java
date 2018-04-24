package onechapter;
import java.util.Arrays;
import edu.princeton.cs.algs4.*;

public class BinarySearch{
	public static int rank(int key,int[] a){
		int lo=0;
		int high=a.length-1;
		int mid;
		while(lo<=high){
			mid=(lo+high)/2;
			if(key<a[mid]){
				high=mid-1;
			}
			else if(key>a[mid]){
				lo=mid+1;
			}
			else{
				return mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] whiltList=In.readInts(args[0]);
		Arrays.sort(whiltList);
		while (!StdIn.isEmpty()){
			int key=StdIn.readInt();
			if(rank(key,whiltList)<0){
				StdOut.println(key);
			}
		}
}
}