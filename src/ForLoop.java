public class ForLoop {
    public static void main(String[] args) {
        int i;
        int num=100;
        int sum=0;
        for(i = 1; i <= num; i++){
            sum+=i;
        }
        System.out.println("sum of first 100 number=" + sum);
    }
}
