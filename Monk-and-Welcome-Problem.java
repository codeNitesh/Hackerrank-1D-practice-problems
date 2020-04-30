import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];

        for(int i=0; i<N; i++){
            A[i] = scan.nextInt();
        }
        for(int i=0; i<N; i++){
            B[i] = scan.nextInt();
        }
        for(int i=0; i<N; i++){
            System.out.print(A[i]+B[i]+" ");
        }
    }
}
