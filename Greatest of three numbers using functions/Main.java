#include <stdio.h>
int g(int,int,int);
int main()
{
  int a,b,c;
scanf("%d %d %d",&a,&b,&c);
  g(a,b,c);
  return 0;
}
int g(int x,int y,int z)
  {
  if((x>y)&&(x>z))
  {
    printf("%d",x);
  }
  else if((y>x)&&(y>z))
  {
    printf("%d",y);
  }
  else
  {
    printf("%d",z);
    
}
}
