import java.util.*;
public class lab2 {
static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {

        EdgeWeightedGraph graph = new EdgeWeightedGraph(kb.nextInt());
        int m = kb.nextInt();

        for (int i = 0; i < m; i++) {
            graph.addEdge(new Edge(kb.nextInt() , kb.nextInt() , kb.nextDouble()));
            System.out.println(graph.adj(0).contains());
        }

    }

}
