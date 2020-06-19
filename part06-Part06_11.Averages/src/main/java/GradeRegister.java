
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }
    
    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades() {
        double sum = 0;
        for (int i = 0; i < this.grades.size();i++) {
            sum = sum + this.grades.get(i);
        }
        
        double numOfGrades = numberOfGrades(0) + numberOfGrades(1) + numberOfGrades(2) + numberOfGrades(3) + numberOfGrades(4) + numberOfGrades(5);
       
        if (sum == 0) {
            return -1;
        }
        return sum/numOfGrades;
    } 
    
    public double averageOfPoints() {
        double sum = 0;
        for (int i = 0; i < this.points.size(); i++) {
            sum = sum + this.points.get(i);
        }
        double numOfGrades = numberOfGrades(0) + numberOfGrades(1) + numberOfGrades(2) + numberOfGrades(3) + numberOfGrades(4) + numberOfGrades(5);
        
        if (sum == 0) {
            return -1;
        }
        
        return sum/numOfGrades;
    }
    
}
