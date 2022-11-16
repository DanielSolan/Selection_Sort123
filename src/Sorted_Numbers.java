public class Sorted_Numbers {
    private int[] numbers;
    private int firstFree;

    public Sorted_Numbers(int size){
        numbers = new int[size];
        firstFree=0;
    }

    public void addNumber(int n){
        //add a new element, preserving the sorted order.
        if (firstFree<numbers.length){
            numbers[firstFree] = n;
            firstFree++;
            selectionSort();
        }
    }

    public int size(){
        return firstFree;
    }

    public void selectionSort() {
        //Loop over each unsorted element.
        for (int unsortedPos = 0; unsortedPos < firstFree - 1; unsortedPos++) {
            int minPos = unsortedPos;
            for (int searchPos = unsortedPos + 1; searchPos < firstFree; searchPos++) {
                if (numbers[searchPos] < numbers[minPos]) {
                    minPos = searchPos; //New minimum value.
                }
            }
            int temp = numbers[unsortedPos];
            numbers[unsortedPos] = numbers[minPos];
            numbers[minPos] = temp;
        }
        //Find the position of the smallest one.
        //Swap with the first unsorted.
        //repeat n times.
        for (int i = 0; i<numbers.length; i++){
            System.out.print(numbers[i] + ",");
        }
        System.out.println("");
    }
}
