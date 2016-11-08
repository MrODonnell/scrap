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
		boolean x = false;
		if(x)
			System.out.println("false");
		else
			System.out.println("true");
		
		TextFormatter tf;
		String test = "Hello, its me. I havent thought about you in a long long time";
		tf = new TextFormatter(test);
		 System.out.println(tf.hello());
		 String find = "_"; 
		 int z = tf.findString(find, 0);
		 System.out.println(z);
}
}