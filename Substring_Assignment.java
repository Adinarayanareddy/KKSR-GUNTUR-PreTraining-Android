import java.lang.*;

//import java.lang.String;

import java.util.*;

import java.io.*;

public class assignment{

     
public static void main(String []args)throws IOException
{


BufferedReader in=new BufferedReader(new InputStreamReader(System.in));

System.out.println("Enter a string");

String str=in.readLine();

int len=str.length();

int i=0,j=i+1;

while(i<len)

{
    //int j=i+1;

    while(j<len)
  
  {
       
 char c=str.charAt(i);
       
 char d=str.charAt(j);
       
 if(c==d)
     
   {
           
 	  
  
          System.out.print(d);

  
          i++;
  
          j++;
    
    }
      
  else
      
  {
        
j++;
        
     }   
}
    i++;

}

         
  
   }
}     

