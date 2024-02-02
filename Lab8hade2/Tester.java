package Lab8hade2;
import java.util.Scanner;
import java.util.ArrayList;
public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList <PhoneNumber> phoneNumbers = new ArrayList<PhoneNumber>();
        System.out.println("This program run util you key Q");
        String Type = "";
        String name = "";
        do{
            System.out.print("Insert what do you want : ");
            Type = kb.next();
            if(Type.equalsIgnoreCase("add")){
                phoneNumbers.add(new PhoneNumber(kb.next(),kb.next()));
                System.out.println(phoneNumbers.toString());
            }else if(Type.equalsIgnoreCase("search")){
                name =kb.next();
                int findSuccess = -1;
                for(int i = 0; i < phoneNumbers.size(); i++){
                    if (name.equalsIgnoreCase(phoneNumbers.get(i).getName())) {
                        findSuccess = i;
                    }
                }
                if(findSuccess != -1){
                    System.out.println("[Name='"+ phoneNumbers.get(findSuccess).getName() +"', Phone='" + phoneNumbers.get(findSuccess).getTel());
                }else{
                    System.out.println("Not found");
                }
            }else if(Type.equalsIgnoreCase("delete")) {
                name = kb.next();
                int findToDelete = -1;
                for (int i = 0; i < phoneNumbers.size(); i++) {
                    if (name.equalsIgnoreCase(phoneNumbers.get(i).getName())) {
                        findToDelete = i;
                    }
                }
                if (findToDelete != -1) {
                    System.out.print("Do you confirm to delete (Y/N)");
                    String YorN = kb.next();
                    if (YorN.equalsIgnoreCase("Y")) {
                        phoneNumbers.remove(findToDelete);
                        System.out.println(phoneNumbers.toString());
                    } else {
                        System.out.println("Delete cancel");
                        System.out.println(phoneNumbers.toString());
                    }
                } else {
                    System.out.println(name + " not found in our phonebook");
                    System.out.println(phoneNumbers);
                }
            }
        }while (!Type.equalsIgnoreCase("Q"));
    }
}
