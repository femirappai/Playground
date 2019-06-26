#include<stdio.h>
int main()
{
  int a,f,s,sum=0;
  scanf("%d",&a);
  f = a/10;
  s = a%10;
  sum = f + s;
  printf("%d",sum);
  return 0;
}