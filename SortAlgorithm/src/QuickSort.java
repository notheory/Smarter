
public class QuickSort extends Sort{

	private static int partition(Comparable[] a, int lo, int hi)
	{
		int i = lo;
		int j = hi + 1;		//easy to error
		Comparable v = a[lo];
		while(true){
			while(less(a[++i], v)) if(i == hi) break;
			while(less(v, a[--j])) if(j == lo) break;
			if(i >= j) break;	//easy to error
			exch(a, i, j);
		}
		exch(a, lo, j);
		return j;
	}
	
	private static void sort(Comparable[] a, int lo, int hi){
		//TODO:add shuffle step here can avoid bad performance
		if(lo >= hi) return;	//easy to forget
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}
	
	public static void main(String[] args) {
		Integer a[] = {4,2,6,9,1,0,8,3,7};
		QuickSort qs = new QuickSort();
		qs.sort(a, 0, a.length-1);
		qs.show(a);
	}

}
