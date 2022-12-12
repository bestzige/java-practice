package dev.bestzige.movie;

public class Movie {

    private String title;
    private double hours;
    private int grade;


    public Movie(String title, double hours, int grade) {
        if(title == null) this.title = "No Title";
        if(hours <= 0.0D) this.hours = 0.0D;
        if(grade < 1 || grade > 5) this.grade = 3;
    }

    public String getTitle() {
        return title;
    }

    public double getHours() {
        return hours;
    }

    public int getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return String.format("Movie: %s (%.2f hours, grade: %.0f)", title, hours, grade);
    }

    public boolean equals(Movie m) {
        if(m == null) return false;

        if(!this.title.equals(m.getTitle())) return false;
        if(this.hours != m.getHours()) return false;
        if(this.grade != m.getGrade()) return false;

        return true;
    }
}
