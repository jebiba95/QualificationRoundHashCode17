package problem;

public class Cache {
	private int cacheId;
	private int lenghtCache;
	private int endpointId;
	
	public Cache (int cacheId, int lenghtCache, int endpointId) {
		this.cacheId = cacheId; 
		this.lenghtCache = lenghtCache;
		this.endpointId = endpointId;
	}

	public int getCacheId() {
		return cacheId;
	}

	public void setCacheId(int cacheId) {
		this.cacheId = cacheId;
	}

	public int getEndpointId() {
		return endpointId;
	}

	public void setEndpointId(int endpointId) {
		this.endpointId = endpointId;
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
		return "Cache [cacheId=" + cacheId + ", lenghtCache=" + lenghtCache + ", endpointId=" + endpointId + "]";
	}
	
	
}

