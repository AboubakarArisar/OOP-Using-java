import java.util.Scanner;
class A{
public static void main(String args[]){
System.out.println("Enter number : ");
Scanner o=new Scanner(System.in);
int num=o.nextInt();
int j=0;
for(int i=1; i<=num; i++)
{
if(num%i==0)
{
j++;}}
if(j==2)
{
System.out.println("Number is prime");
}
else
{
System.out.println("Number is not prime");}}}
