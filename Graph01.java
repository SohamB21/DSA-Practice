//This code creates an adjacency list representation of a graph and prints it.
// T.C. = O(E)		S.C. = O(|V| + |E|)
import java.util.*;
import java.util.ArrayList;
class Graph01 {

    void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v, int isDirected){
        //0 = undirected, 1 = directed graph
        adj.get(u).add(v);
        if(isDirected == 0) //for undirected edge
            adj.get(v).add(u);
    }

    void printAdjList(ArrayList<ArrayList<Integer>> adj){
        for(int i=0; i<adj.size(); i++){
            System.out.print(i + " -> ");

            for(int j=0; j<adj.get(i).size(); j++)
                System.out.print(adj.get(i).get(j)+ ", ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no.of nodes: ");
        int n = scan.nextInt();
        System.out.print("Enter the no.of edges: ");
        int e = scan.nextInt();
        System.out.print("Undirected(0) or Directed(1): ");
        int isDirected = scan.nextInt();
        
        // initializing arraylist
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<n; i++)
            adj.add(new ArrayList<Integer>(n));
        
        Graph01 g = new Graph01();
        //accepting nodes
        System.out.println("Enter the nodes(u v): ");
        //u should be from 0 to n-1
        for(int i=0; i<e; i++){
            int u = scan.nextInt();
            int v = scan.nextInt();
            //0 = undirected, 1 = directed
            g.addEdge(adj, u, v, isDirected);
        }
        //printing graph
        g.printAdjList(adj);
    }
}