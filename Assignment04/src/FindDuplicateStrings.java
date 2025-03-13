
public class FindDuplicateStrings {
    public static void main(String[] args) {
        String[] array1 = {"apple", "banana", "cherry", "date", "apple", "fig"};
        String[] array2 = {"grape", "banana", "fig", "apple", "kiwi", "banana"};

        System.out.println("Duplicate values in both arrays:");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    // Check if we already printed this duplicate
                    boolean alreadyPrinted = false;
                    for (int k = 0; k < i; k++) {
                        if (array1[i].equals(array1[k])) {
                            alreadyPrinted = true;
                            break;
                        }
                    }
                    if (!alreadyPrinted) {
                        System.out.println(array1[i]);
                    }
                    break;
                }
            }
        }
    }
}

