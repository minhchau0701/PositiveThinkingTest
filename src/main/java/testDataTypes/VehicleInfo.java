package testDataTypes;

public class VehicleInfo {
	private String type;
	private RegistrationInfo registrationInfo;
	private int isLeftHand;
	private int seats;
	private Modification modification;
	private String dateOfPurchase;
	private int value;
	private String parkedOvernight;
	private String overnightAddress;
	private String usage;
	private int mileage;
	private Wedding wedding;
	private String immobiliser;
	private int tracking;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public RegistrationInfo getRegistrationInfo() {
		return registrationInfo;
	}

	public void setRegistrationInfo(RegistrationInfo registrationInfo) {
		this.registrationInfo = registrationInfo;
	}

	public int getIsLeftHand() {
		return isLeftHand;
	}

	public void setIsLeftHand(int isLeftHand) {
		this.isLeftHand = isLeftHand;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	public Modification getModification() {
		return modification;
	}

	public void setModification(Modification modification) {
		this.modification = modification;
	}

	public String getDateOfPurchase() {
		return dateOfPurchase;
	}

	public void setDateOfPurchase(String dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getParkedOvernight() {
		return parkedOvernight;
	}

	public void setParkedOvernight(String parkedOvernight) {
		this.parkedOvernight = parkedOvernight;
	}

	public String getOvernightAddress() {
		return overnightAddress;
	}

	public void setOvernightAddress(String overnightAddress) {
		this.overnightAddress = overnightAddress;
	}

	public String getUsage() {
		return usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public Wedding getWedding() {
		return wedding;
	}

	public void setWedding(Wedding wedding) {
		this.wedding = wedding;
	}

	public String getImmobiliser() {
		return immobiliser;
	}

	public void setImmobiliser(String immobiliser) {
		this.immobiliser = immobiliser;
	}

	public int getTracking() {
		return tracking;
	}

	public void setTracking(int tracking) {
		this.tracking = tracking;
	}
}
