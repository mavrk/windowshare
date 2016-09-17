package InputReader;

import com.google.gson.Gson;

import Networking.WindowShareNode;

public class MouseEvent {
	static WindowShareNode network;
	
	String type;
	Gson gson = new Gson();
	
	void send() {
		System.out.println(this.toString());
		System.out.println(gson.toJson(this));
		network.send(gson.toJson(this));
	}
	
	public String toString() {
		return "mouseEvent: " + type;
	}
}
