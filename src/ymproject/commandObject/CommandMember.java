package ymproject.commandObject;

import java.util.concurrent.atomic.AtomicInteger;

public class CommandMember {
	private static final AtomicInteger count = new AtomicInteger(0); 
	private int id;
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
		this.id = count.incrementAndGet();
		this.name = name;
		this.emailAdd = emailAdd;
		this.emailDom = emailDom;
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.address = address;
	}

	public CommandMember() {
		this.id = count.incrementAndGet();
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
	public String getEmail() {
		return emailAdd;
	}
	public void setEmail(String emailAdd) {
		this.emailAdd = emailAdd;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
