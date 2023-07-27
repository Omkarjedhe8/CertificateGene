package com.renocrewsoluations.certgenerator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

public class generateOfferLetter {

	private String internName;
	private String internshipTitle;
	private Date startDate;
	private Date endDate;
	private String companyName;
	private String companyAddress;
	                                      
	

	public String getInternName() {
		return internName;
	}


	public void setInternName(String internName) {
		this.internName = internName;
	}


	public String getInternshipTitle() {
		return internshipTitle;
	}


	public void setInternshipTitle(String internshipTitle) {
		this.internshipTitle = internshipTitle;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getEndDate() {
		return endDate;
	}


	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}


	public String getCompanyName() {
		return companyName;
	}


	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}


	public String getCompanyAddress() {
		return companyAddress;
	}


	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}


	public void GenerateOfferLetter(String internName, String internshipTitle, Date startDate, Date endDate, String companyName, String companyAddress) {
	        this.internName = internName;
	        this.internshipTitle = internshipTitle;
	        this.startDate = startDate;
	        this.endDate = endDate;
	        this.companyName = companyName;
	        this.companyAddress = companyAddress;
	    }
	

	public String generateLetter() {
		String letter = "Dear " + internName + ",\n\n" + "We are pleased to offer you a position as an intern for the "
				+ internshipTitle + " at " + companyName + ".\n" + "Your start date is " + startDate
				+ " and your end date is " + endDate + ".\n"
				+ "Please find attached a more detailed offer letter that includes information on your compensation, schedule, and other important details.\n\n"
				+ "Sincerely,\n" + companyName + "\n" + companyAddress;

		return letter;
	}


	public byte[] toByteArray() throws IOException {
	

		Path path = Paths.get("C:/Users/shree/Desktop/Mohit/123.pdf");
		byte[] fileBytes = Files.readAllBytes(path);

		// TODO Auto-generated method stub
		return fileBytes;
	}
}
	



