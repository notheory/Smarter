
public class MergeSort extends Sort{

	private static Comparable[] aux;
	
	public static void sort(Comparable[] a){
		int N = a.length;
		aux = new Comparable[N];	//initialize auxiliary array
		sort(a, 0, N-1);
	}
	
	public static void sort(Comparable[] a, int lo, int hi){
		if(hi <= lo) return;
		int mid = lo + (hi - lo)/2;
		sort(a, lo, mid);		//sort left part
		sort(a, mid+1, hi);		//sort right part
		merge(a, lo, mid, hi);	//merge sort two part
	}
	
	public static void merge(Comparable[] a, int lo, int mid, int hi){
		int i = lo;
		int j = mid+1;
		for (int k = lo; k <= hi; k++)	//copy to auxiliary array
			aux[k] = a[k];
		for (int k = lo; k <= hi; k++){	//merge two part
			if(i > mid) a[k] = aux[j++];
			else if(j > hi) a[k] = aux[i++];
			else if(less(aux[i], aux[j])) a[k] = aux[i++];
			else a[k] = aux[j++];
		}
	}
	
	public static void main(String[] args) {
		Integer a[] = {4,2,6,9,1,0,8,3,7};
		MergeSort ms = new MergeSort();
		ms.sort(a);
		ms.show(a);
	}

}
