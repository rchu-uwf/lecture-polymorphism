
abstract public class Critter {

	private String color = "red";

	Critter() {
		this.color = "white";
	}

	Critter(String color) {
		this.color = color;
	}

	abstract String myTitle();

	final public String getColor() {
		return this.color;
	}

	public boolean equals(Critter c) {
		return c != null && c.getClass() == this.getClass() && c.getColor() == this.getColor();
	}

	abstract public String move();

}
