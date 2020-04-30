import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();

        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = scan.nextInt();
        }

        for(int i=0; i<N; i++){
            for(int j=i; j<N; j++){
                if(i==j){
                    continue;
                }
                if(K==arr[i]+arr[j]){
                    System.out.println("YES");
                    System.exit(0);
                }
            }
        }
        System.out.println("NO");   
    }
}
