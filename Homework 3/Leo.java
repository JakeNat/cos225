
public class Leo extends Family {
	int roarVolume;
	int tailLength;
	
	public Leo(String name) {
		super(name);
		this.roarVolume = 1;
		this.tailLength = 3;
	}
	
	public Leo(String name, int roarVolume, int tailLength) {
		super(name);
		this.roarVolume = roarVolume;
		this.tailLength = tailLength;
	}
	
	public int getRoarVolume() {
		return roarVolume;
	}
	
	public void setRoarVolume(int roarVolume) {
		this.roarVolume = roarVolume;
	}
	
	public int getTailLength() {
		return tailLength;
	}
	
	public void setTailLength(int tailLength) {
		this.tailLength = tailLength;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Tail Length: " + tailLength + " Roar Volume: " + roarVolume;
	}
}
