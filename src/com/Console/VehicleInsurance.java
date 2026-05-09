package com.Console;

public class VehicleInsurance extends Customer {
	public boolean isValidRegistrationNumber() {
		System.out.println("Registration Number :");
		String reg = sc.next();
		return reg.matches("[A-Z]{2}[0-9]{2}[A-Z]{2}\\d{4}");
	}

	int getVehicleAge() {
		System.out.println("Vehicle Age :");
		int vage = sc.nextInt();
		return vage;
	}

	String getVehicleType() {
		System.out.println("Type of vehicle :");
		String type = sc.next();
		if (type.equals("car") || type.equals("bike") || type.equals("lorry")) {
			return type;
		} else {
			System.out.println("invalid vehicle type");
			return getVehicleType();
		}

	}

	int getDrivingExperience() {
		System.out.println("Driving Experience :");
		int exp = sc.nextInt();
		return exp;
	}

	public boolean isValidDrivingLicense() {

		System.out.println("Enter Driving Licence");
		String Licence = sc.next();
		return Licence.matches("[A-Z]{2}[0-9]{2}[2][0][0][0-9]\\d{7}");
	}

	public double calculatePremium(int vage) {
		double premium = 1000;
		if (vage > 10)
			premium = premium + (0.20 * premium);
		return premium;
	}

	public static void main(String[] args) {

		VehicleInsurance vi = new VehicleInsurance();

		int age = vi.getCustomerAge();
		int driveexp = vi.getDrivingExperience();
		int vage = vi.getVehicleAge();
		vi.getVehicleType();

		boolean docsValid = vi.isValidAadhaar() && vi.isValidPAN() && vi.isValidPhone() && vi.isValidDrivingLicense();

		boolean eligible = age >= 21 && driveexp >= 2 && vage <= 15 && vi.isValidRegistrationNumber();

		boolean approved = docsValid && eligible;

		if (approved) {
			System.out.println("Congratulations !! Your Vehicle insurance got Approved");
			double premium = vi.calculatePremium(vage);
			System.out.println("Your Premium is: " + premium);

		} else {
			System.out.println("Sorry! Your Vehicle insurance got Rejected");
		}

	}

}
