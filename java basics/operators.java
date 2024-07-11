// Java Unary Operator
  public class OperatorExample{  
public static void main(String args[]){  
int x=10;  
  int a=10;  
int b=-10;  
boolean c=true;  
boolean d=false;  
System.out.println(~a);//-11 (minus of total positive value which starts from 0)  
System.out.println(~b);//9 (positive of total minus, positive starts from 0)  
System.out.println(!c);//false (opposite of boolean value)  
System.out.println(!d);//true  
System.out.println(x++);//10 (11)  
System.out.println(++x);//12  
System.out.println(x--);//12 (11)  
System.out.println(--x);//10  
}} 
output:
-11
9
false
true
10
12
12
10

  // Java Arithmetic Operator 
public class OperatorExample{  
public static void main(String args[]){  
int a=10;  
int b=5;  
System.out.println(a+b);//15  
System.out.println(a-b);//5  
System.out.println(a*b);//50  
System.out.println(a/b);//2  
System.out.println(a%b);//0  
System.out.println(10*10/5+3-1*4/2); 
}}  
Output:
15
5
50
2
0
21

//Java Left Shift Operator Example
public class OperatorExample{  
public static void main(String args[]){  
System.out.println(10<<2);//10*2^2=10*4=40  
System.out.println(10<<3);//10*2^3=10*8=80  
System.out.println(20<<2);//20*2^2=20*4=80  
System.out.println(15<<4);//15*2^4=15*16=240  
}}  
Output:
40
80
80
240
//Java Right Shift Operator Example
public OperatorExample{  
public static void main(String args[]){  
System.out.println(10>>2);//10/2^2=10/4=2  
System.out.println(20>>2);//20/2^2=20/4=5  
System.out.println(20>>3);//20/2^3=20/8=2  
}}  
Output:
2
5
2
//Java Shift Operator Example: >> vs >>>
public class OperatorExample{  
public static void main(String args[]){  
    //For positive number, >> and >>> works same  
    System.out.println(20>>2);  
    System.out.println(20>>>2);  
    //For negative number, >>> changes parity bit (MSB) to 0  
    System.out.println(-20>>2);  
    System.out.println(-20>>>2);  
}}  
Output:
5
5
-5
1073741819
//Java AND Operator Example: Logical && and Bitwise &

public class OperatorExample{  
public static void main(String args[]){  
int a=10;  
int b=5;  
int c=20;  
System.out.println(a<b&&a<c);//false && true = false  
System.out.println(a<b&a<c);//false & true = false  
}}  
Output:
false
false
//Java AND Operator Example: Logical && vs Bitwise &
public class OperatorExample{  
public static void main(String args[]){  
int a=10;  
int b=5;  
int c=20;  
System.out.println(a<b&&a++<c);//false && true = false  
System.out.println(a);//10 because second condition is not checked  
System.out.println(a<b&a++<c);//false && true = false  
System.out.println(a);//11 because second condition is checked  
}}  
output:
false
10
false
11
//Java OR Operator Example: Logical || and Bitwise |
public class OperatorExample{  
public static void main(String args[]){  
int a=10;  
int b=5;  
int c=20;  
System.out.println(a>b||a<c);//true || true = true  
System.out.println(a>b|a<c);//true | true = true  
//|| vs |  
System.out.println(a>b||a++<c);//true || true = true  
System.out.println(a);//10 because second condition is not checked  
System.out.println(a>b|a++<c);//true | true = true  
System.out.println(a);//11 because second condition is checked  
}}  
Output:
AD
true
true
true
10
true
11
//Java Ternary Operator
//Java Ternary Operator Example
public class OperatorExample{  
public static void main(String args[]){  
int a=2;  
int b=5;  
int min=(a<b)?a:b;  
System.out.println(min);  
}}  
Output:
2
Another Example:
public class OperatorExample{  
public static void main(String args[]){  
int a=10;  
int b=5;  
int min=(a<b)?a:b;  
System.out.println(min);  
}}  
output:
5
//Java Assignment Operator
public class OperatorExample{  
public static void main(String args[]){  
int a=10;  
int b=20;  
a+=4;//a=a+4 (a=10+4)  
b-=4;//b=b-4 (b=20-4)  
System.out.println(a);  
System.out.println(b);  
}}  
output:
14
16
//Java Assignment Operator Example
public class OperatorExample{  
public static void main(String[] args){  
int a=10;  
a+=3;//10+3  
System.out.println(a);  
a-=4;//13-4  
System.out.println(a);  
a*=2;//9*2  
System.out.println(a);  
a/=2;//18/2  
System.out.println(a);  
}}  
output:
13
9
18
9
//Java Assignment Operator Example: Adding short
public class OperatorExample{  
public static void main(String args[]){  
short a=10;  
short b=10;  
//a+=b;//a=a+b internally so fine  
a=a+b;//Compile time error because 10+10=20 now int  
System.out.println(a);  
}}  
Output:
//Compile time error
//After type cast:
public class OperatorExample{  
public static void main(String args[]){  
short a=10;  
short b=10;  
a=(short)(a+b);//20 which is int now converted to short  
System.out.println(a);  
}}  
Output:
20
