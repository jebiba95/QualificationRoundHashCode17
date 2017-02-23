package problem;

public class Request {
	private int numRequest;
	private int idVideo;
	private int idEndpoint;
	
	public Request (int numRequest, int idVideo, int idEndpoint) {
		this.numRequest = numRequest;
		this.idVideo = idVideo;
		this.idEndpoint = idEndpoint;
	}

	/*
	 * Setters and getters methods
	 */
	
	public int getNumRequest() {
		return numRequest;
	}

	public void setNumRequest(int numRequest) {
		this.numRequest = numRequest;
	}

	public int getIdVideo() {
		return idVideo;
	}

	public void setIdVideo(int idVideo) {
		this.idVideo = idVideo;
	}

	public int getIdEndpoint() {
		return idEndpoint;
	}

	public void setIdEndpoint(int idEndpoint) {
		this.idEndpoint = idEndpoint;
	}

	@Override
	public String toString() {
		return "Request [numRequest=" + numRequest + ", idVideo=" + idVideo + ", idEndpoint=" + idEndpoint + "]";
	}
	
	
}
