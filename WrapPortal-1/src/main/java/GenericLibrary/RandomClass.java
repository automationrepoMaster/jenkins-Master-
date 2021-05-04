package GenericLibrary;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomClass {

	static Random ran = new Random();
	static int rNo = ran.nextInt(10000);//generating the random no from 1 to  10k
	
	
	public static String randomName () {
		
		String randomNames= "Raja"+ rNo;
		return randomNames;
		
	}

	public static String randomProgramName() {
		String randomNo = "Programs" + rNo;
		return randomNo;
	}
	
	public static String randomCarrierName() {
		String randomNo = "Carriers" + rNo;
		return randomNo;

	}

	public static String randomDocumentType() {
		String randomNo = "DocumentTypeTest" + rNo;
		return randomNo;

	}

	public static String randomClassCodeNumber() {
		int rNo = ran.nextInt(35000);
		String randomNo =""+rNo;
		return randomNo;

	}
public static String randomClassCodeDescription() {
		
		String randomNo = "Class Codes" + rNo;
		return randomNo;

	}
	public static String randomProgramCode() {
		
		String randomNo = "ProgCode" + rNo;
		return randomNo;

	}

	public static String randomSponsorName() {
		String randomNo = "Sponsors" + rNo;
		return randomNo;

	}

	public static String randomDivisionName() {
		String randomNo = "Divisions" + rNo;
		return randomNo;

	}
	public static String randomDivisionCode() {
		String randomNo = "Div" + rNo;
		return randomNo;

	}

	public static String randomUserName() {
		String randomNo = "Users" + rNo;
		return randomNo;

	}
	public static String randomTradeDescription() {
		String randomNo = "Trades" + rNo;
		return randomNo;

	}
	public static String randomTradeNO() {
		String randomNo = "TRNO" + rNo;
		return randomNo;

	}
	public static String randomTradeDescription_EX() {
		String randomNo = "Trades Excluded" + rNo;
		return randomNo;

	}
	public static String randomTradeNO_EX() {
		Random ran1 = new Random();
		int rNo1 = ran1.nextInt(99000);
		String randomNo = ""+rNo1;
		return randomNo;

	}

	public static String randomProgram() {
		String randomNo = "Sony Programs" + rNo;
		return randomNo;

	}
	public static String randomProject() {
		String randomNo = "Sony Projects" + rNo;
		return randomNo;

	}

	public static String randomProjectStatus() {

		String randomNo = "ProjectStatuTest" + rNo;
		return randomNo;

	}
	
	public static String randomProjectType() {
		String randomNo = "ProjectTypeTest" + rNo;
		return randomNo;
	}
	
	public static String randomContactType() {

		String randomNo = "ContactTypeTest" + rNo;
		return randomNo;

	}
	public static String randomProjectCode() {

		String randomNo = "PC" + rNo;
		return randomNo;

	}
	
	public static String randomContractorCompanyName() {

		String randomNo = "Alex Company" + rNo;
		return randomNo;

	}
	
	public static String randomContractorCompanyNames() {

		String randomNo = "TysonJohn" + rNo;
		return randomNo;

	}
	
	public static String randomFEIN() {

		String randomNo = "FEIN" + rNo;
		return randomNo;

	}

	public static String randomPhoneNo() {
		Random ran = new Random();
		int randomNo = ran.nextInt(1000000000);
		String phoneNo = randomNo + "4546";
		return phoneNo;

	}

	public static String randomMobileNo() {
		Random ran = new Random();
		int randomNo = ran.nextInt(1000000000);
		String mobileNo = randomNo + "";
		return mobileNo;

	}

	public static String randomAddress1Field() {
		String randomNo = "North Street No" + rNo;
		return randomNo;
	}

	public static String randomState() {
		// get a random string value from list
		String randomElement = null;
		Random rand = new Random();
		List<String> givenList = Arrays.asList("Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado",
				"Connecticut", "Delaware", "Florida", "Utah", "Hawaii", "Idaho", "Illinois", "Indiana", "Iowa",
				"Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", "Minnesota",
				"Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico",
				"New York", "North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania",
				"Rhode Island", "South Carolina", "South Dakota", "Tennessee", "Texas", "Utah", "Vermont", "Virginia",
				"Washington", "Washington, DC", "West Virginia", "Wisconsin", "Wyoming", "Canada");

		int numberOfElements = 2;
		for (int i = 0; i < numberOfElements; i++) {
			int randomIndex = rand.nextInt(givenList.size());
			randomElement = givenList.get(randomIndex);
		}
		return randomElement;

	}
	
	public static String randomTrade() {
		// get a random string value from list
		String randomElement = null;
		Random rand = new Random();
		List<String> givenList = Arrays.asList("Confectionery and Nut Stores", "Confectionery Manufacturing from Purchased Chocolate", "Confectionery Merchant Wholesalers", "Confectionery Merchant Wholesalers", "Construction", "Consumer Goods Rental",
				"Consumer Lending", "Convenience Stores", "Convention and Trade Show Organizers", "Convention and Trade Show Organizers", "Corn Farming", "Correctional Institutions", "Cotton Farming", "Cotton Ginning", "Couriers and Express Delivery Services",
				"Couriers and Messengers", "Courts", "Credit Bureaus", "Credit Unions", "Crop Production", "Curtain and Linen Mills", "Curtain and Linen Mills", "Custom Roll Forming",
				"Cut and Sew Apparel Contractors", "Dance Companies", "Data Processing, Hosting, and Related Services", "Deep Sea Freight", "Department Stores", "Direct", "Electric", "Electrical",
				"Farm", "Fire Protection", "Fishing", "Fitness", "Floor Covering Stores", "Florists", "Flour Milling",
				"Fluid", "Folding Paperboard", "Food", "Footwear", "Formal", "Freight", "Fresh", "Frozen",
				"Fruit", "Fuel", "Funds", "Furniture", "Gasoline", "General");
		int numberOfElements = 4;
		for (int i = 0; i < numberOfElements; i++) {
			int randomIndex = rand.nextInt(givenList.size());
			randomElement = givenList.get(randomIndex);
		}
		return randomElement;
	}

	public static String randomDBA() {
		String randomNo = "NCP_DBA" + +rNo + rNo;
		return randomNo;

	}

	public static String randomString() {
		String randomNo = "Sponsor" + rNo;
		return randomNo;

	}

	public static String SubjectName() {
		// TODO Auto-generated method stub
		String randomNo = "SubjectName" + rNo;
		return randomNo;
		
	}
}
