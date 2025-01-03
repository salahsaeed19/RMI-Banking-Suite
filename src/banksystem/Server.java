package banksystem;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class Server extends UnicastRemoteObject implements BankInterfaces {

    public Server() throws RemoteException {
        super();
        initializeUsers();
    }

    // Initialize some default users
    private void initializeUsers() {
        Person admin = new Person("admin", "Khaled", true, "male", "Gaza", "123", "Employee");
        Person client = new Person("abod", "abd", false, "male", "Gaza", "123", "Client");

        Person.persons.add(admin);
        Person.persons.add(client);
    }

    // Main method to start the server
    public static void main(String[] args) {
        try {
            // Set RMI hostname property
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");

            // Create RMI registry on port 1099
            Registry registry = LocateRegistry.createRegistry(1099);

            // Create and bind the server instance
            Server server = new Server();
            registry.rebind("service", server);

            System.out.println("Server is running...");
        } catch (RemoteException e) {
            System.err.println("Server startup error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public Boolean LoginCheack(String username, String password) throws RemoteException {
        for (Person user : Person.persons) {
            if (user.first_name.equals(username) && user.password.equals(password)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean AddNewUser(String first_name, String last_name, String address, String national_id, String password, String account_type, String gender) throws RemoteException {
        Person newUser = new Person(first_name, last_name, false, gender, address, password, account_type);
        return Person.persons.add(newUser);
    }

    @Override
    public boolean[] AddNewTransaction(int id_client_bank, String type_transaction, double amount) throws RemoteException {
        boolean transactionSuccessful = false;
        boolean clientExists = false;

        for (Person user : Person.persons) {
            if (user.id == id_client_bank) {
                clientExists = true;

                if ("Deposit".equalsIgnoreCase(type_transaction)) {
                    user.amount += amount;
                    transactionSuccessful = true;
                } else if ("Withdraw".equalsIgnoreCase(type_transaction) && user.amount >= amount) {
                    user.amount -= amount;
                    transactionSuccessful = true;
                }
            }
        }

        return new boolean[]{transactionSuccessful, clientExists};
    }

    @Override
    public String[] getPerson(int id_client) throws RemoteException {
        for (Person user : Person.persons) {
            if (user.id == id_client) {
                return new String[]{
                        user.first_name,
                        user.last_name,
                        user.gender,
                        user.account_type,
                        "$" + user.amount,
                        user.address
                };
            }
        }
        return null; // Return null if the user does not exist
    }

    @Override
    public Boolean UpdateInforUser(int id_client, String first_name, String last_name, String gender, String account_type) throws RemoteException {
        for (Person user : Person.persons) {
            if (user.id == id_client) {
                user.first_name = first_name;
                user.last_name = last_name;
                user.gender = gender;
                user.account_type = account_type;
                return true;
            }
        }
        return false; // Return false if the user does not exist
    }

    @Override
    public String[] AllUsers() throws RemoteException {
        List<String> userDetails = new ArrayList<>();

        for (Person user : Person.persons) {
            userDetails.add(
                    "ID: " + user.id +
                    ", Name: " + user.first_name + " " + user.last_name +
                    ", Gender: " + user.gender +
                    ", Address: " + user.address +
                    ", Account Type: " + user.account_type +
                    ", Balance: $" + user.amount
            );
        }

        return userDetails.toArray(new String[0]); // Convert List to Array
    }

    @Override
    public Boolean ClieantExist(int id_client) throws RemoteException {
        return Person.persons.removeIf(user -> user.id == id_client);
    }

}
