package hackerrankcodecontest;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.*;

class Student{}
class Rockstar{   }
class Hacker{}


public class InstanceOFTutorial
{
   static String count(ArrayList mylist)
   {
      int a=0,b=0,c=0;
      for(int i=0;i<mylist.size();i++)
      {
         Object element=mylist.get(i);
         if(element.getClass().getName().equals("Student"))
            a++;
         if(element.getClass().getName().equals("Rockstar"))
            b++;
         if(element.getClass().getName().equals("Hacker"))
            c++;
      }
      String ret= Integer.toString(a)+" "+ Integer.toString(b)+" "+ Integer.toString(c);
      return ret;
   }
   
   static Iterator func(ArrayList mylist)
   {
      Iterator it=mylist.iterator();
      while(it.hasNext())
      {
         Object element = it.next();
         if(element.equals("###"))//Hints: use instanceof operator
            break;
      }
      return it;
      
   }

   public static void main(String []argh)
   {
      ArrayList mylist=new ArrayList();
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      for(int i=0;i<t;i++)
      {
         String s=sc.next();
         if(s.equals("Student"))mylist.add(new Student());
         if(s.equals("Rockstar"))mylist.add(new Rockstar());
         if(s.equals("Hacker"))mylist.add(new Hacker());
      }
      System.out.println(count(mylist));
   }
}