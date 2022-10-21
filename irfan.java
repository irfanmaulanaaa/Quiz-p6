import java.text.DecimalFormat;


public class dkaryawan {
    String idk,nama,usia,jabatan;
    double gaji_pokok;

    double getGajiPokok (){
        if (null == jabatan) {
            gaji_pokok = 4000000;
        }else switch (jabatan) {
            case "hrd":
                gaji_pokok = 6000000;
                break;
            case "pemeliharaan":
                gaji_pokok = 4300000;
                break;
             case "staff":
                gaji_pokok = 4200000;
                break;
              case "cybersecurity":
                gaji_pokok = 10000000;
                break;
            default:
                gaji_pokok = 4000000;
                break;
        }
        return gaji_pokok;
    }


    void cetak () {
        DecimalFormat df = new DecimalFormat ("##0,000");

         System.out.println("------ Detil  Karyawan ------");
        System.out.println("ID Karyawan : "+ this.idk);
        System.out.println("Nama        : "+ this.nama);
        System.out.println("Jabatan     : "+ this.jabatan);
        System.out.println("Gaji Pokok  : Rp."+ df.format(getGajiPokok()));
        System.out.println("Uang Makan  : Rp.100,000 ");

    }

    }
    