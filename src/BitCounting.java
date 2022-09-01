import java.util.ArrayList;

public class BitCounting {
    public static int countBits(int n){
        int solution = 0;
        String binaryString = Integer.toBinaryString(n);
        String[] binaryStringArrayList =binaryString.split("");
        ArrayList<Integer> binaryIntArrayList = new ArrayList<>();
        for (String binary:binaryStringArrayList){
            binaryIntArrayList.add(Integer.parseInt(binary));
        }
        for (int binary:binaryIntArrayList){
            solution += binary;
        }
        return solution;
    }
}
