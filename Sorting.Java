/*Algoritma dan Struktur Data
*Jihad Razdiansyah (20200040050)
*/
import java.util.Scanner;
class InsertionSort { 
	void sort(int array[]) 
	{ 
		int n = array.length; 
		for (int i = 1; i < n; ++i) { 
			int key = array[i]; 
			int j = i - 1;
			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j]; 
				j = j - 1; 
			} 
			array[j + 1] = key; 
		}
	} 
public static void main(String args[]) 
{ 
int k;
System.out.println("Masukan Jumlah Angka	:");
Scanner inputobject = new Scanner(System.in);
int Size = inputobject.nextInt();
int array[] =new int[Size] ;
System.out.println("Masukan "+Size+ " Data Angka	:" );
		for( k = 0; k < Size;k++)
{
int w = inputobject.nextInt();
array[k] = w;
}
		InsertionSort ob = new InsertionSort(); 
		ob.sort(array);
System.out.println("Data Setelah Diurutkan	:");
		for (int i = 0; i < Size; i++) 
			System.out.print(array[i] + " ");
		System.out.println(); 

	} 
}
