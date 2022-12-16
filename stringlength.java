import java.util.Scanner;
class stringlength
{
    public void input()
    {
        Scanner sr=new Scanner(System.in);
        System.out.print("Enter string: ");
        String pr=sr.nextLine();
        char[] a=pr.toCharArray();
        int count=0;
        for (char i : a)
        {
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) 
    {
        stringlength sl=new stringlength(); 
        sl.input();
    }
}