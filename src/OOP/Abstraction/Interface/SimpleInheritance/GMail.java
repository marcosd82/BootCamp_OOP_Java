package OOP.Abstraction.Interface.SimpleInheritance;

public  class GMail implements EmailserviceProvider{

/*    public void composeEmailMessage(){
        System.out.println("Gmail - New Email");
    }

    public void openSpamFolder(){

        System.out.println("Gmail - Open spam Folder");
    }

    public void closeGmail(){
        System.out.println("Gmail - Close Email Provider");

    }*/


    @Override
    public void createEmailMessage() {
        System.out.println("Gmail - New Email");
    }

    @Override
    public void openJunkSpamFolder() {
        System.out.println("Gmail - Open spam Folder");
    }

    @Override
    public void closeEmailProvider() {
        System.out.println("Gmail - Close Email Provider");
    }


}
