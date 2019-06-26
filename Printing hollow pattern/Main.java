#include <stdio.h>
int main() {
	// Type your code her
  int n;
  scanf("%d",&n);
  for(int i =1;i <= n;i++)
  {
    for(int c = 1;c <= n;c++)
    {
      if((i == 1)||(i == n)||(c==1)|| (c == n))
         printf("*");
         else
         printf(" ");
    }
    printf("\n");
  }
	return 0;
}