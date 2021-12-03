static ArrayList<ArrayList<Integer>> E;
static int[] vis = new int[(int) 1e4 + 7];

static void addEdge(int x, int y) {
		E.get(x).add(y);
		E2.get(y).add(x);
	}
