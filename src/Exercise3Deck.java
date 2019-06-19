public class Exercise3Deck{
	private int[] deck;
	public static final int NUMCARDS = 52;
	/** constructor */
	public Exercise3Deck(){
		deck = new int[NUMCARDS];
		for (int i = 0; i < NUMCARDS; i++)
			deck[i] = i;
	}
	/** Write contents of Deck. */
	public void writeDeck(){
		for (int card : deck)
			System.out.print(card + " ");
		System.out.println();
		System.out.println();
	}
	/** Swap arr[i] and arr[j] in array arr. */
	private void swap(int[] arr, int i, int j){
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
	}
	public void shuffle(){
	int index;
		for (int i = NUMCARDS - 1; i > 0; i--){
			//generate an int from 0 to i
			index = (int) (Math.random() * (i + 1));
			swap(deck, i, index);
		}
	}
}

