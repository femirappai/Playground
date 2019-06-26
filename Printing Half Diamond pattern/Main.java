#include <stdio.h>
int main() {
	// Type your code here
  int n;
  scanf("%d",&n);
  for(int i = 1;i <= n;i++)
  {
      for(int s=1;s <= (n-i);s++)
    {
      printf(" ");
    }
    for(int c = 1;c <= (2*i)-1;c++)
    {
     printf("*");
    }
      printf("\n");
    
  }
	return 0;
}