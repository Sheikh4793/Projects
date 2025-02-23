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
import java.util.Scanner;
public class FundRaisingApp {
    public static void main(String []args){
        CampaignManager campaignmanager=new CampaignManager();
        DonatorManager donator=new DonatorManager(campaignmanager);
        Scanner scanner=new Scanner(System.in);
        while(true){
        System.out.println("1.Add Campaign");
        System.out.println("2.Add Donation");
        System.out.println("3.List Campaigns");
        System.out.println("4.List Donations");
        System.out.println("5.Exit");
        int choice=scanner.nextInt();
        switch (choice) {
            case 1:
                campaignmanager.addCampaign();
                break;
            case 2:
                donator.addDonation();
                break;
            case 3:
                campaignmanager.listCampaigns();
                break;
            case 4:
                donator.listDonators();
                break;
            case 5:
                System.exit(0);
            default:
            System.out.println("Invalid choice");
                break;
        }
    }
    }
    
}
