package speed;

import java.util.Map;

public class Ymluser {
	
	String Name;
	int age;
	Map<String, String> address;
	String[] roles;
String getName() {
	return Name;
}

void setName(String Name) {
    this.Name = Name;
	}

public int getAge() {
    return age;
}
public void setAge(int age) {
    this.age = age;
}
public Map<String, String> getAddress() {
    return address;
}
public void setAddress(Map<String, String> address) {
    this.address = address;
}
public String[] getRoles() {
    return roles;
}
public void setRoles(String[] roles) {
    this.roles = roles;
}


}
