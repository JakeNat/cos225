
public class Family extends Animal {
	String familyName = "Feline";
	String call = "Roar";
	String furColor;
	int runningSpeed;
	int weight;
	int length;
	
	public Family(String name) {
		super(name);
		this.furColor = null;
		this.runningSpeed = 0;
		this.weight = 0;
		this.length = 0;
	}
	
	public Family(String name, String furColor, int runningSpeed, int weight, int length) {
		super(name);
		this.furColor = furColor;
		this.runningSpeed = runningSpeed;
		this.weight = weight;
		this.length = length;
	}
	
	public String getFurColor() {
		return furColor;
	}
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	
	public int getRunningSpeed() {
		return runningSpeed;
	}
	
	public void setRunningSpeed(int runningSpeed) {
		this.runningSpeed = runningSpeed;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getLength() {
		return length;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	@Override
	public String toString() {
		return super.toString() + "Family Name: " + familyName + " Species' Call: " + call;
	}
}