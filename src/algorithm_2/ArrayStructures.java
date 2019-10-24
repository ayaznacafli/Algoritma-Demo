package algorithm_2;

public class ArrayStructures {
    private int arraySize=10;
    private int[] theArray = new int[arraySize];

    public void generateRandomArray(){
        theArray[0] = 20;
        theArray[1] = 21;
        theArray[2] = 22;
        theArray[3] = 23;
        theArray[4] = 24;
        theArray[5] = 25;
        theArray[6] = 26;
        theArray[7] = 27;
        theArray[8] = 28;
        theArray[9] = 29;
    }
    public void printArray(){
        System.out.println("---------------------------------------------------");
        for (int i=0;i<arraySize;i++){
            System.out.print(" |  "+i);
        }
        System.out.println();
        System.out.println("---------------------------------------------------");
        for (int i=0;i<arraySize;i++){
            int k=theArray[i];
            System.out.print(" | "+k);
        }
        System.out.println();
        System.out.println("---------------------------------------------------");


    }

    public static void main(String[] args) {
        ArrayStructures structures = new ArrayStructures();
        structures.generateRandomArray();
        structures.printArray();
    }

}
