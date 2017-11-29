package model;

public class Person {
    private String sex;
    private String hairColor;
    private String eyesColor;
    private int age;

    public Person(String sex, String hairColor, String eyesColor, int age) {
        this.sex = sex;
        this.hairColor = hairColor;
        this.eyesColor = eyesColor;
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
