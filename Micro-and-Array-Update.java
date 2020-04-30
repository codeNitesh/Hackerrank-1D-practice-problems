import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        
        int T = scan.nextInt();
        for(int i=0; i<T; i++){
            int N = scan.nextInt();
            int K = scan.nextInt();

            int[] array = new int[N];
            for(int j=0; j<N; j++){
                array[j] = scan.nextInt();
            }

            Arrays.sort(array);
            int count=0;
            while(array[0]<K){
                    array[0] += 1;
                    count+=1;
            }

            System.out.println(count);
        }
    }
}
