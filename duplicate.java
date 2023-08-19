class ClassA
{
public static void main(String[] args)
{
<<<<<<< HEAD
  int a[]=new int[]{1,2,7,1},count=0,k=0;
=======
  int a[]=new int[]{1,2,7,1},count=0 ,k=0;
>>>>>>> 8a892c4311350d8ee293daf63b61b3a3c78952f2
   boolean b[]=new boolean[a.length];
  for(int x=0;x<a.length;x++)
  {   
     
    if(b[x]==true)
      {
      continue;
       }
count=0;
 for(int y=x+1;y<a.length;y++)
  {
        if(a[x]==a[y])
         {
           count++;
          b[y]=true;
           break;
         }
}
    if(count==0)
    System.out.print(a[x]+" ");
      }
}
}

     
      
     
