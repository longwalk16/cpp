static final int MAX = (int) 2e5 + 7;
static long[] a = new long[MAX];
static long[] b = new long[MAX];
static long[] tree = new long[MAX];
static long ans;

static long query(int x) {
		int ans = 0;
		while (x > 0) {
			ans += tree[x];
			x -= (x & -x);
		}
		return ans;
	}
	
static void update(int x, long val) {
		while (x <= n) {
			tree[x] += val;
			x += (x & -x);
		}
	}
