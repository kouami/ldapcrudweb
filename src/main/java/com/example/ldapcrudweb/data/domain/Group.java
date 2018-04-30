package com.example.ldapcrudweb.data.domain;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.naming.Name;
import java.util.HashSet;
import java.util.Set;

@ToString
@EqualsAndHashCode
public class Group {

    private String name;
    private Set<Name> members;

    public Group() {
    }

    public Group(String name, Set<Name> members) {
        this.name = name;
        this.members = members;
    }

    public Group(Name dn, String name, Set<Name> members) {
        this.name = name;
        this.members = members;
    }

    public Set<Name> getMembers() {
        return members;
    }

    public void setMembers(Set<Name> members) {
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMember(Name member) {
        if (this.members == null){
            this.members = new HashSet<>();
        }
        members.add(member);
    }

    public void removeMember(Name member) {
        members.remove(member);
    }
}
