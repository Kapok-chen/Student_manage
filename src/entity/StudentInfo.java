package entity;
/**
 * �����ݿ���ص�ѧ����Ϣ��
 * @author �պ�
 *
 */
public class StudentInfo {

	private int sTuNo;//���
	private String sTuName;//����
	private int sTuAge;//����
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
