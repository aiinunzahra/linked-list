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
        System.out.println("mengambil salah satu nama siswa");
        Siswa siswaAmbilDi = k.ambilDi(2);
        if (siswaAmbilDi != null){
            System.out.println("Siswa yang diambil: " + siswaAmbilDi.nama);
        } else {
            System.out.println("No Siswa yang diambil:");
        }

        System.out.println(" ");

       // Test urutan
       System.out.println("Urutan siswa:");
       int urutanSiswa = k.urutan("Cila");
       System.out.println("Urutan siswa Cila: " +urutanSiswa);

    //    int indexOfNonExist = k.urutan("NonExist");
    //    System.out.println("Index of NonExist: " +indexOfnonExist);

    System.out.println(" ");

       //Test jumlahSiswa
       System.out.println("jumlah siswa: " + k.jumlahSiswa());

       System.out.println(" ");

       // Test tambahDiDepan
       System.out.println("menambah siswa baru di depan:");
       k.tambahDiDepan(new Siswa("Ozan"));
       k.tampilkanSemua();

       System.out.println(" ");

       //Test tambahSetelah
       System.out.println("menambah siswa baru di antara siswa:");
       k.tambahSetelah("Dewi", new Siswa("Emil"));
       k.tampilkanSemua();

       System.out.println(" ");

       //Test hapus
       System.out.println("menghapus siswa Caca:");
       k.hapus("Caca");
       k.tampilkanSemua();

    //    k.hapus("Ozan");
    //    k.tampilkanSemua();

    //    k.hapus("NonExist"); // Should do nothing
    //    k.tampilkanSemua();
    }
    
}
