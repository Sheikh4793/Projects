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
import java.util.Date;
import java.text.SimpleDateFormat;

public class CampaignManager {
    Scanner scanner = new Scanner(System.in);
    public ArrayList<Campaign> campaignList = new ArrayList<>();
    Double amountRaised=0.0;
    String status;
    public void addCampaign() {
        Date currentDate=new Date();
        System.out.print("Owner:");
        String owner = scanner.nextLine();
        System.out.print("Campaign Name:");
        String campaignName = scanner.nextLine();
        System.out.print("Launch Date:");
        Date launchDate = getDate();
        System.out.print("DeadLine:");
        Date fundraiserDeadLine = getDate();
        if(currentDate.before(launchDate)){
             status="Not started";
        }
        else if(currentDate.after(fundraiserDeadLine)){
            status="Completed";
        }
        else{
            status="Running";
        }
        System.out.println("Fundraising Goal");
        Double fundraisinggoal = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Description");
        String description = scanner.nextLine();
        campaignList.add(new Campaign(owner, campaignName, status, launchDate, fundraiserDeadLine, fundraisinggoal,
                description));
        System.out.println("campaign added succesfully");
    }
    public void setStatus(String status){
        this.status=status;
    }
    public Double getGoalAmount(String name){
        for(Campaign c:campaignList){
            if(c.getName().equalsIgnoreCase(name)){
                return c.fundraisingGoal;
    }}return null;
    }
    public void listCampaigns() {
        if(campaignList.isEmpty()){
            System.out.println("No campaigns added yet!.");
        }
        for(Campaign c:campaignList){
        System.out.println(c);
        }
    }
    public void addAmount(String name,Double amount){
        for(Campaign c:campaignList){
            if(c.getName().equalsIgnoreCase(name)){
                c.amountRaised+=amount;
    }}}
    public Double amountRaised(String name){
        for(Campaign c:campaignList){
            if(c.getName().equalsIgnoreCase(name)){
                return c.amountRaised;
    }}
return null;}

    
    public boolean nameSearch(String name){
        for(Campaign c:campaignList){
                if(c.getName().equalsIgnoreCase(name)){
                    return true;
                }              
                }
                return false;
            }
    public Date launchDate(String name){
                for(Campaign c:campaignList){
                    if(c.getName().equalsIgnoreCase(name)){
                        return c.launchDate;
                    }
                }
                return null;
                
            }
    public Date deadLine(String name){
                for(Campaign c:campaignList){
                    if(c.getName().equalsIgnoreCase(name)){
                        return c.fundraiserDeadLine;
                    }
                }
                return null;
            }
   
    public String getStatus(){
        return status;
    }        
        

    private Date getDate() {
        
        while (true) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                Date updated= sdf.parse(scanner.nextLine());
                return updated;
            } catch (Exception e) {
                System.out.println("Invalid Date!.Try Again");
            }

        }
    }
   
}