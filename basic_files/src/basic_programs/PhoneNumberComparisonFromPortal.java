package basic_programs;

import java.util.ArrayList;

public class PhoneNumberComparisonFromPortal {

	public static void main(String[] args) {
		ArrayList<String> l = new ArrayList<String>();
		String phone = "8099765689";
		l.add("(809) 976-5689");
		l.add("(897) 865-4324");
		
		PhoneNumberComparisonFromPortal ph = new PhoneNumberComparisonFromPortal();
		String res = ph.verifiedPhoneNumberFromPortal(l,phone);
		System.out.println(res);
	}
	
	public String verifiedPhoneNumberFromPortal(ArrayList l,String phone){
		for(int i=0;i<l.size();i++){
			String phoneNum =(String) l.get(i);
			phoneNum = phoneNum.replace('(',' ').replace(')',' ').replace('-', ' ').replace(" ", "").trim();
			if(phoneNum.equals(phone)){
				return phoneNum;
			}
		}
		return "Callback not created";
	}
}
