package service;

public interface Manageable <T>{
    void add(T t);
    void print();
    T findById(int id);
    void editById(int id,T t);
    void removeById(int id);
}
