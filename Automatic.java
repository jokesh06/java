class Automatic
{
    public static void main(String[] args)
{
      int x=5725,b=0,count=0,rem=0,p=1,copy=x,y=0;
            b=x*x;
      for(x=b;x!=0;x/=10)
         {   rem=x%10;
            count++;
         }
        for(y=count/2;y!=0;y--)
          {
             p=p*10;
          }
          int k=b/p;
          int l=b%p;
         if(l==copy)
          System.out.println("it is automatic number");
         else
       System.out.println("not automatic number");
}
}