package problem;

public class Cache {
	private int lenghtCache;
	
	public Cache (int lenghtCache) {
		this.lenghtCache = lenghtCache;
	}

	public int getLenghtCache() {
		return lenghtCache;
	}

	/*
	 * Setters and getters methods
	 */
	
	public void setLenghtCache(int lenghtCache) {
		this.lenghtCache = lenghtCache;
	}
	
	@Override
	public String toString() {
		return "Cache [lenghtCache=" + lenghtCache + "]";
	}
}

