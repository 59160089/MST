import java.util.*;
public class lab1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in) ;

        EdgeWeightedGraph graph = new EdgeWeightedGraph(kb.nextInt());

        final int n = kb.nextInt();
        for (int i = 0 ; i < n ; i++) {
            graph.addEdge(new Edge(kb.nextInt(),kb.nextInt(),kb.nextDouble()));
        }


        KruskalMST m = new KruskalMST(graph);
        System.out.println(m.weight());

        ArrayList<Edge> arr = m.edges();
        for(Edge e : arr) {
            System.out.println(e.from() + "-" + e.to()+" "+e.weight());
        }



    }
}
