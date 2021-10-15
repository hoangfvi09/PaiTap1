
import model.Engineer;
import model.Officer;
import model.Staff;
import model.Worker;
import service.OfficerManager;

public class Main {
    public static void main(String[] args) {
        OfficerManager officerManager = new OfficerManager();
        Officer officer1 = new Engineer("1", 1, "1", "1", 1, "1");
        Officer officer2 = new Worker("2", 2, "2", "2", 2, 2);
        Officer officer3 = new Staff("3", 3, "3", "3", 3, "3");
        System.out.println("Initial list: ");
        officerManager.add(officer1);
        officerManager.add(officer2);
        officerManager.add(officer3);
        officerManager.print();
        System.out.println("List after editing id 2: ");
        Officer officer4 = new Engineer("123", 12, "123", "123", 12, "123");
        officerManager.editById(2, officer4);
        officerManager.print();
        System.out.println("List after removing id 1: ");
        officerManager.removeById(1);
        officerManager.print();
        System.out.println("Find officer by Id 3: "+officerManager.findById(3));

    }


}
