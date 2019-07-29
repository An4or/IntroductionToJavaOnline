package by.yakovtsev.introduction.programming_with_classes_4.classes_and_objects.task8;

public class Costomer {
    private static int id = 0;
    private String surname;
    private String name;
    private String patronymic;
    private String address;
    private long cardNumber;
    private long accountNumber;

    public Costomer(String surname, String name, String patronymic, String address) {
        id++;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.address = address;
        cardNumber = id * 100;
        accountNumber = id;
    }



    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Costomer{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber=" + cardNumber +
                ", accountNumber=" + accountNumber +
                '}';
    }
}
