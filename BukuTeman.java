package pertemuan401;

import java.util.Scanner;

/**
 *
 * @author Andi 2201010101
 * 23/04/2024
 * 
 */
public class BukuTeman {
    private int brs = 10;
    private int klm = 3;
    private int raktif = 0;
    private String[][] BT = new String [brs][klm];
    
    Scanner dtIN = new Scanner (System.in);
    
    public void Storedata(){
        int idx=0;
        raktif++;
        if(raktif > brs){
        System.out.println("Data Sudah Penuh");
        return;
        }
        if(raktif>0){
            idx=raktif-1;
        }
        System.out.println("Menambahkan Data Teman");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nama Teman");
        BT[idx][0] = dtIN.nextLine();
        
        System.out.println("Alamat");
        BT[idx][1] = dtIN.nextLine();
        
        System.out.println("No Telpon");
        BT[idx][2] = dtIN.nextLine();
        
        
    }
    public void Update(int idx){
        if (idx >= 0 && idx < raktif) {
            System.out.println("Update Data Teman");
            System.out.println("~~~~~~~~~~~~~~~~~~");
            System.out.println("Nama Teman: " + BT[idx][0]);
            System.out.println("Alamat: " + BT[idx][1]);
            System.out.println("No Telpon: " + BT[idx][2]);

            System.out.println("Masukkan Nama Baru: ");
            BT[idx][0] = dtIN.nextLine();

            System.out.println("Masukkan Alamat Baru: ");
            BT[idx][1] = dtIN.nextLine();

            System.out.println("Masukkan No Telpon Baru: ");
            BT[idx][2] = dtIN.nextLine();
        } else {
            System.out.println("Indeks tidak valid");
        }
    }
    public void Destroy(int idx){
        if (idx >= 0 && idx < raktif) {
            System.out.println("Data Teman yang akan dihapus:");
            System.out.println("Nama Teman: " + BT[idx][0]);
            System.out.println("Alamat: " + BT[idx][1]);
            System.out.println("No Telpon: " + BT[idx][2]);

            System.out.println("Apakah Anda yakin ingin menghapus data ini? (YA/TIDAK)");
            String konfirmasi = dtIN.nextLine();

            if (konfirmasi.equalsIgnoreCase("YA")) {
                for (int i = idx; i < raktif - 1; i++) {
                    BT[i][0] = BT[i + 1][0];
                    BT[i][1] = BT[i + 1][1];
                    BT[i][2] = BT[i + 1][2];
                }
                raktif--;
                System.out.println("Data berhasil dihapus.");
            } else {
                System.out.println("Penghapusan data dibatalkan.");
            }
        } else {
            System.out.println("Indeks tidak valid");
        }
    }
    public void viewdata() {
    System.out.println("Daftar Teman");
    System.out.println("~~~~~~~~~~~~");
    for (int i = 0; i < raktif; i++) {
        int nomorRecord = i + 1;
        System.out.println("Teman " + nomorRecord);
        System.out.println("Nama : " + BT[i][0]);
        System.out.println("Alamat : " + BT[i][1]);
        System.out.println("Kontak : " + BT[i][2]);
        System.out.println();
    }
}
}

