//wap to check print greater number in three given numbers 

class ternary4
{

public static void main(String a1[])
{
int n1=11;
int n2=323;
int n3=44;

int largernumber = (n1>=n2)? ((n1>=n3)?  n1 : n3)  : ((n2>=n3)?n2:n3);


System.out.println(largernumber);

}}