/*
1、有返回值，则用变量保存返回值：
变量 = 函数名称(参数1, 参数2, ...)
变量的类型一定要和返回值的类型一致

2、无返回值或不管返回值：
函数名称(参数1, 参数2, ...)
*/

// 例：

#include <stdio.h>
#include <stdlib.h> //使用 system("pause") 前得包含此头文件 
//匈牙利命名法
void setPosition(float x, float y) {
	printf("x = %f, y = %f \n", x, y);
}
//Linux 命名法
int get_age() {
	return 15;
}
int main(int argc, char** argv) {
	setPosition(100, 200);  //函数 setPosition() 无返回值
	int age = get_age();  //函数 get_age() 有返回值，用变量 age 保存返回值
	printf("age = %d \n", age);
	system("pause");  //暂停一下，以免控制台一闪而过
	return 0;
}

#include <stdio.h>
#include <stdlib.h> //使用 system("pause") 前得包含此头文件 
//匈牙利命名法
void setPosition(float x, float y) {
	printf("x = %f, y = %f \n", x, y);
}
//Linux 命名法
int get_age() {
	return 15;
}
int main(int argc, char** argv) {
	setPosition(100, 200);  //函数 setPosition() 无返回值
	int age = get_age();  //函数 get_age() 有返回值，用变量 age 保存返回值
	printf("age = %d \n", age);
	system("pause");  //暂停一下，以免控制台一闪而过
	return 0;
}
