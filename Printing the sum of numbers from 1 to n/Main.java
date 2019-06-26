#include <stdio.h>
int main() {
	//Type your code
  int n,i,sum=0;
  scanf("%d",&n);
  for(i=1;i<=n;i++)
  {
    sum=i+sum;
  }
  printf("%d",sum);
	return 0;
}