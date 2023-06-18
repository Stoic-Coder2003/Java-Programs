import java.util.*;
public class luckyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len=sc.nextInt();   //array ki length define ho rahi hai.
        int[] arr =new int[len];
        int[] arr1 =new int[len];
         int[] emptyarr=new int[len-1]; //lucky number ko chod kar baaki sabke index
        loop:  for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();  //saare values array mein save ho rahe hai.

            //User jo hai,0 input nahi kar sakta.
            if(arr[i]==0){
                System.out.println("Bhomsdike 0 dalta hai!!!");
                break loop;
            }


            arr1[i]=arr[i];       //copy array mein original ke saar values save ho rahe hai
        }

        System.out.println(lucky(arr));
    }

    static int lucky(int[] arr)   //function to solve lucky numbers.
    {
        int var=0;
        int k=0;
        int answer=0; //for the int return type
        loop1: while(true) {

            if (emptyarr.length = (len - 1)){     //loop breaks as one number is left
                break loop1;
        }

            arr1[k]=var;
            var=arr[k];
            emptyarr[k]=k;

            /*yaha tak muhe pata hai, 1. the index to omit
            2.Copy array mein numbers 0 ho rahe hai
            3. Original array se calculation ho rahi hai.
             */

            if(var>(emptyarr.length-1)) //number of operational numbers left
            {
                k=k+((emptyarr.length-1)/var); //index of skipped place
            }
            else{
                k=k+var;
            }
            var=0; //var changes to zero for the process to become a loop;
        }
        for(int a=0;a<len;a++){
            if(arr1[a]!=0){
                answer=arr[a];
            }
        }
        return answer;
    }

}
