
public class Family extends Animal {
	boolean feline;
	boolean cervidae;
	boolean hominidae;
	boolean leporidae;
	
	public Family() {
		this.feline = false;
		this.cervidae = false;
		this.hominidae = false;
		this.leporidae = false;
	}
	
	public Family(boolean feline, boolean cervidae, boolean hominidae, boolean leporidae) {
		this.feline = feline;
		this.cervidae = cervidae;
		this.hominidae = hominidae;
		this.leporidae = leporidae;
	}

	public boolean isFeline() {
		return feline;
	}

	public void setFeline(boolean feline) {
		this.feline = feline;
	}

	public boolean isCervidae() {
		return cervidae;
	}

	public void setCervidae(boolean cervidae) {
		this.cervidae = cervidae;
	}

	public boolean isHominidae() {
		return hominidae;
	}

	public void setHominidae(boolean hominidae) {
		this.hominidae = hominidae;
	}

	public boolean isLeporidae() {
		return leporidae;
	}

	public void setLeporidae(boolean leporidae) {
		this.leporidae = leporidae;
	}
	
	@Override
	public String toString() {
		String familyName = null;
		String animalName = this.getName();
		
		if (this.feline = true) {
			familyName = "Feline";
		}
		else if (this.cervidae = true) {
			familyName = "Cervidae";
		}
		else if (this.hominidae = true) {
			familyName = "Hominidae";
		}
		else if (this.leporidae = true) {
			familyName = "Leporidae";
		}
		return (animalName + familyName);
	}
}
