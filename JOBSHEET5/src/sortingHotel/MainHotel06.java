package JOBSHEET5.src.sortingHotel;

public class MainHotel06 {
    public static void main(String[] args) {
        HotelService06 list = new HotelService06();
        Hotel06 h1 = new Hotel06("Grand Mercure", "Malang", 1150000, (byte) 5);
        Hotel06 h2 = new Hotel06("Aston", "Sidoarjo", 750000, (byte) 4);
        Hotel06 h3 = new Hotel06("Sahid", "Surabaya", 250000, (byte) 2);
        Hotel06 h4 = new Hotel06("Fave Malioboro", "Jogjakarta", 450000, (byte) 3);

        list.tambahHotel(h1);
        list.tambahHotel(h2);
        list.tambahHotel(h3);
        list.tambahHotel(h4);

        System.out.println("Data Harga Hotel sebelum sorting:");
        list.tampil();

        System.out.println("Daftar Hotel Berdasarkan Bintang");
        System.out.println("Metode Bubble Sort");
        list.bubbleSortRtHotel();
        list.tampil();
        System.out.println("Metode Selection Sort");
        list.selectionSortRtHotel();
        ;
        list.tampil();

        System.out.println("Daftar Hotel Berdasarkan Harga");
        System.out.println("Metode Bubble Sort");
        list.bubbleSortHrgHotel();
        list.tampil();
        System.out.println("Metode Selection Sort");
        list.selectionSortHrgHotel();
        list.tampil();
    }
}
