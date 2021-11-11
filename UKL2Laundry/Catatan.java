/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-2
 */
public class Catatan {
    public void Catatan(Laundry Laundry){
  int x=Laundry.getJmlLaundry();

  System.out.println();
  System.out.println("Tabel Jenis Laundry");
  System.out.println();
  System.out.println("ID \tNama Jenis Laundry \tDurasi(hr) \tHarga/kg");
  for (int i = 0; i < x; i++) {
   System.out.println((i+1) +"\t"+ Laundry.getNamaLaundry(i)+"\t"+
           Laundry.getDurasi(i)+ "hr" + "\t" +"\t"+Laundry.getHarga(i) + "/kg");
  }
 }
 public void Catatan(Client client){
  int x=client.getJmlClient();

  System.out.println();
  System.out.println("Tabel Client");
  System.out.println();
  System.out.println("ID \tNama \tAlamat \t\tTelepon \tSaldo");

  for (int i = 0; i < x; i++) {
   System.out.println(i + "\t"+ client.getNama(i)+"\t"+
           client.getAlamat(i)+"\t"+client.getTelepon(i)+"\t"+
           client.getSaldo(i));
  }
 }

 public void Catatan(Transaksi transaksi, Laundry Laundry){
  int x=transaksi.getJmlTransaksi();

  System.out.println();
  System.out.println("Laporan Transaksi");
  System.out.println();
  System.out.println("ID \tNama Jenis Laundry\tJumlah(kg) \tHarga/kg \tJumlah");

  int total=0;
  for (int i = 0; i < x; i++) {
   int jumlah=transaksi.getBanyak(i)*Laundry.getHarga(transaksi.getIdLaundry(i));
   total+=jumlah;

   System.out.println((i+1) + "\t" + Laundry.getNamaLaundry(transaksi.getIdLaundry(i))+"\t"+
           transaksi.getBanyak(i)+ "kg"+ "\t" +"\t"+Laundry.getHarga(transaksi.getIdLaundry(i))+ "/kg" + "\t" + "\t"
           + jumlah);
  }
  System.out.println("Total Omset ="+total);
 }
}
