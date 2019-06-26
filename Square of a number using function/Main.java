#include<stdio.h>
int s(int n);
int main() 
{
  int a;
  scanf("%d",&a);
  printf("%d",s(a));
  return 0;
}
int s(int n)
{
  int result = n * n;
  return result;
}