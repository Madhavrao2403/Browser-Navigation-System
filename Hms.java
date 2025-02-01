import java.util.Scanner;
class page{
    String pagedata;
    page next;
    page prev;
    public page(String pagedata){
       this.pagedata = pagedata;
       this.next=null;
       this.prev=null;
    }
}
public class Hms {
    Scanner sc = new Scanner(System.in);

    public void changeoption(page present){
      //Enable the oprtions
      while(true){
      System.out.print("choose the option:\n1.previous page\n2.next page\n3.Search\nAny number to exit");
      System.out.print("Enter:");
      int n = sc.nextInt();
      switch(n){  
      case 1:
          present=prevpage(present);
          break;
      case 2:
          present=nextpage(present);
          break;
      case 3:
          System.out.print("Enter website to search(as www.example.com):");
          String s = sc.next();
          present = Search(present, s);
          break;
      default:
        System.out.println("Browser is closed.");
        return;
       }
     }  
    }

    public page prevpage(page present){
      //take the present Node as parameter and update it as prevnode
      if (present.prev==null) {
          System.out.println("Previous page is not found.");
          return present;
      }
      present = present.prev;
      System.out.println("present page is "+present.pagedata); 
      return present;
    }

    public page nextpage(page present){ 
        if(present.next==null){
           System.out.println("There is no next page is found.");
           return present;
        }
       present=present.next;
       System.out.println("Present page is "+present.pagedata);
       return present;
    }
    
    public page Search(page present,String s){
       page newpage = new page(s);
       System.out.println("You have Entered "+s);
       page temp = present;
       while(temp.next!=null){
         temp=temp.next;
       }
       temp.next =  newpage;
       newpage.prev = temp;
       return newpage;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Browser\npresently you are in Homepage.");
        page start = new page("Home page");
        Hms obj = new Hms();
        obj.changeoption(start);

    }
}
