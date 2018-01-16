import java.util.Arrays;

public class Codility {

	public static void main(String[] args) {
		// int[] A = { 1, 3, -1, 4 };
		// System.out.println(solution(A));

		 int A[] = { 1, 3, 2, 1 };
		 int B[] = { 4, 2, 5, 3, 2 };
//		int A[] = { 1, 3, 5, 7 };
//		int B[] = { 0, 0, 1, 4, 6 };
		System.out.println(solution(A, B));

	}

	/*
	 * public static int solution(int[] A) {
	 * 
	 * int i = 0, count = 1; while ((i <= A.length - 1) && (i >= 0)) { if(i==0){
	 * i = A[i]; } i = A[i];
	 * 
	 * count++; } return count; }
	 */

	public static int solution(int[] A, int[] B) {
		int n = A.length;
		int m = B.length;
		Arrays.sort(A);
		Arrays.sort(B);
		int i = 0;
		for (int k = 0; k < n; k++) {
			while (i < m - 1 && B[i] < A[k])
				i += 1;
			
			if (A[k] == B[i])
				return A[k];
		}
		return -1;
	}
}
