package com.example.updateparking;


public class EnterOutParking {
    private String id;
    private String name;
    private String manufacture;

    public EnterOutParking(String id, String name, String manufacture) {
        this.id = id;
        this.name = name;
        this.manufacture = manufacture;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String toString() {
        return "EnterOutParking{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", manufacture='" + manufacture + '\'' +
                '}';
    }
}