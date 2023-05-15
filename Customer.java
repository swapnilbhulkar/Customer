package Customer;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private static final List<Java_Bean> data = new ArrayList<>();


    public void add_Customer(int id, String name, double salary) {
        data.add(new Java_Bean(id, name, salary));
    }

    public void display_Customer() {
        for (Java_Bean j : data) {
            System.out.println(j.getId() + "\t" + j.getName() + "\t" + j.getSalary());
        }
    }

    public void remove_Customer(int id) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getId() == id) {
                data.remove(i);
                break;
            }
        }
    }

    public void update_Customer_Name_By_Id(int id, String name) {
        for (Java_Bean datum : data) {
            if (datum.getId() == id) {
                datum.setName(name);
                break;
            }
        }
    }
}
