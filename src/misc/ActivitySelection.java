package misc;

public class ActivitySelection {
	public static void printMaxActivities(int s[], int f[], int n) {
		int i, j;
		System.out.println("Following activities are selected: n");
		i = 0;
		System.out.println(i+" ");
		for (j = 1; j < n; j++) {
			if (s[j] >= f[i]) {
				System.out.println(j+" ");
				i = j;
			}
		}
	}
}
