package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;

public class Person {

    private List<String> friends;
    private Map<String,Integer> feesturcture;

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", feesturcture=" + feesturcture +
                '}';
    }

    public Map<String, Integer> getFeesturcture() {
        return feesturcture;
    }

    public void setFeesturcture(Map<String, Integer> feesturcture) {
        this.feesturcture = feesturcture;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }
}
