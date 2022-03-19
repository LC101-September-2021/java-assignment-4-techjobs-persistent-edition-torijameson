package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class Skill extends AbstractEntity {

    @Size(max=512, message="PLce description of the skill desired here")
    private String skillDescription;

    @ManyToMany
    private List<Job> jobs = new ArrayList<>();

    public Skill(){}

    public Skill(String description){
        this.skillDescription=description;
    }



}