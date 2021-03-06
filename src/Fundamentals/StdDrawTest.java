package Fundamentals;

import java.lang.reflect.Array;
import java.util.Arrays;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class StdDrawTest {

	public static void draw1() {
		int N = 100;
		StdDraw.setXscale(0, N);
		StdDraw.setYscale(0, N * N);
		StdDraw.setPenRadius(0.01);
		for (int i = 0; i <= N; i++) {
			StdDraw.point(i, i);
			StdDraw.point(i, i * i);
			StdDraw.point(i, i * Math.log(i));
		}
	}
	
	public static void drawRandom() {
		int N = 50000;
		double[] a = new double[N];
		for(int i = 0; i < N; i++) {
			a[i] = StdRandom.random();
		}
		Arrays.sort(a);
		for(int i = 0; i < N; i++) {
			double x = 1.0 * i / N;
			double y = a[i]/2.0;
			double rw = 0.5/N;
			double rh = a[i]/2.0;
			StdDraw.filledRectangle(x, y, rw, rh);
		}
	}

	public static void main(String[] args) {
		//draw1();
		drawRandom();
	}

}
