/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-2
 */
public class Mainrun {
    public static void main(String[] args) {
 
        Laundry JenisLaundry = new Laundry();
        Client Client = new Client();
        Petugas petugas = new Petugas();
        Transaksi transaksiLaundry = new Transaksi();
        Catatan laporanLaundry = new Catatan();

        laporanLaundry.Catatan(Client);
        laporanLaundry.Catatan(JenisLaundry);
        System.out.println();
        transaksiLaundry.prosesTransaksi(Client, transaksiLaundry, JenisLaundry);
        System.out.println();
        laporanLaundry.Catatan(transaksiLaundry, JenisLaundry);
        
        
    }
}
