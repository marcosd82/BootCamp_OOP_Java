package OOP.Abstraction.Interface.SimpleInheritance;

public class Outlook implements EmailserviceProvider {

   /* public void newEmailMessage(){
        System.out.println("Outlook - -New Email");
    }

    public void openJunkFolder(){

        System.out.println("Outlook - Open junk Folder");
    }

    public void closeOutlook(){
        System.out.println("Outlook - Close Email Provider");

    }*/

    @Override
    public void createEmailMessage() {

        System.out.println("Outlook - -New Email");
    }

    @Override
    public void openJunkSpamFolder() {

        System.out.println("Outlook - Open junk Folder");
    }

    @Override
    public void closeEmailProvider() {

        System.out.println("Outlook - Close Email Provider");
    }


}
