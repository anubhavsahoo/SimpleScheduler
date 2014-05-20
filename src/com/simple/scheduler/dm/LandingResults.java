package com.simple.scheduler.dm;

import java.util.List;

public class LandingResults {
	private Party others;
	private Party aap;
	private Party congress;
	private Party bjp;
	private List<String> close_contests;

	public LandingResults() {
		super();
	}

	public LandingResults(Party others, Party aap, Party congress, Party bjp,
			List<String> close_contests) {
		super();
		this.others = others;
		this.aap = aap;
		this.congress = congress;
		this.bjp = bjp;
		this.close_contests = close_contests;
	}

	public Party getOthers() {
		return others;
	}

	public Party getAap() {
		return aap;
	}

	public Party getCongress() {
		return congress;
	}

	public Party getBjp() {
		return bjp;
	}

	public List<String> getClose_contests() {
		return close_contests;
	}

	@Override
	public String toString() {
		return "LandingResults [others=" + others + ", aap=" + aap
				+ ", congress=" + congress + ", bjp=" + bjp
				+ ", close_contests=" + close_contests + "]";
	}

}
