
package lambdaExression;

import java.util.Random;
import java.util.function.Supplier;

public class PasswordGenerator
{
   void main()
   {
       String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String lower = "abcdefghijklmnopqrstuvwxyz";
       String digits = "0123456789";
       String special = "@#$%!&*";     
       
       String totalCharacter = upper + lower + digits + special;
       
       Supplier<String> pwdSupplier = () ->
       {
         Random random = new Random();  
         String str = "";
         
         for(int i=1; i<=8; i++)
         {
            int randomNumber = random.nextInt(totalCharacter.length());  //69 [0 to 68]
            str = str + totalCharacter.charAt(randomNumber);        
         }
           
         return str;          
           
       };
       
       System.out.println("Generated Password is :"+pwdSupplier.get());
       
       
       
       
       
       
       
       
   }
}
