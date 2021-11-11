
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MOKLET-2
 */
public class Transaksi {
    private ArrayList<Integer> idJenisLaundry = new ArrayList<Integer>();
    private ArrayList<Integer> banyak = new ArrayList<Integer>();
    private ArrayList<Integer> idClient = new ArrayList<Integer>();

    public void prosesTransaksi(Client client, Transaksi transaksi, Laundry jenisLaundry) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Silahkan Laundry");
        System.out.print("Masukkan ID Client : ");
        int idClient = myObj.nextInt();
        System.out.println("Selamat datang " + client.getNama(idClient));

        int i = 0;
        int temp = 0;
        do {
            System.out.print("Masukkan kode jenis laundry :");
            temp = myObj.nextInt();
            if (temp != 876) {
                idJenisLaundry.add(temp);
                System.out.print(jenisLaundry.getNamaLaundry(idJenisLaundry.get(i)) + " sebanyak(kg) : ");
                banyak.add(myObj.nextInt());
                i++;
            }
        } while (temp != 876);

        System.out.println();//jarak
        System.out.println("Transaksi belanja " + client.getNama(idClient) + " sebagai berikut");
        System.out.println("Nama Barang \t \tBanyak(kg) \tHarga \tJumlah \t");

        int total = 0;
        int x = idJenisLaundry.size();
        for (int j = 0; j < x; j++) {
            int jumlah = banyak.get(j) * jenisLaundry.getHarga(idJenisLaundry.get(j));
            total += jumlah;
            System.out.println(jenisLaundry.getNamaLaundry(idJenisLaundry.get(j)) + "\t"
                    + banyak.get(j) + "\t" + "\t" 
                    + jenisLaundry.getHarga(idJenisLaundry.get(j)) + "/kg" + "\t"
                    + jumlah);
            transaksi.setTransaksi(jenisLaundry, idClient, idJenisLaundry.get(j),
                    banyak.get(j));
        }

        System.out.println("Total Laundry : " + total);
        client.editSaldo(idClient, client.getSaldo(idClient) - total);
        
        if (client.getSaldo(idClient)>0){
            System.out.println("Sisa Saldo " +  client.getNama(idClient) + " = "+  client.getSaldo(idClient));
        }
        
        else{
            System.out.println("------------------------------------");
            System.out.println("Saldo tidak mencukupi");
            System.out.println("Silahkan isi saldo terlebih dahulu");
            System.out.println("------------------------------------");
            System.exit(0);
        }
    }
    
    

    public void setTransaksi(Laundry jenisLaundry, int idClient, int idJenisLaundry, int banyak) {
        this.idClient.add(idClient);
        this.idJenisLaundry.add(idJenisLaundry);
        this.banyak.add(banyak);
        jenisLaundry.editDurasi(idJenisLaundry, jenisLaundry.getDurasi(idJenisLaundry));
    }

    public int getIdLaundry(int id) {
        return this.idJenisLaundry.get(id);
    }

    public int getBanyak(int id) {
        return this.banyak.get(id);
    }


    public int getJmlTransaksi() {
        return this.idClient.size();
    }
}

