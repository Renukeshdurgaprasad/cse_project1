package cusDetails;
import cusDetails.Details;
interface DefMeth{
 public void deposite(int i,double a);
 public double withDrawal(int i,double a);
 public void display(int i);
 public  void receiptD(int i,double a);
 public  void receiptW(int i,double a);
}
public class Methods extends Details implements DefMeth{
   public Methods(){
     super();
  }
 public void deposite(int i,double a){
    amo[i]+=a;
    System.out.print("\n\t just a minute....\n");
    System.out.println("\n\t successfully deposited!");
    System.out.println("\n\t Please collect your receipt:");
   receiptD(i,a);
}
public double withDrawal(int i,double a){
 if(amo[i]-a>=0){
   amo[i]-=a;
   System.out.println("\n\t  Just a minute...");
System.out.println("\n\t  Please  collect your money...");
 System.out.println("\n\t  please collect your receipt");
 receiptW(i,a);
  return a;
}
else{
  System.out.println("\n\tInsufficient Balance!");
  return 0;
}
}
public void display(int i){
 System.out.println("\n\t  just a minute....");
System.out.println("\n\t\tamount in your account:\n");
System.out.println("\t\t\t"+amo[i] );
}
public  void receiptD(int i,double a){
  System.out.println("\n\n\t--------------------------------");
  System.out.println("\t\t   VRSEC ATM                    ");
  System.out.println("\t--------------------------------");
  System.out.println("\t  Name:"+n[i]);
  System.out.println("\t  Card no:"+id[i]);
  System.out.println("\t  deposite Amount:"+a);
  System.out.println("\t  Total amount:"+amo[i]);
 System.out.println("\t--------------------------------");
}
public  void receiptW(int i,double a){
  System.out.println("\n\n\t--------------------------------");
  System.out.println("\t\t   VRSEC ATM                    ");
  System.out.println("\t-------------------------------- ");
  System.out.println("\t  Name:"+n[i]);
  System.out.println("\t  Card no:"+id[i]);
  System.out.println("\t  WithDrawal Amount:"+a);
  System.out.println("\t  Total amount:"+amo[i]);
  System.out.println("\t--------------------------------");
}
}
 
