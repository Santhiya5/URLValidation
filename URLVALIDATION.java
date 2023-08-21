
package newtask;
import java.util.regex.*;


public class URLVALIDATION {
    public static boolean
	isValidURL(String url)
        {
            String regex = "((http|https)://)(www.)?"+ "[a-zA-Z0-9@:%._\\+~#?&//=]"+ "{2,256}\\.[a-z]"
			+ "{2,6}\\b([-a-zA-Z0-9@:%"+ "._\\+~#?&//=]*)";
		Pattern p = Pattern.compile(regex);
		if (url == null) {
			return false;
		}
		Matcher m = p.matcher(url);
                return m.matches();
	}
	public static void main(String args[])
	{
		String url= "https://www.google.com";
		if (isValidURL(url) == true) {
			System.out.println("Yes");
		}
		else
			System.out.println("NO");
	}
}


