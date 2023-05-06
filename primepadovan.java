import java.util.*;
class primepadovan
{
    Scanner ob=new Scanner(System.in);
    void main()
    {
        int n;//number till which the series is printed
        int i;//loop counter
        int p0=1;//first term of the series
        int p1=1;//second term of the series
        int p2=1;//third term of the series
        int pn=p0+p1;//current term of the series
        System.out.println("Enter a number:");
        n=ob.nextInt();
        while(pn<=n)
        {
            int ctr=0;//counter to count the number of factors 
            for(i=1;i<=pn;i++)
            {
                if(pn%i==0)
                ctr++;
                
            }
            if(ctr==2)
            System.out.print("\t"+pn);
            p0=p1;
            p1=p2;
            p2=pn;
            pn=p0+p1;
            
        }        
    }
}