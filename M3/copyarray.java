public class copyarray {
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 3, 4, 5};
        int[] destinationArray = new int[sourceArray.length];

        for (int i = 0; i < sourceArray.length; i++) {
            destinationArray[i] = sourceArray[i];
        }

        System.out.println("Source array:");
        for (int value : sourceArray) {
            System.out.print(value + " ");
        }

        System.out.println("\nDestination array:");
        for (int value : destinationArray) {
            System.out.print(value + " ");
        }
    }
}
