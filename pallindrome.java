to find if a number is palindrome or notJava
int num = Integer.parseInt(textField1.getText()); //replace textField1with actual one
int n = num; //used to store the value to check at the end of loop
int reverse=0, remainder;
while(num > 0)
{
remainder = num % 10;
reverse = reverse * 10 + remainder;
num = num / 10; }
if(reverse == n)
System.out.println(n+” is a Palindrome Number”);
else
System.out.println(n+” is not a Palindrome Number”);
1
2
3
4
5
6
7
8
9
10
11
12
int num = Integer.parseInt(textField1.getText()); //replace textField1with actual one
int n = num; //used to store the value to check at the end of loop
int reverse=0, remainder;
while(num > 0)
{
remainder = num % 10;
reverse = reverse * 10 + remainder;
num = num / 10; }
if(reverse == n)
System.out.println(n+” is a Palindrome Number”);
else
System.out.println(n+” is not a Palindrome Number”);
 
