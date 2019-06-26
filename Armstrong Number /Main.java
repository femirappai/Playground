#include <stdio.h>
int main()
{
  int number, sum = 0, r = 0, cube = 0,temp = 0;
    scanf("%d", &number);
    temp = number;
    while (number != 0)
    {
        r = number % 10;
        cube = pow(r, 3);
        sum = sum + cube;
        number = number / 10;
    }
    if (sum == temp)
        printf ("Armstrong Number");
    else
        printf ("Not an Armstrong Number");
	return 0;
}