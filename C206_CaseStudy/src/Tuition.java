import java.time.LocalDateTime;

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * 20008353, Aug 2, 2021 10:08:06 PM
 */

public class Tuition {
	private String tuitionCode;
	private String tuitonTitle;
	private String subjGrpName;
	private String tuitionDescription;
	private double tuitionDuration;
	private String prerequisite;
	private String teacher;

	public Tuition(String tuitionCode, String tuitonTitle, String subjGrpName, String tuitionDescription,
			double tuitionDuration, String prerequisite, String teacher) {
		this.tuitionCode = tuitionCode;
		this.tuitonTitle = tuitonTitle;
		this.subjGrpName = subjGrpName;
		this.tuitionDescription = tuitionDescription;
		this.tuitionDuration = tuitionDuration;
		this.prerequisite = prerequisite;
		this.teacher = teacher;
	}

	public String getTuitionCode() {
		return tuitionCode;
	}

	public String getTuitonTitle() {
		return tuitonTitle;
	}

	public String getSubjGrpName() {
		return subjGrpName;
	}

	public String getTuitionDescription() {
		return tuitionDescription;
	}

	public double getTuitionDuration() {
		return tuitionDuration;
	}
	
	public String getPrerequisite() {
		return prerequisite;
	}
	
	public String getTeacher() {
		return teacher;
	}

}