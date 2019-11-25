
public class GaulfTeaMaker extends TeaMaker {
	public GaulfTeaMaker(int suger, int tea, int water) {
		super(suger, tea, water);
		// TODO Auto-generated constructor stub
	}

	private int mailk;
	public int getMailk() {
		return mailk;
	}
	public void setMailk(int mailk) {
		this.mailk = mailk;
	}
private void addMailk() {
	System.out.println(" mailk");
		
	}
@Override
void prepare() {
	
	super.prepare();
	addMailk();
}

	

}
