class Graph {
    private int[][] adjMatrix;

    public Graph(int n, int[][] edges) {
        adjMatrix = new int[n][n];
        Arrays.stream(adjMatrix).forEach(row -> Arrays.fill(row, (int)1e9));
        for (int[] e : edges) {
            adjMatrix[e[0]][e[1]] = e[2];
        }
        for (int i = 0; i < n; i++) {
            adjMatrix[i][i] = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    adjMatrix[j][k] = Math.min(adjMatrix[j][k], 
                                               adjMatrix[j][i] +
                                               adjMatrix[i][k]);
                }
            }
        }
    }

    public void addEdge(int[] edge) {
        int n = adjMatrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adjMatrix[i][j] = Math.min(adjMatrix[i][j],
                                           adjMatrix[i][edge[0]] +
                                           adjMatrix[edge[1]][j] +
                                           edge[2]);
            }
        }
    }

    public int shortestPath(int node1, int node2) {
        if (adjMatrix[node1][node2] == (int)1e9)
            return -1;
        return adjMatrix[node1][node2];
    }
}