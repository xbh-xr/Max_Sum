package SumCoding;
import java.util.Scanner;

public class SC {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int i,n;
        int[] num=new int[100];
        n=scan.nextInt();        
        for(i=0;i<n;i++)
            num[i]=scan.nextInt();
        int result = sum(num);
        System.out.println("连续子元素的最大和为："+result);
        scan.close();
	}
	
	public static int sum(int[] num) {
        if (num.length==0 || num==null) {
            return 0;
        }
        int currentSum = 0;     
        int max = 0;           
        for (int i = 0; i <num.length; i++) {
            if(currentSum<=0){     
                currentSum = num[i];     
            }else{
                currentSum = currentSum + num[i];   
            }
            if(currentSum>max){         
                max = currentSum;      
            }
        }
        return max;
    } 

}
