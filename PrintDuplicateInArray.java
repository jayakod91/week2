package day2.assignment2;

public class PrintDuplicateInArray {

	public static void main(String[] args) {
		int[] array = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		for(int i=0;i<array.length;) {
			for (int j = 0; j < array.length; j++) {
				if (array[i]==array[j])
					System.out.println("PrintDuplicateIn Elements is " + array[i]);
					
				}
			}
				
			}
		

	}
