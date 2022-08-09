class Called{
static int a=34;                             //static variable
int b=43;                                   // instance variable
public static void main(String[]args){
int c=65;                                   //local vriable
 Called obj=new Called();
System.out.println(c);
System.out.println(obj.b);
System.out.println(Called.a);
}
}