public class FactorialFinder {

    private final int number;

    public FactorialFinder(int number) {
        this.number = number ;
    }

    public Integer calculator() {
        if(number<0) return null;

        if(number<=1) return 1;

        int factorialValue = 1;

        for(int currentNumber = number ; currentNumber >=1 ; currentNumber--) factorialValue *= currentNumber;

        return factorialValue;
        }
}
