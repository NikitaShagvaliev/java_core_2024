package lr1;

public class test {
    public static void main(String[] args) {
        int[] intArray = {3, 4, 5};
        float[] floatArray = {7.2f, 1.8f, 9.3f};
        char[] charArray = new char[2];

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

        for (float num : floatArray) {
            System.out.println(num);
        }
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }
}
