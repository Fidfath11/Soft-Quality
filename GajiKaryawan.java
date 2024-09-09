public class GajiKaryawan {

    // Method untuk menghitung gaji    
    public static double hitungGaji(double rate, int totalJamKerja) {
        int jamNormal = 40;        
        double gajiNormal, gajiLembur = 0;

        // Jika bekerja lebih dari 40 jam, hitung lembur
        if (totalJamKerja > jamNormal) {            
            int jamLembur = totalJamKerja - jamNormal;
            gajiLembur = (rate * 1.5) * jamLembur;        
        }

        gajiNormal = rate * jamNormal;
        return gajiNormal + gajiLembur;    
    }

    // Method untuk menghitung tabungan
    public static String hitungTabungan(double totalGaji, double pengeluaran) {        
        double tabungan = totalGaji - pengeluaran;

        if (tabungan > 0) {
            return "Bisa menabung. Jumlah tabungan: Rp. " + tabungan;        
        } else if (tabungan == 0) {
            return "Tidak bisa menabung.";        
        } else {
            return "Cari tambahan.";        
        }
    }

    public static void main(String[] args) {
        // Nilai-nilai variatif (bisa diganti sesuai kebutuhan)        
        double rate = 15000;
        int totalJamKerja = 52;        
        double pengeluaran = 600000;
        // Menghitung gaji
        double totalGaji = hitungGaji(rate, totalJamKerja);
        // Menghitung tabungan        
        String hasilTabungan = hitungTabungan(totalGaji, pengeluaran);
        // Output
        System.out.println("Total Gaji Mr. John: Rp. " + totalGaji);        
        System.out.println(hasilTabungan);
    }}
