package io.zipcoder.interfaces;

public final class Students extends People{
    private static final Students INSTANCE = new Students();

    private Students() {
        Student xiong = new Student(1, "Xiong");
        Student mike = new Student(2, "Mike");
        Student lena = new Student(3, "Lena");
        Student monali = new Student(4, "Monali");

        this.add(xiong);
        this.add(mike);
        this.add(lena);
        this.add(monali);
    }

    public static Students getInstance() {
        return INSTANCE;
    }
 }
