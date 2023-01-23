import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
   int[] numEx1= {5,2,4,5,1,-10,-10,-2}; // array to check methods
        System.out.println(diffMaxMin(numEx1)); //exercise 1 output
        System.out.println(Arrays.toString(findTwoSmallest(numEx1))); //exercise 2 output
        System.out.println(solveMathProblem(2,5)); //exercise 3 output
    }
    //exercise 1 method
    public static int diffMaxMin(int[] numbers){
        int max =numbers[0];
        int min =numbers[0];
        for (int num:numbers){
            if(num<min){
                min= num;
            } else if (num>max) {
                max= num;
            }
        }
       return max-min;
    }
    //exercise 2 method
    public static int[] findTwoSmallest(int[] numbers){
        int[] smallNumbers = {numbers[0], numbers[1]};
        for (int i=2;i<numbers.length;i++){
            if(numbers[i]<smallNumbers[0]){
                if(smallNumbers[0]<smallNumbers[1] && numbers[i] != smallNumbers[0]){
                    smallNumbers[1]= numbers[i];
                }else if(smallNumbers[0]>smallNumbers[1] && numbers[i] != smallNumbers[1]){
                    smallNumbers[0]= numbers[i];
                };
            }else if (numbers[i]<smallNumbers[1] && numbers[i] != smallNumbers[0]) {
                smallNumbers[1]= numbers[i];
            }
        }
        return smallNumbers;
    }
    //exercise 3 method
    public static double solveMathProblem(int x, int y){
        return Math.pow(x,2) + Math.pow(4*y/5d-x,2);
    }
}