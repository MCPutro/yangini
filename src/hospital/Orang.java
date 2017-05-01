/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author Konjem_Family
 */
public abstract class Orang {
    protected String id;
    protected String title;
    protected String name;
    protected int age;
    protected String gender;

    public Orang(String id, String title, String name, int age, String gender) {
        this.id = id;
        this.title = title;
        this.name = name;
        this.age = age;
        this.setGender(gender);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setNama(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public abstract String toString();
    
}
