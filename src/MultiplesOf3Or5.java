import java.util.ArrayList;

public class MultiplesOf3Or5 {

        public int solution(int number) {
            ArrayList<Integer> naturalNumbers = new ArrayList<>();
            int finalSum = 0;

            if (number < 0){
                return 0;
            }else{
                for (int i = number-1; i >0; i--){
                    if ((i%3 == 0 || i%5==0) && !naturalNumbers.contains(i)){
                        naturalNumbers.add(i);
                    }
                }
                for(Integer num:naturalNumbers){
                    finalSum += num;
                }
            }
            return finalSum;
        }
    }
