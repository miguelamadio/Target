public class Fibonacci {
    static void fib(int n){
        int i=0;
        int n1=0;
        int n2=1;
        while(i==0){
            n1=n1+n2;
            n2=n2+n1;
            if(n1==n||n2==n){
                System.out.println("O número faz parte da sequência");
                i++;
            }
            if(n1>n||n2>n){
                System.out.println("O número não faz parte da sequência");
                i++;
            }
        }
    }
}