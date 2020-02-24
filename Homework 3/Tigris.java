
public class Tigris extends Family {
	int pawWidth;
	int toothLength;
	
	public Tigris(String name) {
		super(name);
		this.pawWidth = 6;
		this.toothLength = 3;
	}
	
	public Tigris(String name, int pawWidth, int toothLength) {
		super(name);
		this.pawWidth = pawWidth;
		this.toothLength = toothLength;
	}
	
	public int getPawWidth() {
		return pawWidth;
	}
	
	public void setPawWidth(int pawWidth) {
		this.pawWidth = pawWidth;
	}
	
	public int getToothLength() {
		return toothLength;
	}
	
	public void setToothLength(int toothLength) {
		this.toothLength = toothLength;
	}
	
	@Override
	public String toString() {		
		return super.toString() + " Paw Width: " + pawWidth + " Tooth Length: " + toothLength;
		
	}
}
