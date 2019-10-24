package algorithm_1;

public class ArrayStructures {
    private int arraySize = 10;
    private int[] theArray = new int[arraySize];


    public void generateRandomArray(){

            theArray[0] = 21;
            theArray[1] = 27;
            theArray[2] = 24;
            theArray[3] = 23;
            theArray[4] = 25;
            theArray[5] = 26;
            theArray[6] = 27;
            theArray[7] = 31;
            theArray[8] = 29;
            theArray[9] = 27;

    }
    public void printArray(){
        System.out.println("----------");
        for(int i=0; i<arraySize; i++){
            System.out.print("|"+i+"|");
            System.out.println(theArray[i]+"|");
            System.out.println("----------");
        }
    }
    public int getValueAtIndex(int index){
        if(index<arraySize)
            return theArray[index];
        else
            return 0;
    }
    public boolean doesArrayContainThisValue(int serarchValue){
        boolean valueInArray = false;
        for(int i=0; i<arraySize; i++){
            if(theArray[i]==serarchValue)
                valueInArray=true;
        }
        return valueInArray;
    }
    public void deleteIndex(int index){
        if(index<arraySize){
            for(int i=index; i<(arraySize-1); i++){
                theArray[i] = theArray[i+1];
            }
            arraySize--;
        }
    }
    public void deleteValue(int value){
        for(int i=0;i<=arraySize; i++){
            if(theArray[i]==value){
                for(int j=0;j<(arraySize-1);j++){
                    theArray[i] = theArray[i+1];
                }
                arraySize--;
            }
        }
    }
    public void insertArray(int value){
        if(arraySize<10){
            theArray[arraySize]=value;
            arraySize++;
        }
    }
    public String linearSearchForValue(int value){
        boolean valueInArray=false;
        String indexsWithValue="";
        System.out.println("The Value was found in the Following:");
        for(int i=0; i<arraySize; i++){
            if(theArray[i]==value){
                valueInArray=true;
          //      System.out.print("["+i+"]"+",");
                indexsWithValue+="["+i+"],";
            }
        }
        if(!valueInArray){
            indexsWithValue="None";
       //     System.out.print(indexsWithValue);
        }
     //   System.out.println();
        return indexsWithValue;
    }

    public static void main(String[] args) {
        ArrayStructures structures = new ArrayStructures();
        structures.generateRandomArray();
        structures.printArray();





    }
}
