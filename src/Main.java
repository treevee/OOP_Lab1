public class Main {
    public static void main(String[] args) {
        int[] goodSequence1 = {1,1,1,2,1};
        int[] badSequence = {2,1,1,2,1};
        int[] goodSequence2 = {10,10};
        System.out.println(CanBeEquallyDivided(goodSequence1));
        System.out.println(CanBeEquallyDivided(badSequence));
        System.out.println(CanBeEquallyDivided(goodSequence2));
    }

    public static boolean CanBeEquallyDivided(int[] array){
        for (int i =1; i<array.length; i++){
            if(GetSubArraySum(0, i, array)==GetSubArraySum(i,array.length,array)){
                return true;
            }
        }
        return false;
    }
    public static int GetSubArraySum(int start, int end, int[] array){
        int sum =0;
        for (int i =start; i<end; i++){
            sum+=array[i];
        }
        return sum;
    }

    public static void FizzBuzzGame(){
        for (int i =1; i<=100; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }
    }

    public static boolean  IsMonotonic(int[] array){
        for (int i =1; i<array.length; i++){
            if(array[i]<array[i-1]){
                return false;
            }
        }
        return true;
    }
}


//FizzBuzzGame();
//System.out.println(CanBeEquallyDivided(sequence));
//int[] goodSequence = {1,2,3,4,5,6};
//int[] badSequence = {1,2,3,5,4,3};
//System.out.println(IsMonotonic(goodSequence));
//System.out.println(IsMonotonic(badSequence));