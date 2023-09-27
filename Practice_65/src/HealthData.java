
public class HealthData<W, H> {
	private String name;
	private W weight;
	private H height;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public W getWeight() {
		return weight;
	}

	public void setWeight(W weight) {
		this.weight = weight;
	}

	public H getHeight() {
		return height;
	}

	public void setHeight(H height) {
		this.height = height;
	}

	public HealthData(String name, H height, W weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public String toString() {
		return "(" + name + ", " + weight + ", " + height + ")";
	}
	
}
