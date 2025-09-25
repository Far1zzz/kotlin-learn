fun main() {
    val totalBelanja :Int=0
    val item1 =3
    var harga1 =25000
    var harga2 =15000
    var diskon = 10000
    var item2= 2
    var totalitem1= item1*harga1

    println("setelah Item A -> Total Belanja Rp $totalitem1")
    totalitem1+=harga2
    totalitem1+=harga2
    println("setelah Item b -> Total Belanja Rp $totalitem1")
    totalitem1-=diskon
    println("setelah Diskon -> Total Belanja Rp $totalitem1")
    var pajak= totalitem1/100
    println("setelah biaya layanan(Rp. $pajak) -> Total Belanja Rp $totalitem1")
    totalitem1+=pajak

    println("=========================================")
    println("total Akhir yang harga dibayar :$totalitem1 ")
    println("=========================================")


}