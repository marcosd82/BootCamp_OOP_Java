package OOP.Abstraction.Interface.SimpleInheritance;

public interface EmailserviceProvider {

    int max_email_per_page= 10;
    public static final int max_junk_per_page=25;

    public abstract void createEmailMessage();


    public void openJunkSpamFolder ();
    public void closeEmailProvider();


    public default void saveDraftFlolder(){
        System.out.println("Save Draft \n");
    }

    public static void sentEmailFolder(){
        System.out.println("Sent Email");
    }
}
