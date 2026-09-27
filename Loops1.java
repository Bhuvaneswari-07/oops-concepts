public class Loops1 {
    public static void main(String[] args){
        int n=153;
        int o=n;
        int sum=0;
        while(n>0){
            int digit = n % 10;
            sum = sum+(digit*digit*digit);
        }
        n=n/10;
        if(sum==o) {
                System.out.println("armstrong");
            }

        else{
                System.out.println("not armstrong");
                }
            }
        }



