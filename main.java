import java.util.Collections;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        listBarang<atk> atkBarang = new listBarang<atk>();
        listBarang<bag> bagBarang = new listBarang<bag>();
        atkBarang.add(new atk("A001", "Pulpen", "Pilot", 10));
        atkBarang.add(new atk("A002", "Pencil", "Staetdler", 4));
        atkBarang.add(new atk("A003", "penghapus", "Kenko", 3));
        atkBarang.add(new atk("B001", "Buku", "Kiky", 6));
        atkBarang.add(new atk("B002", "Lakban", "3M", 7));

        bagBarang.add(new bag("C001", "Sling Bag", "Eiger", 1));
        bagBarang.add(new bag("C002", "Tas", "Osprey", 4));
        bagBarang.add(new bag("C003", "Kaos Kaki", "Skechers", 3));
        bagBarang.add(new bag("C004", "Tumbler", "LocknLock", 3));
        bagBarang.add(new bag("C005", "Kaos", "Nike", 9));

        atkBarang.sorting();
        for ( int i = 0; i < atkBarang.size();i++){
            System.out.println("Barang " +( i + 1 )+ " : ");
            System.out.println(" kode barang = "+atkBarang.getIndex(i).getKodeBarang());
            System.out.println(" jenis barang = "+atkBarang.getIndex(i).getJenisBarang());
            System.out.println(" Nama barang = "+atkBarang.getIndex(i).getNamaBarang());
            System.out.println(" Stok barang = "+atkBarang.getIndex(i).getStokBarang());
        }
        for ( int i = 0; i < bagBarang.size();i++){
            System.out.println("Barang " +( i + 1 )+ " : ");
            System.out.println(" kode barang = "+bagBarang.getIndex(i).getKodeBarang());
            System.out.println(" jenis barang = "+bagBarang.getIndex(i).getJenisBarang());
            System.out.println(" Nama barang = "+bagBarang.getIndex(i).getNamaBarang());
            System.out.println(" Stok barang = "+bagBarang.getIndex(i).getStokBarang());
        }
        // Collections.sort();
        }
    }
