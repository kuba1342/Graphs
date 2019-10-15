public class Main {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
//        Graph G = new Graph(new In(args[0]));
//        CC cc = new CC(G);
//
//        int M = cc.count();
//        System.out.println(M + "components");
//        Bag<Integer>[] components;
//        components = (Bag<Integer>[]) new Bag[M];
//        for (int i = 0; i < M; i++)
//            components[i] = new Bag<Integer>();
//        for (int v = 0; v < G.V(); v++)
//            components[cc.id(v)].add(v);
//        for (int i = 0; i < M; i++) {
//            for (int v: components[i])
//                System.out.print(v + " ");
//            System.out.println();
//        }

//        String filename = args[0];
//        String delim = args[1];
//        SymbolGraph sg = new SymbolGraph(filename, delim);
//
//        Graph G = sg.G();
//
//        while (edu.princeton.cs.algs4.StdIn.hasNextLine()) {
//            String source = edu.princeton.cs.algs4.StdIn.readLine();
//            for (int w : G.adj(sg.index(source)))
//                StdOut.println("   " + sg.name(w));
//        }


        // Degrees of separation
//        StdOut.println("Degrees of separation: ");
//
//        SymbolGraph sg2 = new SymbolGraph(args[0], args[1]);
//
//        Graph G2 = sg2.G();
//
//        String source = args[2];
//        if (!sg2.contains(source)) {
//            StdOut.println(source + " not in database.");
//            return;
//        }
//
//        int s = sg2.index(source);
//        BreadthFirstPaths bfs = new BreadthFirstPaths(G2, s);
//
//        while (!edu.princeton.cs.algs4.StdIn.isEmpty()) {
//            String sink = edu.princeton.cs.algs4.StdIn.readLine();
//            if (sg2.contains(sink)) {
//                int t = sg2.index(sink);
//                if (bfs.hasPathTo(t))
//                    for (int v : bfs.pathTo(t))
//                        StdOut.println("   " + sg2.name(v));
//                else StdOut.println("Not connected");
//            } else StdOut.println("Not in database.");
//        }

        // test if hasEdge
//        Graph graph = new Graph(5);
//        graph.addEdge(1, 2);
//        graph.addEdge(1, 3);
//        graph.addEdge(1, 4);
//        graph.addEdge(2, 4);
//
//        System.out.println(graph.hasEdge(1, 2));
//        System.out.println(graph.hasEdge(2, 3));

        // DFS Path

        Graph G = new Graph(new In(args[0]));
        int s = Integer.parseInt(args[1]);
        DepthFirstPaths dfs = new DepthFirstPaths(G, s);
        for (int v = 0; v < G.V(); v++) {
            if (dfs.hasPathTo(v)) {
                StdOut.print(s + " to " + v + ": ");
                for (int x : dfs.pathTo(v))
                    if (x == s) StdOut.print(x);
                    else StdOut.print(x + "-");
                StdOut.println();
            } else {
                StdOut.printf("%d to %d: not connected\n", s, v);
            }
        }
    }
}