package com.app.model;

public class Relese {
	private String warName;
	private Long totalMemory;
	private Long useageMemory;
	private String deployeDate;
	public String getWarName() {
		return warName;
	}
	public void setWarName(String warName) {
		this.warName = warName;
	}
	public Long getTotalMemory() {
		return totalMemory;
	}
	public void setTotalMemory(Long totalMemory) {
		this.totalMemory = totalMemory;
	}
	public Long getUseageMemory() {
		return useageMemory;
	}
	public void setUseageMemory(Long useageMemory) {
		this.useageMemory = useageMemory;
	}
	public String getDeployeDate() {
		return deployeDate;
	}
	public void setDeployeDate(String deployeDate) {
		this.deployeDate = deployeDate;
	}
	@Override
	public String toString() {
		return "Relese [warName=" + warName + ", totalMemory=" + totalMemory + ", useageMemory=" + useageMemory
				+ ", deployeDate=" + deployeDate + "]";
	}
	

}
