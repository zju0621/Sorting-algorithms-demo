/* 
 * Sorting algorithms demo (Java)
 * 
 * Copyright (c) Project Nayuki
 * https://www.nayuki.io/page/sorting-algorithms-demo-java
 * 
 * (MIT License)
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 * - The above copyright notice and this permission notice shall be included in
 *   all copies or substantial portions of the Software.
 * - The Software is provided "as is", without warranty of any kind, express or
 *   implied, including but not limited to the warranties of merchantability,
 *   fitness for a particular purpose and noninfringement. In no event shall the
 *   authors or copyright holders be liable for any claim, damages or other
 *   liability, whether in an action of contract, tort or otherwise, arising from,
 *   out of or in connection with the Software or the use or other dealings in the
 *   Software.
 */

package nayuki.sortdemo.algo;

import nayuki.sortdemo.SortAlgorithm;
import nayuki.sortdemo.SortArray;


/**
 * Sorts by swapping the first adjacent inversion and going back to the beginning, until the array is sorted. The time complexity is in <var>O</var>(<var>n</var><sup>3</sup>). Insertion sort is the optimized form.
 */
public final class StupidSort extends SortAlgorithm {
	
	public void sort(SortArray array) {
		array.setInactive(0, array.length());
		int i = 0;
		while (i < array.length() - 1) {
			if (array.compareAndSwap(i, i + 1))
				i = 0;
			else
				i++;
		}
		array.setDone(0, array.length());
	}
	
	
	public String getName() {
		return "Stupid sort";
	}
	
}
