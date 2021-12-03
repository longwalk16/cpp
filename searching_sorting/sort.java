static void sort(long[] a) {
		ArrayList<Long> al = new ArrayList<>();
		for (long i : a)
			al.add(i);
		Collections.sort(al);
		for (int i = 0; i < a.length; i++)
			a[i] = al.get(i);
	}
