package valorvsreferencia.refencia;

public class Main {
    public static void main(String[] args) {
        //arrays - are passed as reference
        //so changes on methods affect the values of the array
        //by values do not affect the original object - primitives variables
        int [] values = {10, 11, 12};

        System.out.println("Before test: ");

        printArray(values);
        test(values);

        System.out.println("After test: ");

        printArray(values);



    }

    public static void printArray(int [] values) {
        for (int i = 0; i < values.length; i++){
            System.out.println("value[" + i + "] = " + values[i]);
        }
    }

    public static void test(int [] values){
        for (int i = 0; i < values.length; i++){
            values[i] += 10;
        }
    }
}


