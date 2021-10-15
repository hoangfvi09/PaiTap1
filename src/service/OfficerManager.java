package service;

import model.Officer;

import java.util.ArrayList;

public class OfficerManager implements Manageable<Officer> {
    private ArrayList<Officer> officers = new ArrayList<>(10);



    public OfficerManager() {
    }

    @Override
    public void add(Officer officer) {
        officers.add(officer);
    }

    @Override
    public void print() {
        for (Officer officer : officers) {
            System.out.println(officer);
        }
    }

    @Override
    public Officer findById(int id) {
        for (int i = 0; i < officers.size(); i++) {
            if (officers.get(i).getId() == id) {
                return officers.get(i);
            }
        }
        return null;
    }

    public int findIndexById(int id) {
        for (int i = 0; i < officers.size(); i++) {
            if (officers.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void editById(int id, Officer officer) {
        int index = findIndexById(id);
        officers.set(index, officer);

    }

    @Override
    public void removeById(int id) {
        int index = findIndexById(id);
        officers.remove(index);
    }
}
