package entity;
/**
 * 与数据库相关的学生信息表
 * @author 苏杭
 *
 */
public class StudentInfo {

	private int sTuNo;//编号
	private String sTuName;//姓名
	private int sTuAge;//年龄
	public int getsTuNo() {
		return sTuNo;
	}
	public void setsTuNo(int sTuNo) {
		this.sTuNo = sTuNo;
	}
	public String getsTuName() {
		return sTuName;
	}
	public void setsTuName(String sTuName) {
		this.sTuName = sTuName;
	}
	public int getsTuAge() {
		return sTuAge;
	}
	public void setsTuAge(int sTuAge) {
		this.sTuAge = sTuAge;
	}
	public StudentInfo(int sTuNo, String sTuName, int sTuAge) {
		super();
		this.sTuNo = sTuNo;
		this.sTuName = sTuName;
		this.sTuAge = sTuAge;
	}
	public StudentInfo() {
		super();
	}


	
	
}
