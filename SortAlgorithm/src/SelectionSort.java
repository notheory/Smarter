/**
 * Selection Sort
 * @author fzj
 *
 */
public class SelectionSort extends Sort{

	public static void sort(Comparable[] a){
		int N = a.length;
		for (int i = 0; i < N; i++){ // 外循环每一轮排定一个元素
			int min = i;
			for (int j = i; j < N; j++)	// 内循环寻找最小元素
				if(less(a[j], a[min])) min = j;
			exch(a, i, min);
		}
	}
	
	public static void main(String[] args){
		Integer a[] = {4,2,6,9,1,0,8,3,7};
		SelectionSort ss = new SelectionSort();
		ss.sort(a);
		ss.show(a);
	}
}
