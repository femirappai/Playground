#include <stdio.h>
int main() {
	// Type your code here
  int n ;
  scanf("%d",&n);
  for(int i=1;i <= n;i++)
  {
    for(int c=1;c <= n;c++)
    {
      if((i == c)||(i + c == n+1))
        printf("*");
      else
        printf(" ");
    }
    printf("\n");
  }
	return 0;
}