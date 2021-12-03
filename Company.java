package ru.avalon.javapp.devj110.booksdemo;

public class Company {
    private String companyName;
    private String companyCity;

    public Company(String companyName, String companyCity){
        setCompanyName(companyName);
        setCompanyCity(companyCity);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if(companyName == null)
            throw new IllegalArgumentException("The company must have a name!");
        this.companyName = companyName;
    }

    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        if(companyName == null)
            throw new IllegalArgumentException("The company must have a home city!");
        this.companyCity = companyCity;
    }
}
