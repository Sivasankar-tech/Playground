#include <stdio.h>
int main() {
	//Type your code
   int n,s,l;
    scanf("%d", &n);
   l = n % 10;
    while(n>10)
    {
     n/=10;
    }s=l+n;
    printf("%d", s);
	return 0;
}