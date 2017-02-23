package problem;

import java.util.Hashtable;

public class Endpoint {
	private int idEndpoint;
	private int latencyDataCenter; 
	private Hashtable<Integer, Integer> latencyToCaches;
	
	public Endpoint(int idEndpoint, int latencyDataCenter) {
		this.idEndpoint = idEndpoint;
		this.latencyDataCenter = latencyDataCenter;
		this.latencyToCaches = new Hashtable<Integer, Integer>();
	}

	/*
	 * Setters and getters methods
	 */
	
	public int getLatencyDataCenter() {
		return latencyDataCenter;
	}

	public void setLatencyDataCenter(int latencyDataCenter) {
		this.latencyDataCenter = latencyDataCenter;
	}

	public void addCacheLatency(int idCache, int latency) {
		latencyToCaches.put(idCache, latency);
	}
	
	public int getCacheLatency(int idCache) {
		return latencyToCaches.get(idCache);
	}

	public int getIdEndpoint() {
		return idEndpoint;
	}

	public void setIdEndpoint(int idEndpoint) {
		this.idEndpoint = idEndpoint;
	}

	@Override
	public String toString() {
		return "Endpoint [idEndpoint=" + idEndpoint + ", latencyDataCenter=" + latencyDataCenter + ", latencyToCaches="
				+ latencyToCaches + "]";
	}

}
