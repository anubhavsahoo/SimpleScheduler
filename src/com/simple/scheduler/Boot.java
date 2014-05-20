/**
 * 
 */
package com.simple.scheduler;

import com.simple.scheduler.dm.LandingResults;

/**
 * @author loneranger
 * 
 */
public class Boot {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		App app = new App();
		app.start();
		ScraperTask<LandingResults> task1 = new ScraperTask<LandingResults>(
				"http://electioncharts.com/api/landing", LandingResults.class);
		app.schedule(task1, 10000);
	}

}
