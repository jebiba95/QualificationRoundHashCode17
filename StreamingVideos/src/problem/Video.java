package problem;

public class Video {
	private int lenghtVideo;
	private int videoId;
	
	public Video(int id, int lenghtVideo) {
		this.videoId = id;
		this.lenghtVideo = lenghtVideo;
	}

	/*
	 * Setters and getters methods
	 */
	
	public int getLenghtVideo() {
		return lenghtVideo;
	}

	public void setLenghtVideo(int lenghtVideo) {
		this.lenghtVideo = lenghtVideo;
	}

	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}

	@Override
	public String toString() {
		return "Video [lenghtVideo=" + lenghtVideo + ", videoId=" + videoId + "]";
	}

}
