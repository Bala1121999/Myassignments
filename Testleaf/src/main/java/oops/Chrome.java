package oops;

public class Chrome extends Browser {

	public void  openIncognito() {
		System.out.println("open incognito");
		}
	public void openURL() {
		System.out.println("updated url");}
	
	public void  clearCache() {
		System.out.println("open incognito");
		}
public static void main(String[] args) {
	Chrome ch = new Chrome();
	ch.browserName = "chrome";
	System.out.println(ch.browserName);
	System.out.println(ch.browserversion);
	ch.clearCache();
	ch.closeBrowser();
	ch.navigateback();
	ch.openIncognito();
	ch.openURL();
	}
}