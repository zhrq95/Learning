#include <stdio.h>
#include <stdlib.h>
int main(int argc, char** argv){
  int a = 2;
  int b = -2;
//C/C++里：=表示赋值， ==表示值相等
  if((a+b)==1){
    printf("1\n");
  }
//当一个数字作为判断的条件时，0为假，非0为真，
  else if(0){
    printf("2\n");
  }
//如果 if 括号里面的条件是赋值，则先赋值，再算是否满足条件
  else if(a=0){
    printf("3\n");
  }
  else{
   printf("4\n");
  }
  system("pause");
  return 0;
}
