public class Venn {
	public static void main(String[] args) {
		String[] firstArray = {"Table", "Lamp", "Stove", "Sofa", "Desk"}; // Initialize and declare first array.
		String[] secondArray = {"Chair", "Desk", "Fridge", "Lamp", "Bin"}; // Initialize and declare second array.
		System.out.println("First array is: ");
		for(int i = 0; i < firstArray.length; i++) { // Outputs the first array.
			System.out.println(firstArray[i]);
		}
		System.out.println("\nSecond array is: ");
		for(int i = 0; i < secondArray.length; i++) { // Outputs the second array.
			System.out.println(secondArray[i]);
		}
		System.out.println("\nSimilarities are: ");
		
        for(int i = 0; i < firstArray.length; i++) { // Iterates through both the first array and second array using indexing.
           for(int j = 0; j < secondArray.length; j++) {
               if(firstArray[i] == secondArray[j]) { // The condition checks for a match between the two arrays.
                   System.out.println(secondArray[j] + " "); // Outputs the items in the second Array if they are also found in the first.
               } 
           }
        }
	}
}
