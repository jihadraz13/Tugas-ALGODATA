/*Algoritma dan Struktur Data
 *Jihad Razdiansyah (20200040050)
 */

import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sort {
	
	public static void main(String[] args) {
		long start;
		long end;
		start = System.currentTimeMillis();
		BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
		int angka[] = {32, 12, 44, 72, 90, 10};
		int min = angka[0];
		int index = 0;
		
		for(int i=0; i<angka.length-1; i++){
			for (int j = i; j<angka.length; j++) {
				if (angka[j] < min) {
					min = angka[j];
					index = j;
				}
			System.out.println(Arrays.toString(angka));	
			}
			if (min < angka[i]) {
				angka[index] = angka[i];
				angka[i] = min;
				
			}
			min = angka[i+1];
		}
		end = System.currentTimeMillis();
		System.out.println("Lama proses : " + ((end - start) / 1000.0) + "detik");
	}
}
