package com.example.ldapcrudweb.data.repository;

import com.example.ldapcrudweb.data.domain.Group;
import com.example.ldapcrudweb.data.domain.Person;

import java.util.List;

public interface IGroupRepository {

    public List<Group> findAll();

    public void addMemberToGroup(String groupName, Person p);

    public void removeMemberFromGroup(String groupName, Person p);

}
