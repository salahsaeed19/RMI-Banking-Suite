package banksystem;

public class BankSystem {
    
    public static LOGIN login = new LOGIN();
    
    public static Dashboard_user dashboard_user = new Dashboard_user();
    
    public static Add_New_User newuser = new Add_New_User();
    
    public static Add_New_Transction transction = new Add_New_Transction();
    
    public static Profile_User profile_user = new Profile_User();
    
    public static UpdateClientInfo update_client_info = new UpdateClientInfo();
    
    public static ClientsData clientsData = new ClientsData();
    
    public static int userid;
    
   
    public static void main(String[] args) {
        
        login.setVisible(true);
        login.setTitle("Login");
        login.setResizable(false);
        
        dashboard_user.setVisible(false);
        dashboard_user.setTitle("Dashboard User");
        dashboard_user.setResizable(false);
        
        newuser.setVisible(false);
        newuser.setTitle("Add Users");
        newuser.setResizable(false);
        
        transction.setVisible(false);
        transction.setTitle("Transction");
        transction.setResizable(false);
        
        profile_user.setVisible(false);
        profile_user.setTitle("Profile User");
        profile_user.setResizable(false);
        
        clientsData.setVisible(false);
        clientsData.setTitle("clients Data");
        clientsData.setResizable(false);
        
        update_client_info.setVisible(false);
        update_client_info.setTitle("Update Client");
        update_client_info.setResizable(false);
       
    }
}
