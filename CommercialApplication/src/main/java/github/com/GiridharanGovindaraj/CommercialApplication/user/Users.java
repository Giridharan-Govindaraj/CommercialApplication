package github.com.GiridharanGovindaraj.CommercialApplication.user;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class Users {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id",nullable = false,unique = true,updatable = false)
	private long userID;
	@Column(name = "user_name",length=20,nullable = false,unique = true,updatable = false)
	private String userName;
	@Column(name = "email",length = 100,nullable = false,unique = true,updatable = true)
	private String email;
	@Column(name = "password",length = 8,nullable = false,unique = false,updatable = true)
	private String password;
	@Column(name = "country",length = 20,nullable = false,unique = false,updatable = true)
	private String country;
	@Column(name = "country_code",precision = 0,nullable = false,unique = false,updatable = true)
	private int countryCode;
	@Column(name = "phone_number")
	private long phoneNumber;
	@Column(name = "role",length =10,nullable = false,unique = false,updatable = true)
	private String role;
	
	public long getUserID() {
		return userID;
	}
	public void setUserID(long userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Users(long userID, String userName, String email, String password, String country, int countryCode,
			long phoneNumber, String role) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.country = country;
		this.countryCode = countryCode;
		this.phoneNumber = phoneNumber;
		this.role = role;
	}
	public Users() {
		super();
	}
	@Override
	public String toString() {
		return "Users [userID=" + userID + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", country=" + country + ", countryCode=" + countryCode + ", phoneNumber=" + phoneNumber + ", role="
				+ role + "]";
	}
	
	
	
	
	
	
	

}
