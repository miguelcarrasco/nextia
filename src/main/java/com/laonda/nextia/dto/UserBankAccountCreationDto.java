package com.laonda.nextia.dto;

import java.util.ArrayList;
import java.util.Date;

public class UserBankAccountCreationDto {
    private String legalName;
    private String mobilePhoneNumber;
    private String email;
    private ArrayList<Date> dobOfDependants;
    private Date dateOfBirth;
    private String relationshipStatus;
    private int dependants;
    private CreditLimit creditLimit;
    private CreditRating creditRating;
    private String highestEducationAttained;
    private String employmentStatus;
    private boolean kycStatus;
    private Date lastOkDate;
    private String title;
    private String branchId;
    private String nameSuffix;

    private String password;

    public UserBankAccountCreationDto(String legalName, String mobilePhoneNumber, String email, ArrayList<Date> dobOfDependants, Date dateOfBirth, String relationshipStatus, int dependants, CreditLimit creditLimit, CreditRating creditRating, String highestEducationAttained, String employmentStatus, boolean kycStatus, Date lastOkDate, String title, String branchId, String nameSuffix, String password) {
        this.legalName = legalName;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.email = email;
        this.dobOfDependants = dobOfDependants;
        this.dateOfBirth = dateOfBirth;
        this.relationshipStatus = relationshipStatus;
        this.dependants = dependants;
        this.creditLimit = creditLimit;
        this.creditRating = creditRating;
        this.highestEducationAttained = highestEducationAttained;
        this.employmentStatus = employmentStatus;
        this.kycStatus = kycStatus;
        this.lastOkDate = lastOkDate;
        this.title = title;
        this.branchId = branchId;
        this.nameSuffix = nameSuffix;
        this.password = password;
    }

    public String getLegalName() {
        return legalName;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Date> getDobOfDependants() {
        return dobOfDependants;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getRelationshipStatus() {
        return relationshipStatus;
    }

    public int getDependants() {
        return dependants;
    }

    public CreditLimit getCreditLimit() {
        return creditLimit;
    }

    public CreditRating getCreditRating() {
        return creditRating;
    }

    public String getHighestEducationAttained() {
        return highestEducationAttained;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public boolean isKycStatus() {
        return kycStatus;
    }

    public Date getLastOkDate() {
        return lastOkDate;
    }

    public String getTitle() {
        return title;
    }

    public String getBranchId() {
        return branchId;
    }

    public String getNameSuffix() {
        return nameSuffix;
    }

    public String getPassword() {
        return password;
    }
}
