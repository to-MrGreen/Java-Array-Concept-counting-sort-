
/**
 * Write a description of CountingArray here.
 * 
 * @author (Md.Samiul haque) 
 * @version (1.0)
 */
import java.util.Scanner;
public class CountingArray {
    public void tester(int r,int[] main) {
        int[] a = new int[r+1];
        int valueCount = 0;
        //********** 1 **************
        for (int i=0; i<a.length; i++) {
          for (int j=0; j<main.length; j++) {
            if (i == main[j]) {
                valueCount ++;
            }
          }
          a[i] = valueCount;
          valueCount = 0;
        }
        
        //********* 2 *********
        for (int i=0; i<a.length; i++) {
            if (i != 0) {
              a[i] = a[i-1] + a[i];
            }
        }
        
        //********* 3 *********
        int[] b = new int[r+2]; //r+2 cause we need sorting array but No. 0 index was problem
        for (int i=0; i<main.length; i++) {
            for (int j=0; j<a.length; j++) {
                if (main[i] == j) {
                    
                    for (int k=1; k<b.length; k++) {
                          if (a[j] == k) {
                            if (main[i] == b[k]) {
                                b[k-1] = main[i];
                            }
                            b[k] = main[i];
                          
                        }
                    }
                }
            }
        }
        CountingArray test2 = new CountingArray();
        test2.print(b);
    }
    
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range bro!");
        int r = sc.nextInt();
        int[] counting = new int[r+1];
        int itemNumber = 0;
        for (int i=0; i<counting.length; i++) {
            System.out.println("Type values according to your given range");
            counting[i] = sc.nextInt();
            itemNumber ++;
        }
        CountingArray test1 = new CountingArray();
        test1.tester(r,counting);
    }
    
    public void print(int[] p) {
        for (int i=1; i<p.length; i++) {
            System.out.println(p[i]);
        }
    }
}
