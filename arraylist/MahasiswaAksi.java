package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MahasiswaAksi {

    public static void main(String[] args) {

        // Membuat objek ArrayList untuk menyimpan data mahasiswa
        List<Mahasiswa> mahasiswaList = new ArrayList<Mahasiswa>();

        Scanner scanner = new Scanner(System.in);
        String input = "";

        // Loop utama untuk meminta input dari pengguna
        while (!input.equals("exit")) {
            System.out.print("\nMasukkan perintah (tambah/lihat/exit): ");
            input = scanner.nextLine();

            // Memproses input pengguna
            if (input.equals("tambah")) {
                System.out.print("\nMasukkan nama mahasiswa: ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan nim mahasiswa: ");
                String nim = scanner.nextLine();

                System.out.print("Masukkan jumlah IPS yang ingin dimasukkan: ");
                int jumlahIps = scanner.nextInt();
                scanner.nextLine();

                // Mengambil nilai IPS dari pengguna
                List<Float> ips = new ArrayList<Float>();
                for (int i = 0; i < jumlahIps; i++) {
                    System.out.print("Masukkan IPS ke-" + (i + 1) + ": ");
                    float ip = scanner.nextFloat();
                    ips.add(ip);
                    scanner.nextLine();
                }

                // Menambahkan mahasiswa ke ArrayList
                Mahasiswa mahasiswa = new Mahasiswa(nama, nim, ips);
                mahasiswaList.add(mahasiswa);
            }
            else if (input.equals("lihat")) {
                // Menampilkan data mahasiswa yang sudah disimpan
                System.out.print(System.lineSeparator());

                // Membuat iterator untuk ArrayList
                Iterator<Mahasiswa> iterator = mahasiswaList.iterator();
                int no1 = 0;
                while (iterator.hasNext()) {
                    no1++;
                    Mahasiswa mahasiswa = iterator.next();
                    System.out.print(no1 +". "+"Nama: " + mahasiswa.getNama() + ", NIM: " + mahasiswa.getNim() + ", IPS: ");

                    int no2 = 0;
                    for (float ips : mahasiswa.getIps()) {
                        no2++;
                        System.out.print(no2 + ". " + ips + "  ");
                    }

                    System.out.println(", IPK:" + mahasiswa.hitungIPK());
                }
            }
            else if (!input.equals("exit")) {
                System.out.println("Perintah tidak dikenali.");
            }
        }
        scanner.close();
    }
}