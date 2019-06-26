#include<stdio.h>
int main()
{
  int a,c=0,f=0;
  scanf("%d",&a);
  c = a/10;
  f = c%10;
  printf("%d",f);
  return 0;
}