package bridgelabz.com;
import java.util.*;
import java.util.stream.Collectors;

public class ContactCreation {
    static Scanner scanner = new Scanner(System.in);
    Map<String, List<ContactInfo>> addressBooks = new HashMap<>();

    protected void MultipleAddressBook() {
        try {
            while (true) {
                System.out.println("What would you like to do? \n" +
                        "1. Crate new address book \n" +
                        "2. Continue with existing address book \n" +
                        "3. All books \n" +
                        "4. search contact in city \n" +
                        "5. search contact in state \n" +
                        "0. EXIT");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter name for Address book");
                        String newBookName = scanner.next();
                        List<ContactInfo> contactList = new LinkedList<>();
                        if (addressBooks.containsKey(newBookName))
                            System.out.println("Book already exists");
                        else
                            MultipleContact(contactList, addressBooks, newBookName);
                        break;
                    case 2:
                        System.out.println(addressBooks.keySet());
                        System.out.println("Which address book do you want to access?");
                        String existingBook = scanner.next();
                        if (addressBooks.containsKey(existingBook)) {
                            contactList = addressBooks.get(existingBook);
                            MultipleContact(contactList, addressBooks, existingBook);
                        } else
                            System.out.println("Book not found");
                        break;
                    case 3:
                        int serialNo = 1;
                        for (String book : addressBooks.keySet()) {
                            System.out.println(serialNo + ". " + book);
                            serialNo++;
                        }
                        System.out.println("\n" + addressBooks);
                        break;
                    case 4:
                        System.out.println("Enter Name for City");
                        String nameForCity = scanner.next();
                        searchAcrossCity(nameForCity);
                        break;
                    case 5:
                        System.out.println("Enter Name for State");
                        String nameForState = scanner.next();
                        searchAcrossState(nameForState);
                        break;
                    default:
                        System.exit(0);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        public void addContact() {
            try {
                System.out.println("Enter following details \n" +
                        "First Name :");
                String firstName = scanner.nextLine();
                System.out.println("Last Name :");
                String lastName = scanner.nextLine();
                System.out.println("Address :");
                String address = scanner.nextLine();
                System.out.println("City :");
                String city = scanner.nextLine();
                System.out.println("State :");
                String state = scanner.nextLine();
                System.out.println("Zip Code :");
                int zip = scanner.nextInt();
                System.out.println("Phone Number :");
                long phoneNo = scanner.nextLong();
                System.out.println("Email :");
                String email = scanner.next();

                ContactInfo contactInfo;
                contactInfo.setFirstName(firstName);
                contactInfo.setLastName(lastName);
                contactInfo.setAddress(address);
                contactInfo.setCity(city);
                contactInfo.setState(state);
                contactInfo.setZip(zip);
                contactInfo.setPhoneNo(phoneNo);
                contactInfo.setEmail(email);

            } catch (Exception e) {
                System.out.println(e);
            }
        }
        public void editPerson(){
            try {
                System.out.println("What do you want to edit \n" +
                        "1. First Name / 2. Last Name / 3. Address / 4. City / " +
                        "5. State / 6. Zip code / 7. Phone Number / 8. Email");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter new First Name");
                        String newFirstName = scanner.next();
                        ContactInfo contactInfo;
                        contactInfo.setFirstName(newFirstName);
                        break;
                    case 2:
                        System.out.println("Enter new Last Name");
                        String newLastName = scanner.next();
                        contactInfo.setLastName(newLastName);
                        break;
                    case 3:
                        System.out.println("Enter new Address");
                        String newAddress = scanner.next();
                        contactInfo.setAddress(newAddress);
                        break;
                    case 4:
                        System.out.println("Enter new City");
                        String newCity = scanner.next();
                        contactInfo.setCity(newCity);
                        break;
                    case 5:
                        System.out.println("Enter new State");
                        String newState = scanner.next();
                        contactInfo.setState(newState);
                        break;
                    case 6:
                        System.out.println("Enter new Zip code");
                        int newZip = scanner.nextInt();
                        contactInfo.setZip(newZip);
                        break;
                    case 7:
                        System.out.println("Enter new Phone Number");
                        long newPhoneNo = scanner.nextLong();
                        contactInfo.setPhoneNo(newPhoneNo);
                        break;
                    case 8:
                        System.out.println("Enter new Email");
                        String newEmail = scanner.next();
                        contactInfo.setEmail(newEmail);
                        break;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    }
}
