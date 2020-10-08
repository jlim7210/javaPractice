package practice7;

public class Me {
	RemoteC rc;
	TV tv;
	
	public void find_channel(int num) {
		rc.set_TV_channel(tv, num);
	}
}
