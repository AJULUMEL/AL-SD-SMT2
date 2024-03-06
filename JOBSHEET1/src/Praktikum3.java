import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Praktikum3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> gradeToScore = new HashMap<>();
        gradeToScore.put("A", 4.0);
        gradeToScore.put("B+", 3.5);
        gradeToScore.put("B", 3.0);
        gradeToScore.put("C+", 2.5);
        gradeToScore.put("C", 2.0);
        gradeToScore.put("D", 1.0);
        gradeToScore.put("E", 0.0);

        double totalSKS = 0;
        double totalIP = 0;

        String[] subjects = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        double[] scores = new double[subjects.length];

        for (int i = 0; i < subjects.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + subjects[i] + ": ");
            scores[i] = scanner.nextDouble();
        }

        for (int i = 0; i < scores.length; i++) {
            double score = scores[i];
            String grade;

            if (score >= 80 && score <= 100) {
                grade = "A";
            } else if (score >= 73 && score < 80) {
                grade = "B+";
            } else if (score >= 65 && score < 73) {
                grade = "B";
            } else if (score >= 60 && score < 65) {
                grade = "C+";
            } else if (score >= 50 && score < 60) {
                grade = "C";
            } else if (score >= 39 && score < 50) {
                grade = "D";
            } else {
                grade = "E";
            }

            double equivalentScore = gradeToScore.get(grade);
            double sks = 3.0; // Set jumlah SKS masing-masing mata kuliah (dalam hal ini 3 SKS per mata kuliah)

            totalSKS += sks;
            totalIP += equivalentScore * sks;
        }

        double ipSemester = totalIP / totalSKS;

        System.out.println("IP Semester: " + ipSemester);
    }
}
