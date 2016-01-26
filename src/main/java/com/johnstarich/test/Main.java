package com.johnstarich.test;

import org.eclipse.jetty.server.Server;

/**
 * Main running class.
 * Created by johnstarich on 1/25/16.
 */
public class Main {
	public static void main(String args[]) throws Exception {
		Server server = new Server(8080);
		server.setHandler(new TestHandler());
		server.start();
		server.join();
	}
}
