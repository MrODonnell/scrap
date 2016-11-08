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
	public int countStrings (String str)
	{
		int count = 0;
		int psn = 0;
		while(findString (str, psn) >= 0)
		{
			count++;
			psn = findString (str, psn) +1;
		}
		
		return count;
	}
	
	public String convertItalics ()
	{
		if (countStrings ("_") % 2 == 1)
		return line;

		 System.out.println("convertItalics one");
		String tag = "<I>";
		String result = "";
		int psn = 0;
		while (findString ("_", psn) >= 0)
		{
			int newPsn = findString ("_", psn);
			 System.out.println("convertItalics  inside one");
			result = result + line.substring(psn, newPsn);
			result = result + tag;
			if (tag.equals("<I>"))
				tag = "</I>";
			else
				tag = "<I>";
			psn = newPsn + 1;
		}
		result = result + line.substring(psn);
		return result;
	}
	public String hello ()
	{
		return "hello";
	}
	}




