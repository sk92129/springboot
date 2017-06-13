package hello;


/**
 * Created by seankang on 10/27/14.
 */
public class OkStatus {

	private boolean Ok;

	public OkStatus()
	{

	}
	public OkStatus(final boolean yes){
		Ok = yes;
	}

	public boolean isOk() {
		return Ok;
	}

	public void setOk(boolean ok) {
		Ok = ok;
	}
}
