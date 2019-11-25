
public class MainClass {

	public static void main(String[] args) {
		TeaMaker firstTea=new TeaMaker(2, 2, 1);
		firstTea.prepare();
		TeaMaker second=new GaulfTeaMaker(7,5,2);
		second.prepare();

	}

}
