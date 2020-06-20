package p2;
import p1.Icomparable;

  public class Smaller implements Icomparable {
		public int compareTo(int x, int y) {
		if(x<y)
			return x;
		else 
			return y;
	}

}

