
public class TeaMaker {
	int suger;
	int tea;
	int water;
	public TeaMaker(int suger,int tea,int water) {
		this.suger=suger;
		this.tea=tea;
		this.water=water;
	}
	private void boil() {
		System.out.println("Boiling");
	}
private void addSuger() {
	System.out.println(" suger");
	}
private void addTea() {
	System.out.println(" Tea");
}
private void serve() {
	System.out.println(" serve");
}

 void prepare() {
	boil();
	addSuger();
	addTea();
}

}
