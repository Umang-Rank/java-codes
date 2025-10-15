package abstraction;

public class PdfDocument extends Document{
	
	public void open() {
		System.out.println("pdf file is opend.....");
	}
	
	public void save() {
		System.out.println("pdf file is saved....");
	}
	
	public static void main(String[] args) {
		Document pdf=new PdfDocument();
		pdf.open();
		pdf.save();
		
	}

}
