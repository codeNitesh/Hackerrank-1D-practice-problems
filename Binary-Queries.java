import java.util.*;


class TestClass {
    public static void main(String args[] ) throws Exception {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int Q = scan.nextInt();

        int[] array = new int[N];
        for(int i=0; i<N; i++){
            array[i] = scan.nextInt();
        }
        
        for(int i=0; i<Q; i++){
            int mark = scan.nextInt();
            if(mark==1){
                int toChange = scan.nextInt();
                if(array[toChange-1] == 1){
                    array[toChange-1] = 0;
                } else{
                    array[toChange-1] = 1;
                }
            }else{
                int L = scan.nextInt();
                int R = scan.nextInt();

                if(array[R-1]==1){
                    System.out.println("ODD");
                } else{
                    System.out.println("EVEN");
                }
            }
        }
    }
}
