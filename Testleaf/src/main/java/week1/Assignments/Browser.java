package week1.Assignments;

public class Browser {

	public void launchBrowser(String browser) {
		if (browser == "chrome") {
			System.out.println("chrome browser is opened");
		}
		else if (browser == "firefox") {
			System.out.println("firefox browser is opened");
		}
		else if (browser == "internet") {
			System.out.println("internrt explorer is opened");
	}
		else if (browser == "edge") {
			System.out.println("Edge browser is opened");
}
		
		
	}
	public void urlload() {
		System.out.println("url is loaded");
	}

	
	public static void main(String[] args) {
		Browser br = new Browser();
		br.launchBrowser("firefox");
		br.urlload();
	}
}	