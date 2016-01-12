package ymproject.commandObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="COMMAND_MEMBER")
public class CommandMember {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MEMBER_SEQ")
	@SequenceGenerator(name="MEMBER_SEQ", sequenceName="command_member_seq",allocationSize=1)
	private Long id;
	private String name;
	private String emailAdd;
	private String emailDom;
	private String phoneNumber;
	private String password;
	private String address;
	
	public String getName() {
		return name;
	}
	
	public CommandMember(String name, String emailAdd, String emailDom, String phoneNumber, String password,
			String address) {
		super();
		this.name = name;
		this.emailAdd = emailAdd;
		this.emailDom = emailDom;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.address = address;
	}

	public CommandMember() {
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailAdd() {
		return emailAdd;
	}
	public void setEmailAdd(String emailAdd) {
		this.emailAdd = emailAdd;
	}
	public String getEmailDom() {
		return emailDom;
	}
	public void setEmailDom(String emailDom) {
		this.emailDom = emailDom;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "CommandMember [id=" + id + ", name=" + name + ", emailAdd=" + emailAdd + ", emailDom=" + emailDom
				+ ", phoneNumber=" + phoneNumber + ", password=" + password + ", address=" + address + "]";
	}
	
}
