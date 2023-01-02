public class tekrarEdenCiftSayi {
	
	static boolean isFind(int[] arr, int value) {
		for(int i : arr) {
			if(i == value) {
				return true;
			}
		}
		return false;
	}
	

	public static void main(String[] args) {

		int[] list = {2, 7, 8, 11, 11, 9, 4, 7, 2, 3, 5, 4, 8, 10, 9, 14, 10};
		int[] duplicate = new int[list.length];
		int startIndex = 0;
		for(int i = 0; i < list.length; i++) {	
			if(list [i] % 2 == 0) {
			for(int j = 0; j< list.length; j++) {
			
				if((i != j) && (list[i] == list[j])) {
					if(!isFind(duplicate, list[j])) {
						duplicate[startIndex++] = list[j];
					}
					break;
				}
			}
				
		}
			
		}
		
		for(int value : duplicate) {
			if(value != 0) {
				System.out.println(value);
			}
		}
		

	}
