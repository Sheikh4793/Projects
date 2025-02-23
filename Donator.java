package donation;
/*Create a class for storing the details of the Donator like donator
name,campaign,payment type,etc.
Create a another class for storing the campaign details like launch date, campaign
name, list of donator for that campaign,etc
Create a separate class for processing the data of Campaign class and Donator class..
In the main class, Create a menu type structure to add campaigns, add donations,
options to list the campaign and donators
All the input should be given during the run time..
Date should be validated, and when the user donates for a campaign, donation date
should be between the launch date and deadline..
Campaign
Owner
Campaign Name
Status - Not Started , Running Completed
Launch Date
Fundraiser Deadline
Fundraising Goal
Amount Raised
Description
Event
Campaign - Completed Campaigns - Ongoing Campaigns
Donation
Contributor Name *
Campaign *
Payment Method
Description
Email ID *
Amount * USD
Payment Date [dd-MMM-yyyy]*/

import java.util.Date;

public class Donator{
    private String contributorName;
    private String campaignName;
    private String paymentMethod;
    private String description;
    private String emailId;
    private double amount;
    private  Date  paymentDate;
    public Donator(String contributorName,String campaignName,String paymentMethod,String description,String emailId,double amount,Date  paymentDate){
        this.contributorName=contributorName;
        this.campaignName=campaignName;
        this.paymentMethod=paymentMethod;
        this.description=description;
        this.emailId=emailId;
        this.amount=amount;
        this.paymentDate=paymentDate;
    }
    public String toString(){
        return "Contributor Name:"+contributorName+",Campaign Name:"+campaignName+",Payment Method:"+paymentMethod+",Description:"+description+",Email Id:"+emailId+",Amount:"+amount+",Payment Date:"+paymentDate;

    }
    public Double getAmount(){
        return amount;
    }

}
