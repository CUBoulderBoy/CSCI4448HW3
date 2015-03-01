
public class LogFactory {
	private Logging log;
	
	public Logging createLog(String type){
		if (type.equalsIgnoreCase("text"))
			log = new LogText();
		else if (type.equalsIgnoreCase("xml"))
			log = new LogXML();
		else if (type.equalsIgnoreCase("html"))
			log = new LogHTML();
		else
			log = new LogText();
		return log;
	}
}
