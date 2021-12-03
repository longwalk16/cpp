static long binarySearch(int h) {
long l = 1, r = h;
			while (l < r) {
				long mid = (l + r) >> 1;
				long ans = 0;
				for (int i = 0; i < n - 1; i++) ans += Math.min(mid, a[i + 1] - a[i]);
				ans += mid;
				if (ans >= h) r = mid;
				else l = mid + 1;
			}
  return ans;
}
