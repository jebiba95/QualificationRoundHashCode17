package problem;

import java.util.ArrayList;

public class Cache {
	private int cacheId;
	private int lenghtCache;
	private ArrayList<Integer> endpointsId = null;
	
	public Cache (int cacheId, int lenghtCache) {
		this.cacheId = cacheId; 
		this.lenghtCache = lenghtCache;
		endpointsId = new ArrayList<Integer>();
	}

	public int getCacheId() {
		return cacheId;
	}

	public void setCacheId(int cacheId) {
		this.cacheId = cacheId;
	}

	public void addEndpointId(int endpointId) {
		endpointsId.add(endpointId);
	}

	public ArrayList<Integer> getEndpoints() {
		return endpointsId;
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
		return "Cache [cacheId=" + cacheId + ", lenghtCache=" + lenghtCache + ", endpointsId=" + endpointsId + "]";
	}
}

