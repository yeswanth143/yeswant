import java.util.regex.*;
import java.io.*;
public class Mobile 
{
public static void main(String[] args) throws IOException 
{
PrintWriter pw = new PrintWriter("kk.txt");
Pattern p=Pattern.compile("(0|91)?[6-9][0-9]{9}");
BufferedReader br = new BufferedReader(new FileReader("xy.txt"));
String line=br.readLine();
while(line != null)
{
Matcher m=p.matcher(line);
while(m.find())
{
pw.println(m.group());
}
line=br.readLine();
}
pw.flush();
}
}

