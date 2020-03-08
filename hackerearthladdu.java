import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
class TestClass {
    public static void main(String args[] ){
        Scanner scanner = new Scanner(System.in);
        int tc=scanner.nextInt();
        for(int i=0;i<tc;i++){
            HashMap<Integer,Integer> map= new HashMap<>();
            int n=scanner.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=scanner.nextInt();
                if(map.containsKey(arr[j])){
                    int b=map.get(arr[j]);
                    map.put(arr[j],b+1);
                }
                else{
                    map.put(arr[j],1);
                }
            }
            for(int jj=0;jj<n-1;jj++){
                int flag=1;
                int o=map.get(arr[jj]);
                for(int z=jj+1;z<n;z++){
                    int c=map.get(arr[z]);
                    if(c>o){
                        System.out.print(arr[z]+" ");
                        flag=0;
                        break;
                    }
                }
                if(flag==1){
                    System.out.print(-1+" ");
                }
            }
            System.out.print(-1);
            System.out.println();
            //System.out.print(map);
        }
        
    }
}
