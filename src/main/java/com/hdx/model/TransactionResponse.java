package com.hdx.model;

import java.util.Date;

public class TransactionResponse {

	
	private String transactionDate;
	private String transactionTime;
	private String transactionType;
	
	String patientFirstName;
	String patientLastName;
	String payer;
	String serviceProvider;
	String admissionDate;
	
	String facilityTypeCode;
	String certificationActionCode;
	String reviewIdentificationNumber;
	String reviewDecisionReasonCode;
	
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public String getTransactionTime() {
		return transactionTime;
	}
	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getPatientFirstName() {
		return patientFirstName;
	}
	public void setPatientFirstName(String patientFirstName) {
		this.patientFirstName = patientFirstName;
	}
	public String getPatientLastName() {
		return patientLastName;
	}
	public void setPatientLastName(String patientLastName) {
		this.patientLastName = patientLastName;
	}
	public String getPayer() {
		return payer;
	}
	public void setPayer(String payer) {
		this.payer = payer;
	}
	public String getServiceProvider() {
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider) {
		this.serviceProvider = serviceProvider;
	}
	public String getAdmissionDate() {
		return admissionDate;
	}
	public void setAdmissionDate(String admissionDate) {
		this.admissionDate = admissionDate;
	}
	public String getFacilityTypeCode() {
		return facilityTypeCode;
	}
	public void setFacilityTypeCode(String facilityTypeCode) {
		this.facilityTypeCode = facilityTypeCode;
	}
	public String getCertificationActionCode() {
		return certificationActionCode;
	}
	public void setCertificationActionCode(String certificationActionCode) {
		this.certificationActionCode = certificationActionCode;
	}
	public String getReviewIdentificationNumber() {
		return reviewIdentificationNumber;
	}
	public void setReviewIdentificationNumber(String reviewIdentificationNumber) {
		this.reviewIdentificationNumber = reviewIdentificationNumber;
	}
	public String getReviewDecisionReasonCode() {
		return reviewDecisionReasonCode;
	}
	public void setReviewDecisionReasonCode(String reviewDecisionReasonCode) {
		this.reviewDecisionReasonCode = reviewDecisionReasonCode;
	}
	
	@Override
	public String toString() {
		return "TransactionResponse [transactionDate=" + transactionDate + ", transactionTime=" + transactionTime + "]";
	}
}
