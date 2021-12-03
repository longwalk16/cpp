import java.util.*;
import java.io.*;
 
public class template {
 
	public static void main(String[] args) {
		FastScanner fs = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
    StringBuilder sb = new StringBuilder("");
    int t = fs.nextInt();
    for (int tt = 0; tt < t; tt++) {
      
    }
    pw.print(sb.toString());
    pw.close();
 
	static class FastScanner {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer("");
		String next() {while (!st.hasMoreTokens())try {st = new StringTokenizer(br.readLine());} catch (IOException e) {}return st.nextToken();}
		int nextInt() {return Integer.parseInt(next());}
		long nextLong() {return Long.parseLong(next());}
		double nextDouble() {return Double.parseDouble(next());}
		long[] readArray(int n) { long[] a = new long[MAX]; for (int i = 1; i <= n; i++) {a[i] = nextLong();} return a;}
	}
