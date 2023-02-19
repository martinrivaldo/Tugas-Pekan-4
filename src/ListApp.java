import java.util.*;

public class ListApp {
    public static void main(String[] args) {

        //(1) 10 nama makanan
        List <String> namaMakanan = new ArrayList<>();

        namaMakanan.add("seblak");
        namaMakanan.add("bakso");
        namaMakanan.add("mi ayam");
        namaMakanan.add("soto betawi");
        namaMakanan.add("gado-gado");
        namaMakanan.add("ketoprak");
        namaMakanan.add("batagor");
        namaMakanan.add("siomay");
        namaMakanan.add("pecel lele");
        namaMakanan.add("cilor");

        System.out.println("==== List nama makanan ====");
        System.out.println(namaMakanan);
        System.out.println("\n\n");

        //(2) Tahun Piala Dunia

        List<Integer> tahunPildun = new ArrayList<>();

        tahunPildun.add(2002);
        tahunPildun.add(2006);
        tahunPildun.add(2010);

        System.out.println("==== List tahun piala dunia ====");
        System.out.println(tahunPildun);
        System.out.println("\n\n");


        // (3) Sort list provinsi desc

        ArrayList <String> provinsi = new ArrayList<>(List.of("Aceh","Sumatera Utara","DKI Jakarta","Sumatera Barat","Jambi","Sumatera Selatan","Bengkulu","Bangka Belitung","Lampung","Banten"));

        System.out.println("\n\n==== Sebelum di sorting ====");
        System.out.println(provinsi);
        System.out.println();


        Collections.sort(provinsi, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("==== Setelah di sorting ====");
        System.out.println(provinsi);
        System.out.println("\n\n");



        //(4)
        List<String> bahasaPemrograman = new ArrayList<>(List.of("Python","C++","C","C#","Perl","Lisp","PHP","Java","Javascript","Rust","Golang","Ruby"));

        System.out.println("==== Data bahasa pemrograman ====");
        System.out.println(bahasaPemrograman);
        bahasaPemrograman.remove("Python");
        bahasaPemrograman.remove("C++");
        bahasaPemrograman.remove("PHP");
        bahasaPemrograman.remove("Javascript");
        bahasaPemrograman.remove("Perl");

        System.out.println("==== Setelah di hapus 5 data ====");
        System.out.println(bahasaPemrograman);

    }
}
