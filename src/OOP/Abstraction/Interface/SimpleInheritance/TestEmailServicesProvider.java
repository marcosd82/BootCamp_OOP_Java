package OOP.Abstraction.Interface.SimpleInheritance;

public class TestEmailServicesProvider {

    public static void main (String [] args){

        EmailserviceProvider outlook = new Outlook();
        outlook.openJunkSpamFolder();
        outlook.createEmailMessage();
        outlook.closeEmailProvider();
        outlook.saveDraftFlolder();
        //outlook.sentEmailFolder()

        EmailserviceProvider gmail = new GMail();
        gmail.openJunkSpamFolder();
        gmail.createEmailMessage();
        gmail.closeEmailProvider();
        gmail.saveDraftFlolder();

    }


}
