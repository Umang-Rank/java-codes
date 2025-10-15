package abstraction;

public class WordDocument extends Document{
	
	public void open() {
		System.out.println("word document is opened...");
	}
	
	public void save() {
		System.out.println("your word file is saved....");
	}
	
	public static void main(String[] args) {
		Document wd=new WordDocument();
		wd.open();
		wd.save();
		
	}

}
