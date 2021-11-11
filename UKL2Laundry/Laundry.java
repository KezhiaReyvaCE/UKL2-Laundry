
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-2
 */
public class Laundry {
 private ArrayList<String> namaLaundry = new ArrayList<String>();
 private ArrayList<Integer> durasi = new ArrayList<Integer>();
 private ArrayList<Integer> harga = new ArrayList<Integer>();
 
 public Laundry() {
 this.namaLaundry.add("Super cepat");
 this.durasi.add(1);
 this.harga.add(10000);
 this.namaLaundry.add("Biasa");
 this.durasi.add(2);
 this.harga.add(5000);
 }
 public int getJmlLaundry(){
 return this.namaLaundry.size();
 }
 public void setNamaLaundry(String namaLaundry ){
 this.namaLaundry.add(namaLaundry);
 }
 public String getNamaLaundry(int idLaundry){
 return this.namaLaundry.get(idLaundry);
 } 
 
 public void setDurasi(int durasi ){
 this.durasi.add(durasi);
 }
 public int getDurasi(int idLaundry){
 return this.durasi.get(idLaundry);
 } 
 public void editDurasi(int idLaundry, int durasi){
 this.durasi.set(idLaundry, durasi);;
 } 
 public void setHarga(int harga ){
 this.harga.add(harga);
 }
 public int getHarga(int idLaundry){
 return this.harga.get(idLaundry);
 } 
}
