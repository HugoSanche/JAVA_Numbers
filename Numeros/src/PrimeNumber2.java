public final class PrimeNumber2 {
    private PrimeNumber2(){}
    public static void main(String[] args) {
        int number=93;

        boolean result=isPrimeNumber(number);
        System.out.println(result);
    }

    public static boolean isPrimeNumber(int number){
        if (number<2){
           return false;
        }
        if (number==2){
            return true;
        }
        if (number%2==0){
            return false;
        }
        for(int i=2;i*i<=number;i++){
            if (number%i==0){
                return false;
            }
        }
        return  true;
    }
}
