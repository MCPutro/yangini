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
public class Pasien extends Orang{
    private String disease;
    private String bloodType;

    public Pasien(String id, String title, String name, int age, String gender, String disease, String bloodType) {
        super(id, title, name, age, gender);
        this.disease = disease;
        this.bloodType = bloodType;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "Orang{" + "ID=" + id + ", title=" + title + ", name=" + name + ", age=" + age + ", gender=" + gender + '}';
    }
}
