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
import java.util.ArrayList;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
public class DonatorManager {
    Scanner scanner=new Scanner(System.in);
    ArrayList<Donator> donatorList;
    CampaignManager campaignManager;
    public DonatorManager(CampaignManager campaignManager){
        this.donatorList=new ArrayList<>();
        this.campaignManager=campaignManager;
    }
    public void addDonation(){
        if(campaignManager.campaignList.isEmpty()){
            System.out.println("No Campaigns found!.");
            return;
        }
        if(campaignManager.getStatus()=="Completed"){
            System.out.println("campaign have been ended");
            return;
        }
        System.out.println("Contributor Name");
        String contributorName=scanner.nextLine();
        System.out.println("Campaign Name");
        String campaignName=scanner.nextLine();
        if(!campaignManager.nameSearch(campaignName)){
            System.out.println("Campaign not found please enter a valid Campaign Name");
            return;
        }
        System.out.println("Payment Method");
        String paymentMethod=scanner.nextLine();
        System.out.println("Description");
        String description=scanner.nextLine();
        System.out.println("Email Id");
        String emailId=scanner.nextLine();
        System.out.println("Amount");
        double amount=scanner.nextDouble();
        if(campaignManager.amountRaised(campaignName)>campaignManager.getGoalAmount(campaignName)){
            campaignManager.setStatus("Completed");
            System.out.println("campaign has been ended.Reached the target amount");
            return;
        }
        campaignManager.addAmount(campaignName,amount);
        scanner.nextLine();
        Date paymentDate=getDate();
        if(paymentDate.before(campaignManager.launchDate(campaignName))||paymentDate.after(campaignManager.deadLine(campaignName))){
            System.out.println("Payment date should be between launchdate and deadline.Try again..");
            return;
        }
        donatorList.add(new Donator(contributorName,campaignName,paymentMethod,description,emailId,amount,paymentDate));
    System.out.println("Payment added Successfully");}
        public void listDonators(){
            if(donatorList.isEmpty()){
                System.out.println("No donators yet!.");
                return;
            }
           for(Donator d:donatorList){
             System.out.println(d);
           }  
        }
        private  Date getDate(){
          SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
            while(true){
             try{
             System.out.println("Payment Date(dd-MM-yyyy)");
             String dateInput=scanner.nextLine();
             return 
             sdf.parse(dateInput);
              }
            catch(Exception e){
              System.out.println("Invalid Date!.Try Again");
              }

              }}
               }