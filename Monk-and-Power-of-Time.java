import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        LinkedList<Integer> call = new LinkedList<Integer>();
        LinkedList<Integer> ideal = new LinkedList<Integer>();

        for(int i=0; i<N; i++){
            call.add(scan.nextInt());
        }
        for(int i=0; i<N; i++){
            ideal.add(scan.nextInt());
        }

        int counter = 0;
        while(true){
            if(call.get(0)==ideal.get(0)){
                call.remove(0);
                ideal.remove(0);
                counter++;
            } else{
                int temp = call.remove(0);
                call.add(temp);
                counter++;
            }
            if(call.isEmpty()){
                break;
            }
        }
        System.out.print(counter);
    }
}
