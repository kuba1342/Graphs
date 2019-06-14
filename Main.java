public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Graph G = new Graph(new In(args[0]));
        CC cc = new CC(G);

        int M = cc.count();
        System.out.println(M + "components");
        Bag<Integer>[] components;
        components = (Bag<Integer>[]) new Bag[M];
        for (int i = 0; i < M; i++)
            components[i] = new Bag<Integer>();
        for (int v = 0; v < G.V(); v++)
            components[cc.id(v)].add(v);
        for (int i = 0; i < M; i++) {
            for (int v: components[i])
                System.out.print(v + " ");
            System.out.println();
        }
    }
}
