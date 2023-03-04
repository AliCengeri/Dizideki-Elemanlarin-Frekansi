import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] newList = new int[list.length];
        int count = 1;
        newList[0] = list[0];
        for (int i = 1; i < list.length; i++) {
            boolean isContain = false;
            for (int j = 0; j < count; j++) {
                if (newList[j] == list[i]) {
                    isContain = true;
                }
            }
            if (isContain == false) {
                newList[count] = list[i];
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            int counter = 0;
            for (int j = 0; j < list.length; j++) {
                if (newList[i] == list[j]) {
                    counter++;
                }
            }
            System.out.println(newList[i] + ", " + counter + " kere tekrar edildi.");
        }
    }
}

