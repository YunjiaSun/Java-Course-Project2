/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personnel;

/**
 *
 * @author kal bugrara
 */
public class Person {

    String name;
    String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = name;
    }

    public String getPersonId() {
        return id;
    }

    public String getPersonName() {
        return name;
    }

    public boolean isMatch(String id) {
        if (getPersonId().equals(id))
            return true;
        return false;
    }

}
