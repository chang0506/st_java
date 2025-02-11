package pro4;

public class StringBuilder2 {

	public static void main(String[] args) {
		String names = "전창현님, 김소유님, 서정근님, 장나겸님";
	
		StringBuilder stB = new StringBuilder();
		String restB = names.replaceAll("님, ","/").replaceAll("님","");
		stB.append(restB);
		System.out.println(stB.toString());
		
		int index = names.indexOf("님");
		stB.append(names.substring(index - 3, index));
		stB.append("/");
	}

}
