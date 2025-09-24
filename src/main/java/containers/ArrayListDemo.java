package containers;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;
/** arraylist demo
* @since 9/26/23
*/
public class ArrayListDemo {

   public static void main(String[] args){
   
      ArrayList<String> aList = new ArrayList<>();
      
      ArrayList<Fraction> fList = new ArrayList<>();
      //don't do this! ArrayList won't know what it is holding
      ArrayList list = new ArrayList();
      String s = "cat";
      String t = "dog";
      
      for(int i = 0; i < 20; i++){
         aList.add(s);
         s = s+t;     
      }
      
      aList.add(0, "horse");
      
      System.out.println(aList);
      
      for(String s2: aList) {
         System.out.println(s2);
      }
      
      Iterator itr = aList.iterator();
      while(itr.hasNext()) {
         System.out.println(itr.next());
      }
      
   
   }
   
   


}