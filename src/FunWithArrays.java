
public class FunWithArrays {
static int[]a = {1,2,3};
static int[]b = {4,5,6};
public static void main(String[] args) {
	printarray(a);
	printarray(b);
	a=b;
	printarray(a);
	printarray(b);
	a[1] =9;
	printarray(a);
	printarray(b);
}
static int printarray(int[] arr) {
	for(int num1 : arr) {
		System.out.print(num1);
	}
	System.out.println();
	return 0;
	
}
}
