package br.com.hawlab.design_patterns.builder;

class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet() { return street; }
    public String getCity() { return city; }
    public String getState() { return state; }
    public String getZipCode() { return zipCode; }

    @Override
    public String toString() {
        return street + ", " + city + ", " + state + " - " + zipCode;
    }
}

class PersonalData {
    private String name;
    private String cpf;
    private String birthDate;

    public PersonalData(String name, String cpf, String birthDate) {
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
    }

    public String getName() { return name; }
    public String getCpf() { return cpf; }
    public String getBirthDate() { return birthDate; }

    @Override
    public String toString() {
        return name + " - " + cpf + " - " + birthDate;
    }
}

class HealthPlanCard {
    private String number;
    private String expirationDate;

    public HealthPlanCard(String number, String expirationDate) {
        this.number = number;
        this.expirationDate = expirationDate;
    }

    public String getNumber() { return number; }
    public String getExpirationDate() { return expirationDate; }

    @Override
    public String toString() {
        return number + " - " + expirationDate;
    }
}

class BankData {
    private String bank;
    private String branch;
    private String account;

    public BankData(String bank, String branch, String account) {
        this.bank = bank;
        this.branch = branch;
        this.account = account;
    }

    public String getBank() { return bank; }
    public String getBranch() { return branch; }
    public String getAccount() { return account; }

    @Override
    public String toString() {
        return bank + " - " + branch + " - " + account;
    }
}

class Client {
    private Address address;
    private PersonalData personalData;
    private HealthPlanCard healthPlanCard;
    private BankData bankData;

    private Client(ClientBuilder builder) {
        this.address = builder.address;
        this.personalData = builder.personalData;
        this.healthPlanCard = builder.healthPlanCard;
        this.bankData = builder.bankData;
    }

    public Address getAddress() { return address; }
    public PersonalData getPersonalData() { return personalData; }
    public HealthPlanCard getHealthPlanCard() { return healthPlanCard; }
    public BankData getBankData() { return bankData; }

    @Override
    public String toString() {
        return "Client: \n" +
                "Address: " + address + "\n" +
                "Personal Data: " + personalData + "\n" +
                "Health Plan Card: " + healthPlanCard + "\n" +
                "Bank Data: " + (bankData != null ? bankData : "Not provided");
    }

    public static class ClientBuilder {
        private Address address;
        private PersonalData personalData;
        private HealthPlanCard healthPlanCard;
        private BankData bankData;

        public ClientBuilder setAddress(Address address) {
            this.address = address;
            return this;
        }

        public ClientBuilder setPersonalData(PersonalData personalData) {
            this.personalData = personalData;
            return this;
        }

        public ClientBuilder setHealthPlanCard(HealthPlanCard healthPlanCard) {
            this.healthPlanCard = healthPlanCard;
            return this;
        }

        public ClientBuilder setBankData(BankData bankData) {
            this.bankData = bankData;
            return this;
        }

        public Client build() {
            return new Client(this);
        }
    }
}

class ClientDirector {
    private Client.ClientBuilder builder;

    public ClientDirector(Client.ClientBuilder builder) {
        this.builder = builder;
    }

    public Client buildFullClient() {
        return builder.setAddress(new Address("123 Flower St", "São Paulo", "SP", "01234-567"))
                .setPersonalData(new PersonalData("João da Silva", "123.456.789-00", "01/01/1980"))
                .setHealthPlanCard(new HealthPlanCard("987654321", "12/2025"))
                .setBankData(new BankData("Banco do Brasil", "1234", "56789-0"))
                .build();
    }

    public Client buildClientWithoutBankData() {
        return builder.setAddress(new Address("123 Flower St", "São Paulo", "SP", "01234-567"))
                .setPersonalData(new PersonalData("João da Silva", "123.456.789-00", "01/01/1980"))
                .setHealthPlanCard(new HealthPlanCard("987654321", "12/2025"))
                .setBankData(null)
                .build();
    }
}


public class Builder {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Design Patterns (Builder)");

        Client.ClientBuilder builder = new Client.ClientBuilder();
        ClientDirector director = new ClientDirector(builder);

        Client fullClient = director.buildFullClient();
        System.out.println("Full Client:\n" + fullClient);

        Client clientWithoutBankData = director.buildClientWithoutBankData();
        System.out.println("\nClient Without Bank Data:\n" + clientWithoutBankData);

        System.out.println("------------------------------------------");
    }
}
