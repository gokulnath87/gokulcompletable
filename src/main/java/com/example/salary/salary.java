package com.example.salary;

public class salary {
    private int salaryId;
    private int amount;

    public salary(int salaryId, int amount) {
        this.salaryId = salaryId;
        this.amount = amount;
    }

    public salary() {

    }

    @Override
    public String toString() {
        return "salary{" +
                "salaryId=" + salaryId +
                ", amount=" + amount +
                '}';
    }

    public int getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(int salaryId) {
        this.salaryId = salaryId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
