/*12.   Create a class “Bank” having method getRateOfInterest(). Create child classes as HDFC, SBI and PNB and override getRateOfInterest() and return interest rates as 4.0, 4.5 and 5% correspondingly.*/

class Bank {
	Float getRateOfInterest() {
		return 0f;
	}
}

class HDFC extends Bank {
	@Override
	Float getRateOfInterest() {
		return 4f;
	}
}

class SBI extends Bank {
	@Override
	Float getRateOfInterest() {
		return 4.5f;
	}
}

class PNB extends Bank {
	@Override
	Float getRateOfInterest() {
		return 5f;
	}
}

public class P12_BankRedefined {

	public static void main(String[] args) {
		Bank hdfc = new HDFC();
		System.out.println("Rate of Intrest of HDFC: "+hdfc.getRateOfInterest());
		
		Bank sbi = new SBI();
		System.out.println("Rate of Intrest of SBI: "+sbi.getRateOfInterest());

		Bank pnb = new PNB();
		System.out.println("Rate of Intrest of PNB: "+pnb.getRateOfInterest());
	}
}