package testDataTypes;

import java.util.List;

public class PersonalDetails {
	public String infoKind;
	private String maritalStatus;
	private String homeOwner;
	private ResidencyDate residencyDate;
	private String licenceType;
	private LicenceYear licenceYear;
	private String passPlus;
	private String liceneNumber;
	private FullTimeJob fullTimeJob;
	private PartTimeJob partTimeJob;
	private ClaimInsurance claimInsurance;
	private Conviction conviction;
	private List<AdditionDriver> additionDriver = null;

	public class ResidencyDate {
		private String fromBirth;
		private String month;
		private String year;
	}

	public class LicenceYear {
		private String year;
		private String month;
	}

	public class FullTimeJob {
		private String status;
		private String occupation;
		private String business;
	}

	public class PartTimeJob {
		private String status;
		private String occupation;
		private String business;
	}

	public class ClaimInsurance {
		private String status;
		private ClaimKind claimKind;
		private IncidentTime incidentTime;
		private String claimDiscount;
		private String claimAmount;
		private String personalInjury;
	}

	public class ClaimKind {
		private String name;
		private String fault;
	}

	public class IncidentTime {
		private String month;
		private String year;
	}
	
	public class Conviction {
		private String status;
		private String dVLA;
		private ConvictionTime convictionTime;
		private String penaltyPoint;
		private String fine;
		private Banned banned;
	}
	
	public class ConvictionTime {
		private String day;
		private String month;
		private String year;
	}
	
	public class Banned {
		private String status;
		private String length;
		private String unit;
	}
	
	public class AdditionDriver {
		private Integer index;
		private String status;
		private String title;
		private String firstName;
		private String surName;
		private String birthDay;
		private String relationship;
		private String maritalStatus;
		private String resicencyDate;
		private String licenceType;
		private LicenceYear licenceYear;
		private String liceneNumber;
		private FullTimeJob fullTimeJob;
		private PartTimeJob partTimeJob;
		private ClaimInsurance claimInsurance;
		private Conviction conviction;
	}

}
