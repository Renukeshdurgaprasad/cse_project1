import cusDetails.Details;
import cusDetails.Methods;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Random;
import cusDetails.Owner;
import java.io.*;
class VrsecAtm{    
   public static void OtpGen(int i){
         Random rand=new Random();
         int t=1000+rand.nextInt(9000);    
    try{
      File r=new File("otp.txt");
      FileOutputStream f=new FileOutputStream("otp.txt");
      byte[]b=(String.valueOf(t).getBytes());
      f.write(b);
      System.out.print("\n  \totp is generated!\n");
     }
    catch(IOException e){
      System.out.println("File is not found");
    }
  } 
  public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int userpass=2024,ownerpass=1111;
        Methods me=new Methods();
        int j=1;
    do{
        int n=1,ren=1;
        try{
          File g=new File("data.txt");
       if(g.exists()){
          FileInputStream re=new FileInputStream("data.txt");
          if(re.available()!=0){
              byte[] fileData = new byte[re.available()];
              re.read(fileData);
              String content = new String(fileData);
              StringTokenizer s = new StringTokenizer(content, "\n");
              while (s.hasMoreTokens()) {
                    String line = s.nextToken();
                    StringTokenizer s2 = new StringTokenizer(line, ",");
                    while (s2.hasMoreTokens()) {
                           int index = Integer.parseInt(s2.nextToken());
                           me.amo[index] = Double.parseDouble(s2.nextToken());
                         }
                     }
                  }
               }
             }
      catch(IOException e){
          System.out.println("File doesn't exist");
      }
      System.out.print("\n  Enter your choice:\n\n  \t(1)Customer       (2)AtmWorker\n\n\t\t");
      int ee=scan.nextInt();
      if(ee==1){
          String b;
          try{
          System.out.print("\n\n\tEnter Your card No:\n\n\t\t");
           b=scan.next();
          if(b.length()!=12)
              throw new ArrayIndexOutOfBoundsException("\n\n\t   Invalid card NO!");
          }
          catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\n\t\t "+e.getMessage());
            continue;
          }
          int i=0,f=0,op;
          try{
          while(i<=12 && !(me.id[i].equals(b)))
               i++;
          }
          catch(ArrayIndexOutOfBoundsException e){
            System.out.println("\n\n\t   Invalid Card No!");
            continue;
          }
          if(me.o[i]==0)
             System.out.println("\n\t\tyour card is blocked!");
          else{
                   int ope=1;
          do{              
    System.out.print("\n\tEnter the password:\n\n\t\t");
                long pa=scan.nextLong();
                       int k=0;
                       for(k=0;k<3;k++){
                              if(pa==(me.p[i]))
                                 break;
                              else{
                                 System.out.print("\n\t  invalid password!\n\n\t  Re-enter the password:\n\n\t\t ");
                                 pa=scan.nextLong();
                             }
                          }
                       if (k>=3){
                                System.out.println("\n\t Your card is Blocked!");
                                me.o[i]=0;
                           }
    if(me.o[i]!=0 && f==0){
          int res=1;
                         try{
                            FileInputStream fr=new FileInputStream("otp.txt");
                            OtpGen(i);
                            System.out.print("\n\tEnter the Otp:\n\n\t\t");
                            byte[]con=new byte[fr.available()];
                            fr.read(con);
                            String h=new String(con);
                            int t=Integer.parseInt(h);
                             pa=scan.nextInt();
                            k=0;
                            for(k=0;k<2;k++){
                                if(pa==t)
                                     break; 
                                else{
                                    System.out.print("\n\tinvalid otp!\n\n\t Re-enter the otp:\n\n\t\t ");
                                    pa=scan.nextInt();
                                  }
                              }
                            if (k>=2){
                                   System.out.println("Otp is resended");
                                   OtpGen(i);
                                   System.out.print("\n\tRe-Enter the Otp:\n\n\t\t");
                                   byte[]cont=new byte[fr.available()];
                                   fr.read(cont);
                                   String ht=new String(cont);
                                   int tt=Integer.parseInt(ht);
                                   int pat=scan.nextInt();
                                   if(pat==(tt))
                                        k=1;
                                   else{
                                       System.out.println("Your card is Blocked!");
                                       me.o[i]=0;
                                    }
                                 }
                         }
                         catch(IOException e){
                               System.out.println("File doesn't exist");
                            }
                }
                  if( me.o[i]!=0){
                             System.out.println("\n    Hi, "+me.n[i]);
                             System.out.println("\n\tSelect Your option:\n");
                             System.out.print("\t\t(1)deposit       (2)Withdrawal\n\n\t\t\t (3)amount\n\n\t\t     ");
                             int a=scan.nextInt();
                        switch(a){
                              case 1: System.out.print("\n\n\tEnter the amount:\n\n\t\t");
                                      double cash=scan.nextDouble();
                                      System.out.print("\n\n\tPlace cash in the portal!\n");
                                      try{
                                         File  de= new File("data.txt");
                                         FileOutputStream file=new FileOutputStream("data.txt",true);
                                         if(de.length()!=0)
                                              file.write(System.lineSeparator().getBytes());
                                         byte[] ba = String.valueOf(i).getBytes();
                                         file.write(ba);
                                       file.write(",".getBytes());
                                         byte[] b1 = String.valueOf(me.amo[i] + cash).getBytes();
                                         file.write(b1);
                                         FileOutputStream trd=new FileOutputStream("de.txt",true);
                                         byte [] b2=(System.lineSeparator()+"       Name:"+me.n[i]).getBytes();
                                         trd.write(b2);
                                         trd.write((System.lineSeparator()+"       card No:"+me.id[i]).getBytes());
                                         trd.write((System.lineSeparator()+"       deposite amount:"+cash).getBytes());
                                         trd.write((System.lineSeparator()+"       total amount:"+(me.amo[i]+cash)).getBytes());
                                         trd.write((System.lineSeparator()+"      ----------------------------------------"+System.lineSeparator()).getBytes());
                                     }
                                   catch(IOException e){
                                         System.out.println("error in opening the file!");
                                     }  
                                    me.deposite(i,cash);
                                    break;
                             case 2: System.out.print("\tEnter the amount:\n\n\t\t");
                                     cash=scan.nextDouble();
                                     cash=me.withDrawal(i,cash);
                                     if(cash>0){
                                          try{
                                           File  de= new File("data.txt");
                                           FileOutputStream file= new FileOutputStream("data.txt",true);
                                           if(de.length()!=0)
                                               file.write(System.lineSeparator().getBytes());
                                           byte[] ba1 = String.valueOf(i).getBytes();
                                           file.write(ba1);
                                           file.write(",".getBytes());
                                           byte[] ba2 = String.valueOf(me.amo[i]).getBytes();
                                           file.write(ba2);
                                           FileOutputStream trw=new FileOutputStream("wi.txt",true);
                                           byte[]ba3=(System.lineSeparator()+"      Name:"+me.n[i]).getBytes();
                                           trw.write(ba3);
                                           trw.write((System.lineSeparator()+"      card No:"+me.id[i]).getBytes());
                                           trw.write((System.lineSeparator()+"      With Drawal amount:"+cash).getBytes());
                                           trw.write((System.lineSeparator()+"      total amount:"+(me.amo[i]+cash)).getBytes());
                                           trw.write((System.lineSeparator()+"      ----------------------------------------"+System.lineSeparator()).getBytes());
                                    }
                                   catch(IOException e){
                                        System.out.println("error in opening the file!");
                                   }   
                                }
                                break;
                          case 3:   me.display(i);
                                   break;
                          default:System.out.println("Not a valid choice!");
                        }                                       
                     }
                               
              if (me.o[i]!=0){
                 System.out.print("\n\tDo you want to \n\n  \t  (1).continue       (2).exit \n\n\t\t");
                 ope=scan.nextInt();
                   if(ope==1)
                     f=1;
              }
              else
                ope=2;
             }while(ope!=2);
          }
      }
        else{
              System.out.print("\n\t enter the password:\n\n\t\t    ");
             int q=2;
            do{
             int kit=scan.nextInt();
            if(kit==ownerpass){
                 Owner oo=new Owner();
                   n=0;
                 break;
            }
           else{
               System.out.print("\n\tIncorrect password!\n\n\t   Re-enter the password\n\n\t\t");
                q--;
             }
             }while(q>0);
        }
          System.out.println("\n\tEnter your choice:\n\t");
         System.out.print("\t   (1)Enter card No\t  (2)exit\n\n\t\t");
         j=scan.nextInt();
     }while(j!=2);
   }
 }
