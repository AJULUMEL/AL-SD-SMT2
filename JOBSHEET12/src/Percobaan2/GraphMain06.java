package JOBSHEET12.src.Percobaan2;

import java.util.Scanner;

public class GraphMain06 {
    public static void main(String[] args) throws Exception {

        // Graph02 gdg = new Graph02(4);
        GraphMatriks06 gdg06 = new GraphMatriks06(4);
        gdg06.makeEdge(0, 1, 50);
        gdg06.makeEdge(1, 0, 60);
        gdg06.makeEdge(1, 2, 70);
        gdg06.makeEdge(2, 1, 80);
        gdg06.makeEdge(2, 3, 40);
        gdg06.makeEdge(3, 0, 90);
        gdg06.printGraph();
        
        gdg06.degree(0);
        gdg06.degree(1);
        gdg06.degree(2);
        gdg06.degree(3);

        System.out.println();
        System.out.println("Hasil setelah penghapusan edge");
        gdg06.removeEdge(2, 1);
        gdg06.printGraph();

    }
}
