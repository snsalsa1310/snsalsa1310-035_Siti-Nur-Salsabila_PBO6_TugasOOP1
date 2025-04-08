public class Payment {
    //ini atribut si payment class ktanya
    double totalPrice;
    String paymentMethod;
    String paymentStatus;

    //ini katanya untuk constructor, tapi  dua ini aja
    Payment(double totalPrice,String paymentMethod){
        this.totalPrice = totalPrice;
        this.paymentMethod = paymentMethod;
    }

    // ini eceknya method untuk bayar no disc
    public void bayar(String paymentMethod){
        this.paymentMethod = paymentMethod;
        this.paymentStatus = "Pembayaran anda menggunakan metode " + paymentMethod + " telah berhasil diproses!";
    }

    //ini eceknya yang pake diskon
    public void bayar(String paymentMethod, double discountVoucher){
        this.paymentMethod = paymentMethod;
        totalPrice = totalPrice- (totalPrice * (discountVoucher/100));
        this.paymentStatus = "Pembayaran anda menggunakan metode " + paymentMethod + " telah berhasil dilakukan dengan diskon sebesar " + (int)discountVoucher + "%!";
    }

    //ini method untuk nampilin detail pembayaran
    public void tampilkanPembayaran(String discountVoucher){
        System.out.println("Diskon                  : " + discountVoucher );
        System.out.println("Total yang Dibayarkan   : Rp" + (int)totalPrice);
        System.out.println("Metode Pembayaran       : " + paymentMethod);
        System.out.println("Status Pembayaran       : " + paymentStatus);
    }

    //ini intinya untuk dapatin total harga incase ada diskon


    public double getTotalPrice() {
        return totalPrice;
    }
}