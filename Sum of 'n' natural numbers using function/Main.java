#include<stdio.h>
int s(int n);
int main() 
{
  int n;
  scanf("%d",&n);
  printf("%d",s(n));
  return 0;
}
int s(int n)
{
  int sum = 0;
  for(int i = 1;i <= n; i++)
  {
    sum = sum+i;
  }
  return sum;
}