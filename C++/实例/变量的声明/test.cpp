#include <iostream>
using namespace std ;
#include "test.h"
extern int a ;
extern int b ;
int main(void)
{
	int c = 2 ;
	cout << " a = " << a << endl ;
	cout << " b = " << b << endl ;
	cout << " c = " << c << endl ;
	return 0 ;
}
int b =1 ;