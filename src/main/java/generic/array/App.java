package generic.array;

public class App {
    public static void main(String[] args) {

        final Integer[] array = {93, 99, 1, 34, 12, 0, 6, 5};

        /**
         * replace array
         */
        final ArrayReplace arrayReplace = new ArrayReplace(array);

        System.out.println("Array before replacement:");

        arrayReplace.showArray();

        arrayReplace.replaceArray();

        System.out.println("Array after replacement:");

        arrayReplace.showArray();

        /**
         * array to arrayList()
         */

        System.out.println("\nConvert array to ArrayList(): " + ArrayToList.arrayToList(array));
    }

}
