public class ImportDemoTest {
	// entry point here
	public static void main(String[] args) {
		// now can use ImportDemo method on iD object
		ImportDemo iD = new ImportDemo();
		String currentDate = iD.getCurrentDate();
		System.out.println(currentDate);
	}
}