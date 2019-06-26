#include <stdio.h>
int main() {
  int n,sum = 0,r,f,i,t;
  scanf("%d",&n);
  t = n;
  while(t > 0)
  {
    f = 1;
    r = t % 10;
    for(i=1;i <= r;i++)
    {
     f = f * i;
    }
    sum = sum + f;
    
    t = t / 10;
  }
  if(sum == n)
  {
  printf("Yes");
  }
  else
  {
    printf("No");
  }
  return 0;
}