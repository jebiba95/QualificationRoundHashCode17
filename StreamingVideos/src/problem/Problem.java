package problem;

import java.io.*;
import java.util.*;

public class Problem {
	
	private File file = null;
	Video[] videos = null;
	Endpoint[] endpoints = null;
	Cache[] caches = null;
	Request[] requests = null;
	
	public Problem(String fileName) {
		file = new File(fileName);
	}
	
	public void init() {
		try {
			Scanner scan = new Scanner(file);
			
			// First line.
			int numVideos = scan.nextInt();
			int numEndpoints = scan.nextInt();
			int numRequest = scan.nextInt();
			int numCaches = scan.nextInt();
			int lengthCaches = scan.nextInt();
			
			// Inits components of the system.
			videos = new Video[numVideos];
			endpoints = new Endpoint[numEndpoints];
			caches = new Cache[numCaches];
			requests = new Request[numRequest];
			
			// Second line.			
			for (int i = 0; i < videos.length; i++) {
				videos[i] = new Video(i, scan.nextInt());
				System.out.println(videos[i].toString());
			}
			
			for (int i = 0; i < caches.length; i++) {
				endpoints[i] = new Endpoint(i, scan.nextInt());
				
				int numConnections = scan.nextInt();
				if (numConnections != 0) {
					for (int j = 0; j < numConnections; j++) {
						int cacheId = scan.nextInt();
						caches[cacheId] = new Cache(cacheId, lengthCaches, i);
						System.out.println(caches[cacheId].toString());
						endpoints[i].addCacheLatency(cacheId, scan.nextInt());
					}
				}
				
				System.out.println(endpoints[i].toString());
			}
			
			for (int i = 0; i < requests.length; i++) {
				int videoId = scan.nextInt();
				int endpointId = scan.nextInt();
				int numOfRequest = scan.nextInt();
				
				requests[i] = new Request(numOfRequest, videoId, endpointId);
				System.out.println(requests[i].toString());
			}
			
			scan.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
