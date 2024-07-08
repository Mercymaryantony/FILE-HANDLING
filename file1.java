import java.io.*;
import java.util.*;
public class file1
{
    public static void main(String args[])
    {
    try
    {
    File myFile=new File("Number.txt");
    Scanner sc=new Scanner(myFile);
    FileWriter even=new FileWriter("even.txt");
    FileWriter odd=new FileWriter("odd.txt");
    while(sc.hasNextInt())
    {
    int data=sc.nextInt();

    if(data%2==0)
    {
    even.write(data +"\n");
    }
    else
    {
    odd.write(data +"\n");
    }
    }

    even.close();
    odd.close();
    }
    catch(IOException ue)
    {
    System.out.println(ue.getMessage());

    }
    }
}