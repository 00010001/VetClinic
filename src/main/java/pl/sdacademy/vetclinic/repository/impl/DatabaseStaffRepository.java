package pl.sdacademy.vetclinic.repository.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import pl.sdacademy.vetclinic.model.Staff;
import pl.sdacademy.vetclinic.qualifier.DatabaseStorage;
import pl.sdacademy.vetclinic.repository.StaffRepository;

import java.util.List;
@DatabaseStorage
@Repository
public class DatabaseStaffRepository implements StaffRepository {
    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;
    @Value("${db.address}")
    private String databaseAddress;
    @Value("${db.name}")
    private String databaseName;


    @Override
    public void add(Staff staff) {

    }

    @Override
    public Staff getById(Integer staffId) {
        return null;
    }

    @Override
    public List<Staff> getAll() {
        return null;
    }

    @Override
    public Long count() {
        return null;
    }

    @Override
    public String toString() {
        return "DatabaseStaffRepository{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", databaseAddress='" + databaseAddress + '\'' +
                ", databaseName='" + databaseName + '\'' +
                '}';
    }
}
