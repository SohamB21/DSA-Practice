import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;

class JavaCollectionsFramework{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        //LIST COLLECTION
        //add, get, set, remove, size, isEmpty, contains, clear
        
        //ArrayList (implements List)
        System.out.print("ArrayList...\t");
        ArrayList<Integer> arrList = new ArrayList<Integer>();        
        arrList.add(10);
        arrList.add(30);
        arrList.add(1, 20);
        System.out.println(arrList);
        
        //LinkedList (implements List)
        System.out.print("LinkedList...\t");
        LinkedList<Character> linList = new LinkedList<Character>();
        linList.add('a');
        linList.add('c');
        linList.add('c');
        linList.set(1, 'b');
        System.out.println(linList);
        
        //Vector (implements List)
        System.out.print("Vector...\t");
        Vector<String> vect = new Vector<String>();
        vect.add("VE");
        vect.add("CT");
        vect.add("OR");
        System.out.println(vect);
        
        //Stack (extends Vector)
        //push, pop, peek, empty, search, size, clear
        System.out.print("Stack...\t");
        Stack<Double> st = new Stack<Double>();
        st.push(10.5);
        st.push(20.7);
        st.push(30.2);
        st.pop();
        System.out.print(st);
    }
}
