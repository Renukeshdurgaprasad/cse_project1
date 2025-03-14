package cusDetails;
import java.util.Scanner;
import java.io.*;
public class Owner{
 int i;
    public Owner(){
         int k=1;
      System.out.print("\n\tHello,!\n\n \tenter your choice:\n");
         while(k!=2){
         Scanner scan =new Scanner(System.in);
         System.out.print("\n\t  (1).deposite details       (2).withdrawal details\n\n\t\t   s");
         i=scan.nextInt();
         switch(i){
           case 1:detailsDep();
                  break;
           case 2:detailsWith();
                break;
           default: System.out.println("enter the valid choice");
          }
       System.out.print("\n\t\tDo you want to \n\n  (1)continue       (2)Exit\n\n\t\t    ");
         k=scan.nextInt();
        }
    }
  void detailsDep(){
         File file =new File("de.txt");
     if(file.length()==0)
          System.out.print("\n\n\t\tNO deposites are done before!\n");
     else{
     try{
       Scanner scan=new  Scanner(file);
        while(scan.hasNextLine()){
             System.out.println(scan.nextLine());
        }
       }
      catch(IOException e){
       System.out.println("file doesn't found");
       }
     }
   }
   void detailsWith(){
     File file =new File("wi.txt");
  if(file.length()==0)
   System.out.print("\n\n\t\tNO Withdrawals are done before!\n");
     else{
    try{
       Scanner scan=new  Scanner(file);
        while(scan.hasNextLine()){
             System.out.println(scan.nextLine());
        }
       }
      catch(IOException e){
       System.out.println("file doesn't found");
       }
     }
   }
}
