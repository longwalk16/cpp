static void dfs(int x) {
		vis[x] = 1;
		for (int i : E.get(x)) {
			if (vis[i] != 1) {
				dfs(i);
			}
		}
	}
