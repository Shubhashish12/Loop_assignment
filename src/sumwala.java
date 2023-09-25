public class sumwala {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        for(int i = 1; i<11; i++){
            if(i%2 == 0){
                a = a+1;
            }
            else{

                b = b+1;
            }


        }
        if(a>b){
            System.out.println("Even is greater");
        }
        else if(b>a) {
            System.out.println("Odd is greater");
        }
        else {
            System.out.println("equal");
        }
        System.out.println(a);
        System.out.println(b);
    }
}
