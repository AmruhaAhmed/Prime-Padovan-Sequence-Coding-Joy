#include<stdio.h>
int main()
{
    int n;//number till which the series need to be printed
    int i;//loop counter
    int ctr;//count of factors of a number
    printf("\n Enter a number:");
    scanf("%d",&n);
    int p0=1;//first term of series
    int p1=1;//second term of the series
    int p2=1;//third term of the series
    int pn=p0+p1;//current term of the series
    while(pn<=n)
    {
        ctr=0;
        for(i=1;i<=pn;i++)
        {
            if(pn%i==0)
            ctr++;
        }
        if(ctr==2)
        printf("\t %d",pn);
        p0=p1;
        p1=p2;
        p2=pn;
        pn=p0+p1;
        
    }
    return 0;
}
