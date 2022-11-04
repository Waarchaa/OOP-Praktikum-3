public class PegawaiBeraksi {
    public static void main(String[] args) {
      // Membuat Object
      Manager naswa = new Manager();
      Programmer tama = new Programmer();
  
      /* Memberi attribute dan memberi nilai */
      naswa.setNama("Naswa");
      naswa.setGajiPokok(9980000);
      naswa.setTunjangan(5500000);
  
      tama.setNama("Tama");
      tama.setGajiPokok(5450000);
      tama.setBonus(3200000);
  
      /* Mengakses Method */
      naswa.cetakInfo();
      System.out.println();
      tama.cetakInfo();
    }
  }