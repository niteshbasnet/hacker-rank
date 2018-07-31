package cracking.datastructure.array;

public class ArrayStructure {

	private int theArray[] = new int[50];
	private int arraySize = 10;

	public void generateRandomArray() {
		for (int i = 0; i < arraySize; i++) {
			theArray[i] = (int) (Math.random() * 10) + 10;
		}
	}

	public void printArray() {
		System.out.println("----------");
		for (int i = 0; i < arraySize; i++) {
			System.out.print("| " + i);
			System.out.println(" | " + theArray[i] + " |");
			System.out.println("----------");
		}
	}

	public int getValueAtIndex(int index) {
		if (index < 0 || index > arraySize)
			return 0;
		return theArray[index];
	}

	public boolean doesArrayContains(int searchValue) {
		boolean contains = false;

		for (int i = 0; i < theArray.length; i++) {
			if (theArray[i] == searchValue) {
				contains = true;
			}
		}
		return contains;
	}

	public void deleteValueAtIndex(int index) {
		if (index < arraySize) {
			for (int i = index; i < (arraySize-1) ; i++) {
				theArray[i] = theArray[i + 1];
			}
			arraySize--;
		}
	}

	public void insertValue(int value) {
		if (arraySize < 50) {
			theArray[arraySize] = value;
			arraySize++;
		}
		
	}
	
	public void linearSearchForValue(int value) {
		boolean valueInArray = false;
		String indexesWithValue = "";
		System.out.println("The Value was found in the following indexes: ");
		for (int i = 0; i < arraySize; i++) {
			if(theArray[i] == value) {
				valueInArray = true;
				indexesWithValue+=i + " ";
			}
		}
		
		if(!valueInArray) {
			indexesWithValue = "None";
		}
		System.out.println(indexesWithValue);
	}
	
	public static void main(String[] args) {
		ArrayStructure newArray = new ArrayStructure();
		newArray.generateRandomArray();
		newArray.printArray();

		System.out.println(newArray.getValueAtIndex(2));
		System.out.println(newArray.doesArrayContains(10));

		newArray.deleteValueAtIndex(2);
		newArray.printArray();
		
		newArray.insertValue(99);
		newArray.printArray();
		
		newArray.linearSearchForValue(99);
	}

}
