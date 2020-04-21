import java.util.*;

public class TUGAS_MODUL4_KEL1{
    public static void main(String[] args){
        String nama; //untuk nama mahasiswa
        double rata; //untuk nilai rata-rata
        String jurusan; //untuk jurusan

        int[] nilai = new int[100]; //untuk nilai yang diinputkan
        Scanner input = new Scanner(System.in) ;//membuat form input
        System.out.println("SELAMAT DATANG DI SSO UNDIP");
        System.out.println("=========================");
        System.out.println("gimana nilai UAS nya pada bagus bagus kan?");
        System.out.println("yuk isi data diri dibawah untuk tau nilai rata rata kamu!");
        /* Mengambil data mahasiswa dan jumlah mata kuliahnya */
        System.out.print("Nama anda: ");
        nama = input.nextLine();
        System.out.print("jurusan anda: ");
        jurusan = input.nextLine();

        System.out.print("Jumlah mata kuliah: ");
        double jml = input.nextInt();

        /* Mulai berhitung~ */
        int sum = 0; //deklarasi int dengan nama sum, digunakan untuk menjumlahkan nilai-nilai yg diinputkan
        for (int i=1; i<= jml ;i++ ) {
            try{
                System.out.print("Nilai MK"+i+": "); //print form input nilai sebanyak mata kuliah
                nilai[i] = input.nextInt(); //form nilai. Bertipe array supaya bisa dihitung
                sum += nilai[i]; //menjumlahkan nilai-nilai mata kuliah
            } catch (Exception e){
                break;
            }
        }

        rata = sum/jml; //menghitung rata-rata: jumlah nilai dibagi total mata kuliah
        int jmls = (int)(jml); //mengkonvert jml (double) ke int

        /* Tampilkan hasil */
        System.out.println("\n"+nama+", Total nilai "+jmls+" mata kuliahmu= "+sum); //tampilkan output
        System.out.println("dengan rata-rata= "+rata); //tampilkan output lagi
    }
}
