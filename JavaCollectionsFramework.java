import java.util.Scanner;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Deque;
import java.util.ArrayDeque;

import java.util.HashMap;
import java.util.TreeMap;

class JavaCollectionsFramework{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        //LIST INTERFACE (extends Collection)
        
        //ArrayList (implements List)
        //add, get, set, remove, size, isEmpty, contains, clear
        System.out.print("ArrayList... \t");
        ArrayList<Integer> arrList = new ArrayList<Integer>();        
        arrList.add(10);
        arrList.add(30);
        arrList.add(1, 20);
        System.out.println(arrList);
        
        //LinkedList (implements List)
        //add, get, set, remove, size, isEmpty, contains, clear
        System.out.print("LinkedList... \t");
        LinkedList<Character> linList = new LinkedList<Character>();
        linList.add('a');
        linList.add('c');
        linList.add('c');
        linList.set(1, 'b');
        System.out.println(linList);
        
        //Vector (implements List)
        //add, get, set, remove, size, isEmpty, contains, clear
        System.out.print("Vector... \t");
        Vector<String> vect = new Vector<String>();
        vect.add("VE");
        vect.add("CT");
        vect.add("OR");
        System.out.println(vect);
        
        //Stack (extends Vector)
        //push, pop, peek, empty, search, size, clear
        System.out.print("Stack... \t");
        Stack<Double> st = new Stack<Double>();
        st.push(10.5);
        st.push(20.7);
        st.push(30.2);
        st.pop();
        System.out.println(st);
        
        //SET INTERFACE (extends Collection)
        
        //HashSet (implements Set)
        //add, remove, contains, isEmpty, size, clear
        System.out.print("HashSet... \t");
        HashSet<String> hs = new HashSet<String>();
        hs.add("Ha");
        hs.add("sh");
        hs.add("Set");
        hs.add("sh");
        System.out.println(hs);
        
        //LinkedHashSet (implements Set)
        //add, remove, contains, isEmpty, size, clear
        System.out.print("LinkedHashSet... \t");
        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
        lhs.add(10);
        lhs.add(30);
        lhs.add(30);
        lhs.add(20);
        System.out.println(lhs);
        
        //SORTEDSET INTERFACE (extends Set)
        
        //TreeSet (implements SortedSet)
        //add, remove, contains, isEmpty, size, clear
        System.out.print("TreeSet... \t");
        TreeSet<Character> ts = new TreeSet<Character>();
        ts.add('z');
        ts.add('a');
        ts.add('d');
        ts.add('b');
        ts.add('a');
        System.out.println(ts);
        
        //QUEUE INTERFACE (extends Collection)
        //add, offer, peek, remove, poll, isEmpty, size
        System.out.print("Queue... \t");
        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(77);
        q.offer(99);
        System.out.println(q);
        
        //PriorityQueue (implements Queue)
        //add, offer, peek, remove, poll, isEmpty, size
        System.out.print("PriorityQueue... \t");
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.offer(10);
        pq.add(30);
        System.out.println(pq.poll());
        
        //DEQUE INTERFACE (extends Queue)
       
        //ArrayDeque (implements Deque)
        //addFirst, addLast, peekFirst, peekLast, poll, size
        System.out.print("Deque... \t");
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        dq.offer(30);
        dq.offerLast(20);
        dq.offerFirst(10);
        dq.pollLast();
        System.out.println(dq);
        
        //MAP INTERFACE
        
        //HashMap (implements Map)
        //put, get, containsKey, remove, clear
        System.out.print("HashMap... \t");
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(0, "Java");
        hm.put(1, "Collections");
        hm.put(2, "Framework");
        System.out.println(hm);
        
        //SORTEDMAP INTERFACE (extends Map)
        
        //TreeMap (implements SortedMap)
        //put, get, containsKey, firstKey, lastKey
        System.out.print("TreeMap... \t");
        TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
        tm.put("Java", 0);
        tm.put("Collections", 1);
        tm.put("Framework", 2);
        System.out.println(tm);
    }
}
/*
    ArrayList... 	[10, 20, 30]
    LinkedList... 	[a, b, c]
    Vector... 	[VE, CT, OR]
    Stack... 	[10.5, 20.7]
    HashSet... 	[Set, sh, Ha]
    LinkedHashSet... 	[10, 30, 20]
    TreeSet... 	[a, b, d, z]
    Queue... 	[77, 99]
    PriorityQueue... 	10
    Deque... 	[10, 30]
    HashMap... 	{0=Java, 1=Collections, 2=Framework}
    TreeMap... 	{Collections=1, Framework=2, Java=0}
*/
