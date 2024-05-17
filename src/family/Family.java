/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package family;

public class Family {
    public static void main(String[] args) {
        // Membuat objek untuk setiap anggota keluarga dengan nomor HP dan jenis kelamin
        Person bapakNuridin = new Parent("Nuridin", "Brebes", "09 Mei 1978", "Petani", "Merauke, Papua Selatan", "082198493910", "Laki-laki");
        Person ibuWeny = new Parent("Weny Trihandayani", "Magelang", "16 Juni 1981", "PNS", "Merauke, Papua Selatan", "085244186295", "Perempuan");
        Person urifatul = new Child("Urifatul Laily Hidayah", "Merauke", "07 Januari 2004", "Pelajar/Mahasiswa", "Magelang", "085227244317", "Perempuan");
        Person qorib = new Child("Qorib Ihsan Alfarizi", "Merauke", "02 Mei 2005", "Pelajar", "Merauke", "081391551916", "Laki-laki");

        // Mencetak informasi ke konsol
        System.out.println("Keluarga ku:");
        System.out.println("------ Bapak ------");
        System.out.println(bapakNuridin.getDetails());

        System.out.println("------ Ibu ------");
        System.out.println(ibuWeny.getDetails());

        // Mengambil informasi tentang anak-anak dari data yang sudah ada
        Person[] anak = new Person[]{urifatul, qorib};

        // Menampilkan informasi tentang anak-anak
        System.out.println("Mereka berdua memiliki 2 anak:");
        for (int i = 0; i < anak.length; i++) {
            if (anak[i] instanceof Child) {
                String jenisKelamin = (i == 0) ? "perempuan" : "laki-laki";
                int anakKe = i + 1;
                System.out.println("Anak ke-" + anakKe + " yaitu anak " + jenisKelamin);
                System.out.println(anak[i].getDetails());

                // Menambahkan jeda antara anak pertama dan kedua
                if (i == 0) {
                    System.out.println();
                }
            }
        }
    }
}