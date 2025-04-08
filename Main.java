public class Main {
    public static void main(String[] args) {
        System.out.println();
        Payment Siti = new Payment(3500000 , "Kartu Kredit");
        System.out.println("==== Welcome to IKLC Mart Siti!! ====");
        System.out.println("Total Harga             : Rp" + (int)Siti.totalPrice); // -> biar nampak jadi integer , casting int pada double
        Siti.bayar("Kartu Kredit");
        Siti.tampilkanPembayaran("-");
        System.out.println();

        Payment Ciciripi = new Payment(10000000, "Voucher Diskon");
        System.out.println("==== Welcome to IKLC Mart Ciciripi!! ====");
        System.out.println("Total Harga             : Rp" + (int)Ciciripi.getTotalPrice()); //sama lah
        Ciciripi.bayar("Voucher Diskon",15);
        Ciciripi.tampilkanPembayaran("15%");
        System.out.println();

        Payment Asnawi = new Payment(1200000, "Transfer Bank");
        System.out.println("==== Welcome to IKLC Mart Asnawi!! ====");
        System.out.println("Total Harga             : Rp" + (int)Asnawi.totalPrice); //sama
        Asnawi.bayar("Transfer Bank");
        Asnawi.tampilkanPembayaran("-");
        System.out.println();

        System.out.println("===== Alhamdulillah Siap =====");

    }
}