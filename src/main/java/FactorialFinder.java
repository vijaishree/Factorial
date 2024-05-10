public class FactorialFinder {

    public Integer find(int number) {
        if(number<0) throw new RuntimeException("Number is less than zero");

        if(number<=1) return 1;

        int factorialValue = 1;

        for(int currentNumber = number ; currentNumber >=1 ; currentNumber--) factorialValue *= currentNumber;

        return factorialValue;
        }
}
