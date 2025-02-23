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
import java.util.ArrayList;
public class Campaign {
    private String owner;
    private String campaignName;
    private String status;
    public Date launchDate;
    public Date fundraiserDeadLine;
    public Double fundraisingGoal;
    public  Double amountRaised;
    private String description;
    private  ArrayList<Donator> donators;
    public Campaign(String owner,String campaignName,String status,Date launchDate,Date fundraiserDeadLine,Double fundraisingGoal,String description){
        this.owner=owner;
        this.campaignName=campaignName;
        this.status=status;
        this.launchDate=launchDate;
        this.fundraiserDeadLine=fundraiserDeadLine;
        this.fundraisingGoal=fundraisingGoal;
        amountRaised=0.0;
        this.description=description;
        donators=new ArrayList<>();
    }
    public void addDonator(Donator donator){
        donators.add(donator);
        amountRaised+=donator.getAmount();
    }
    public String toString(){
        return "Owner:"+owner+",Campaign Name:"+campaignName+",Status:"+status+",Launch Date:"+launchDate+",Dead Line:"+fundraiserDeadLine+",Goal:"+fundraisingGoal+"Amount Raised:"+amountRaised+",Description:"+description;
    }
    public String getName(){
        return campaignName;
    }

}
