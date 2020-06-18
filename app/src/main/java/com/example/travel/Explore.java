package com.example.travel;

public class Explore {

    private String Placename;
    private String Location;
    private String State;
    private String Description;
    private int Photo;

    public Explore(String s, String puri, String odisha, int i) {
    }

    public Explore(String placename, String location, String state,String description, int photo ) {
        Placename = placename;
        Location = location;
        State = state;
        Description =description;
        Photo = photo;
    }



    //Getter
    public String getPlacename() {
        return Placename;
    }

    public String getLocation() {
        return Location;
    }

    public String getState() {
        return State;
    }

    public String getDescription() {
        return Description;
    }

    public int getPhoto() {
        return Photo;
    }




    //Setter
    public void setPlacename(String placename) {
        Placename = placename;
    }

    public void setPhoto(int photo) {
        Photo = photo;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setState(String state) {
        State = state;
    }
}
