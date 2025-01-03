package banksystem;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface BankInterfaces extends Remote {

    public Boolean LoginCheack(String username, String password) throws RemoteException;

    public String[] getPerson(int id_client) throws RemoteException;

    public Boolean AddNewUser(String first_name, String last_name, String address, String national_id, String password, String account_type, String gender) throws RemoteException;

    public boolean[] AddNewTransaction(int id_client_bank, String type_transaction, double amount) throws RemoteException;

    public Boolean UpdateInforUser(int id_client, String first_name, String last_name, String gender, String account_type) throws RemoteException;

    public String[] AllUsers() throws RemoteException;

    public Boolean ClieantExist(int id_client) throws RemoteException;
}
