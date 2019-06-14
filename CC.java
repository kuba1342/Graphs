public class CC {
    private boolean[] marked;
    private int[] id;
    private int count;

    public CC(Graph G) {
        id = new int[G.V()];
        for (int s = 0; s < G.V(); s++)
            if (!marked[s]) {
            dfs(G, s);
            count++;
            }
    }

    private void dfs(Graph G, int v) {
        marked[v] = true;
        id[v] = count;
        for (int w : G.adj(v))
            if (!marked[w])
                dfs(G, w);
    }

    public boolean connected(int v, int w) {    // are v and w connected?
        return id[v] == id[w];
    }

    public int id(int v) {  // component identifier for v (between 0 and count()-1)
        return id[v];
    }

    public int count() {    // number of connected components
        return count;
    }
}
