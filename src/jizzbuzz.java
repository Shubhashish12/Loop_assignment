public class jizzbuzz {
    public static void main(String[] args) {
        //3 fizz 5 buzz

        for(int i = 1; i<101; i++){
            if(i%3 == 0){
                System.out.println(i+ " is fizz");
            }
            else if(i%5 == 0){
                System.out.println(i+ " is buzz");
            }
            else if (i%3 == 0 && i%5 == 0) {
                System.out.println(i+ " is fizzbuzz");

            }
            else{
                System.out.println(i+ " is none");
        }
        }
    }
}
