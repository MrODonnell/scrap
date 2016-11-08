package scrap;

public class TextFormatter {

	private String line;
	
	public TextFormatter (String lineToFormat)
	{ line = lineToFormat; }
	
	public int findString (String str, int start)
	{
		//int psn;
		int psn = line.indexOf(str, start);
		while (psn >= 0) 
		{
			String before = "";
			String after = "";
			
			if(psn > 0)
			{
				before = line.substring(psn-1,  psn);
				after = line.substring(psn + 1,  psn + 2);
				
				//System.out.println(); 
				if( !str.equals(before) && !str.equals(after))
				{
					return psn;
				}
				
				psn++;
				psn = line.indexOf(str, psn);
			}
		}
		
		return -1;
	}
	String hello ()
	{
		return "hello";
	}
	}




