
public class InsertionSort extends Sort{

	public static void sort(Comparable[] a){
		int N = a.length;
		int exchTimes = 0;		//交换次数
		int compareTimes = 0;	//比较次数
		for (int i = 1; i < N; i++){
			for (int j = i; j > 0 && less(a[j], a[j-1]); j--){
				exch(a, j, j-1);
				exchTimes++;
				compareTimes++;
			}
		}
		System.out.println("Compare Times" + compareTimes);
		System.out.println("Exchange Times:" + exchTimes);
	}
	
	public static void main(String[] args) {
		Integer a[] = {4,2,6,9,1,0,8,3,7};
		InsertionSort is = new InsertionSort();
		is.sort(a);
		is.show(a);
	}

}
