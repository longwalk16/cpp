import java.util.*;
import java.io.*;

public class andrews {

	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder("");
		int n = fs.nextInt();
		Point[] p = new Point[n];
		for (int i = 0; i < n; i++) {
			p[i] = new Point();
			p[i].x = fs.nextInt();
			p[i].y = fs.nextInt();
		}
		Point[] hull = convex_hull(p).clone();
		
		for (int i = 0; i < hull.length; i++) {
			if (hull[i] != null) sb.append(hull[i] + " ");
		}
		pw.print(sb.toString());
		pw.close();
	}

	public static long cross(Point O, Point A, Point B) {
		return (A.x - O.x) * (long) (B.y - O.y) - (A.y - O.y) * (long) (B.x - O.x);
	}

	public static Point[] convex_hull(Point[] P) {

		if (P.length > 1) {
			int n = P.length, k = 0;
			Point[] H = new Point[2 * n];

			Arrays.sort(P);

			for (int i = 0; i < n; i++) {
				while (k >= 2 && cross(H[k - 2], H[k - 1], P[i]) <= 0)
					k--;
				H[k++] = P[i];
			}

			for (int i = n - 2, t = k + 1; i >= 0; i--) {
				while (k >= t && cross(H[k - 2], H[k - 1], P[i]) <= 0)
					k--;
				H[k++] = P[i];
			}
			if (k > 1) {
				H = Arrays.copyOfRange(H, 0, k - 1);
			}
			return H;
		} else if (P.length <= 1) {
			return P;
		} else {
			return null;
		}
	}

	static class Point implements Comparable<Point> {
		int x, y;

		public int compareTo(Point p) {
			if (this.x == p.x)
				return this.y - p.y;
			else
				return this.x - p.x;
		}

		public String toString() {
			return "(" + x + "," + y + ")";
		}
	}

	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");

		String next() {
			while (!st.hasMoreTokens())
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
				}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		long[] readArray(int n) {
			long[] a = new long[n];
			for (int i = 1; i <= n; i++) {
				a[i] = nextLong();
			}
			return a;
		}
	}
}
