package expeditors.backend.customer.domain;

import java.time.LocalDate;


public class Customer implements Comparable<Customer>{


    public enum Status {
        PRIVILEGED,
        NORMAL,
        RESTRICTED
    }
        private int id;
    private String name;
    private LocalDate dob;
    private Status status;

    public Customer(int id, String name, LocalDate dob, Status status) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.status = status;
    }

    public Customer(String name, LocalDate dob, Status status) {
        this(0, name, dob, status);
    }

    public Customer(String name, LocalDate dob) {
        this(0, name, dob, Status.NORMAL);
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", status=" + status +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return Integer.compare(id, o.getId());
    }
}
