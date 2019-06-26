#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  for(int i=1;i <= n;i++)
  {
    for(int c=1;c <= n;c++)
    {
      if((i % 2 == 0)&&(c == 1)||(i % 2 == 1)&&(c ==n))
      printf("%d",i+1);
      else
        printf("%d",i);
    }
    printf("\n");
  }
  
  
  return 0;
}