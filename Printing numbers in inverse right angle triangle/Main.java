#include <stdio.h>
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  for(int i = n;i >= 1;i--)
  {
    int r = i;
    for(int c = 1;c <= i;c++)
    {
      printf("%d",r);
r--;
    }
    printf("\n");
  }
	return 0;
}