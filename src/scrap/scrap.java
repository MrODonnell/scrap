package scrap;

public class scrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tag = "<i>";
		for(int i = 0; i < 12; i++){
		if(tag=="</i>"){
			tag = "<i>";
		}else{
			tag = "</i>";
		}

		System.out.println(tag);
	}
		if(0)
			System.out.println("false");
		else
			System.out.println("true");
}
}