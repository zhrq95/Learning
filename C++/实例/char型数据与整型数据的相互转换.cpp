#include <iostream>
using namespace std;
int main(void)
{
char ch1 = 'a' ;
char ch2 ;
int ascii ;
ascii = (int)ch1;
cout << ascii << endl;
ch2 = (char)(ascii + 1);
cout << ch2 << endl;
return 0;
}
