package com.simple.scheduler;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class App {

	private static final int THREAD_COUNT = 100;
	private ScheduledExecutorService executor = null;

	public App() {
		super();
	}

	public void start() {
		executor = new ScheduledThreadPoolExecutor(THREAD_COUNT);
		System.out.println("App Started");
	}

	public void schedule(Runnable task1, long period) {
		executor.scheduleAtFixedRate(task1, 0, period, TimeUnit.MILLISECONDS);
	}
}
