
public class Frog extends Critter {
	int wartCount = 0;

	Frog(String color) {
		super(color);
		this.wartCount = 5;

	}

	public boolean equals(Frog f) {
		return super.equals(f) && f.wartCount == this.wartCount;
	}

	public String myTitle() {
		return "Hoppy frog";
	}

	@Override
	public String move() {
		return "hop, hop, hop";
	}

}
