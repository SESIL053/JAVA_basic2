
public class Config {
	private int size;
	private int range;
	private int key;
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getRange() {
		return range;
	}
	
	public void setRange(int range) {
		this.range = range;
	}
	
	public int getKey() {
		return key;
	}
	
	public void setKey(int key) {
		this.key = key;
	}

	public Config(int size, int range, int key) {
		super();
		this.size = size;
		this.range = range;
		this.key = key;
	}

}
