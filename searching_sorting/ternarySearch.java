		static double ternarySearch(int times) {
			while (times >= 0) {
				m1 = l + (r - l) / 3;
				m2 = r - (r - l) / 3;

				double dist1 = dist(m1);
				double dist2 = dist(m2);

				if (dist1 < dist2) {
					r = m2;
				} else {
					l = m1;
				}
				times--;
			}
  			return dist(l);
		}
