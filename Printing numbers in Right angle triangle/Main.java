#include <stdio.h>
int main(){
  	// Type your code here
  int n;
  scanf("%d",&n);
  for(int i=1;i <= n;i++)
  {
    for(int c=1;c <= i;c++)
    {
      printf("%d",i);
    }
    printf("\n");
  }
	return 0;
}