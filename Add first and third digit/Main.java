#include<stdio.h>
int main()
{
  int a,sum=0;
  scanf("%d",&a);
  int first_digit = a/100;
 int third_digit = a%10;
  sum = first_digit + third_digit;
  printf ("%d",sum);
  return 0;
}