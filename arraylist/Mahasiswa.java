package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {
    private String nama;
    private String nim;
    private List<Float> ips;

    public Mahasiswa(String nama, String nim, List<Float> ips) {
        this.nama = nama;
        this.nim = nim;
        this.ips = ips;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public List<Float> getIps() {
        return ips;
    }

    public float hitungIPK() {
        float totalIps = 0.0f;
        for (float ips : this.ips) {
            totalIps += ips;
        }
        return Math.round((totalIps / this.ips.size()) * 100.0f) / 100.0f;
    }
}