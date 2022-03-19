package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message="Location is required")
    @Size(min=2, max=56)
    public String location;

    //TODO is this correct? this is 3.1.1
    @OneToMany
    @JoinColumn (name="employer_id")
    private List<Job> jobs= new ArrayList<>();

    //adding getter and setter
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
