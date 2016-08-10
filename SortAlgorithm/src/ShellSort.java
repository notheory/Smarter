/**
 * Shell Sort
 * @author fzj
 */
public class ShellSort extends Sort{

	public static void sort(Comparable[] a) {
		int N = a.length;
		int h = 1;
		while(h < N/3) h = h * 3 + 1;
		System.out.println("h is " + h);
		while(h >= 1){
			for (int i = h; i < N; i++){
				for (int j = i; j - h >= 0 && less(a[j], a[j-h]); j = j - h){
					exch(a, j, j-h);
				}
			}
			h = h/3;
		}
	}
	
	public static void main(String[] args) {
		Integer a[] = {4,2,6,9,1,0,8,3,7};
		ShellSort ss = new ShellSort();
		ss.sort(a);
		ss.show(a);
	}

}
