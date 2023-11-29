package member;

import java.sql.Date;

public class MemberVO {
	private String email;
	private String psw;
	private String mrole;
    private Date create_dt;
    private Date modify_dt;
    private String delyn;
    
	public MemberVO(String email, String psw, String mrole, Date create_dt, Date modify_dt, String delyn) {
		super();
		this.email = email;
		this.psw = psw;
		this.mrole = mrole;
		this.create_dt = create_dt;
		this.modify_dt = modify_dt;
		this.delyn = delyn;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPsw() {
		return psw;
	}
	public void setPsw(String psw) {
		this.psw = psw;
	}
	public String getMrole() {
		return mrole;
	}
	public void setMrole(String mrole) {
		this.mrole = mrole;
	}
	public Date getCreate_dt() {
		return create_dt;
	}
	public void setCreate_dt(Date create_dt) {
		this.create_dt = create_dt;
	}
	public Date getModify_dt() {
		return modify_dt;
	}
	public void setModify_dt(Date modify_dt) {
		this.modify_dt = modify_dt;
	}
	public String getDelyn() {
		return delyn;
	}
	public void setDelyn(String delyn) {
		this.delyn = delyn;
	}
	@Override
	public String toString() {
		return "MemberVO [email=" + email + ", psw=" + psw + ", mrole=" + mrole + ", create_dt=" + create_dt
				+ ", modify_dt=" + modify_dt + ", delyn=" + delyn + "]";
	}
    
}
