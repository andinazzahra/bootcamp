import model.Makeup;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<Makeup> makeupList = new ArrayList<>();

        makeupList.add(new Makeup(1, "Cushion", "Skintific", "Complexion", 175000));
        makeupList.add(new Makeup(2, "Lip Cream", "Wardah", "Lips", 65000));
        makeupList.add(new Makeup(3, "Blush On", "Mother of Pearl", "Face", 100000));
        makeupList.add(new Makeup(4, "Mascara", "Maybelline", "Eyes", 90000));
        makeupList.add(new Makeup(5, "Loose Powder", "Make Over", "Powder", 150000));


        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n==============================");
            System.out.println("< KATALOG MAKEUP >");
            System.out.println("==============================");
            System.out.println("1. Lihat semua produk");
            System.out.println("2. Tambah produk");
            System.out.println("3. Update produk");
            System.out.println("4. Hapus produk");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int menu = input.nextInt();
            input.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("\n--- Daftar Produk Makeup ---");
                    for (int i = 0; i < makeupList.size(); i++) {
                        Makeup m = makeupList.get(i);
                        System.out.println((i + 1) + ". " + m.name + " | " + m.brand + " | " + m.type + " | Rp" + m.price);
                    }
                    break;

                case 2:
                    System.out.print("Nama Produk: ");
                    String name = input.nextLine();
                    System.out.print("Brand: ");
                    String brand = input.nextLine();
                    System.out.print("Jenis: ");
                    String type = input.nextLine();
                    System.out.print("Harga: ");
                    double price = input.nextDouble();

                    int id = makeupList.size() + 1;
                    makeupList.add(new Makeup(id, name, brand, type, price));

                    System.out.println("! Produk berhasil ditambahkan !");
                    break;

                case 3:
                    System.out.print("Masukkan nomor produk yang mau diupdate: ");
                    int idxUpdate = input.nextInt() - 1;
                    input.nextLine();
                    if (idxUpdate >= 0 && idxUpdate < makeupList.size()) {
                        System.out.print("Nama Produk baru: ");
                        makeupList.get(idxUpdate).name = input.nextLine();
                        System.out.print("Brand baru: ");
                        makeupList.get(idxUpdate).brand = input.nextLine();
                        System.out.print("Jenis baru: ");
                        makeupList.get(idxUpdate).type = input.nextLine();
                        System.out.print("Harga baru: ");
                        makeupList.get(idxUpdate).price = input.nextDouble();
                        System.out.println("! Produk berhasil diupdate !");
                    } else {
                        System.out.println("X Produk tidak ditemukan X");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nomor produk yang mau dihapus: ");
                    int idxDelete = input.nextInt() - 1;
                    input.nextLine();
                    if (idxDelete >= 0 && idxDelete < makeupList.size()) {
                        makeupList.remove(idxDelete);
                        System.out.println("! Produk berhasil dihapus !");
                    } else {
                        System.out.println("X Produk tidak ditemukan X");
                    }
                    break;

                case 5:
                    isRunning = false;
                    System.out.println("Hi gurl, terimakasih sudah menggunakan katalog makeup!");
                    break;

                default:
                    System.out.println("X Menu tidak valid X");
            }
        }

        input.close();
    }
}
