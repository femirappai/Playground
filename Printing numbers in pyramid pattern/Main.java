#include <stdio.h>
int main() {
	// Type your code here
  int n,ctr = 1;
  scanf("%d",&n);
  for(int i = 1;i <= n;i++)
  {
    for(int s = 1;s <= (n-i);s++)
    {
      printf(" ");
    }
    for(int c = 1;c <= i;c++)
    {
      printf("%d ",ctr);
      ctr++;
    }
    printf("\n");
    
  }
	return 0;
}