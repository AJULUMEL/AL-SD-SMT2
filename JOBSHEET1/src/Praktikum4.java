import java.util.HashMap;
import java.util.Map;

public class Praktikum4 {
    public static void main(String[] args) {
        // Initialize stock data
        int[][] stockData = {
                {1, 10, 5, 6, 11, 2, 10, 5, 7},
                {2, 4, 0, 0, 0, 0, 0, 0, 0},
                {3, 0, 15, 9, 10, 12, 0, 0, 0},
                {4, 7, 12, 5, 9, 0, 0, 0, 0}
        };

        // Initialize price data
        Map<String, Double> priceData = new HashMap<>();
        priceData.put("Aglonema", 75000.0);
        priceData.put("Keladi", 50000.0);
        priceData.put("Alocasia", 60000.0);
        priceData.put("Mawar", 10000.0);

        System.out.println("Pendapatan setiap cabang jika semua bunga habis terjual:");
        printRevenue(stockData, priceData);

        System.out.println("\nJumlah stock setiap jenis bunga pada cabang Royal Garden 4:");
        printStock(stockData, 4);
    }

    public static void printRevenue(int[][] stockData, Map<String, Double> priceData) {
        for (int i = 0; i < stockData.length; i++) {
            double revenue = 0;
            for (int j = 1; j < stockData[i].length; j++) {
                int stock = stockData[i][j];
                String flowerName = getFlowerName(j);
                revenue += stock * priceData.get(flowerName);
            }
            System.out.println("Cabang " + (i + 1) + ": " + revenue);
        }
    }

    public static void printStock(int[][] stockData, int branch) {
        System.out.println("Aglonema: " + stockData[branch - 1][1]);
        System.out.println("Keladi: " + stockData[branch - 1][2]);
        System.out.println("Alocasia: " + stockData[branch - 1][3]);
        System.out.println("Mawar: " + stockData[branch - 1][4]);
    }

    public static String getFlowerName(int column) {
        switch (column) {
            case 1:
                return "Aglonema";
            case 2:
                return "Keladi";
            case 3:
                return "Alocasia";
            case 4:
                return "Mawar";
            default:
                return "";
        }
    }
}
