package question1;

import java.io.Serializable;

public class project implements Serializable{

	private static final long serialVersionUID = 1L;
	String projectCode;
	String projectName;
	int projectStrength;

	public project(String projectCode, String projectName, int projectStrength) {
		this.projectCode = projectCode;
		this.projectName = projectName;
		this.projectStrength = projectStrength;
	}

	@Override
	public String toString() {
		return "Project [projectCode=" + projectCode + ", projectName=" + projectName + ", projectStrength="
				+ projectStrength + "]";
	}
	
}
