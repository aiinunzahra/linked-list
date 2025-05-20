public class DemoKelas {
    public static void main(String[] args) {
        Siswa Dewi = new Siswa("Dewi");

        Kelas k = new Kelas(Dewi);

        Siswa dewi = new Siswa("Dewi");
        k.tambahDiBelakang(dewi);
        k.tambahDiBelakang(new Siswa("Caca"));
        k.tambahDiBelakang(new Siswa ("Cila"));
        k.tambahDiBelakang(new Siswa ("Aida"));
        System.out.println("List siswa awal");
        k.tampilkanSemua();

        System.out.println(" ");

        // Test ambilDi
        System.out.println("Testing urutan:");
        Siswa siswaAt2 = k.ambilDi(2);
        if (siswaAt2 != null){
            System.out.println("Siswa at index 2: " + siswaAt2.nama);
        } else {
            System.out.println("No siswa at index 2");
        }

        System.out.println(" ");

       // Test urutan
       System.out.println("Testing urutan:");
       int indexOfCila = k.urutan("Cila");
       System.out.println("Index of Cila: " +indexOfCila);

    //    int indexOfNonExist = k.urutan("NonExist");
    //    System.out.println("Index of NonExist: " +indexOfnonExist);

    System.out.println(" ");

       //Test jumlahSiswa
       System.out.println("Testing jumlahSiswa:");
       System.out.println("jumlah siswa; " + k.jumlahSiswa());

       System.out.println(" ");

       // Test tambahDiDepan
       System.out.println("Testing tambahDiDepan:");
       k.tambahDiDepan(new Siswa("Ozan"));
       k.tampilkanSemua();

       System.out.println(" ");

       //Test tambahSetelah
       System.out.println("Testing tambahSetelah:");
       k.tambahSetelah("Dewi", new Siswa("Emil"));
       k.tampilkanSemua();

       System.out.println(" ");

       //Test hapus
       System.out.println("Testing hapus:");
       k.hapus("Caca");
       k.tampilkanSemua();

    //    k.hapus("Ozan");
    //    k.tampilkanSemua();

    //    k.hapus("NonExist"); // Should do nothing
    //    k.tampilkanSemua();
    }
    
}
