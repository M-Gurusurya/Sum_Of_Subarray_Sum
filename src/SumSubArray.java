import java.util.Scanner;

public class SumSubArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int size=scanner.nextInt();
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scanner.nextInt();
        }

        System.out.println(findSumSubArray(array,size));
    }

    public static int findSumSubArray(int array[],int size)
    {
        int p[]=new int[size];
        p[0]=array[0];
        int sum=array[0];
        for(int i=1;i<size;i++)
        {
            p[i]=array[i]+p[i-1];
            sum+=p[i];
        }

        for(int i=1;i<size;i++)
        {
            for (int j=i;j<size;j++)
            {
                sum+=p[j]-p[i-1];
            }
        }
        return sum;
    }
}
