public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }

    void tax(){
        double vergi_miktari;

        if(this.salary>1000){
            vergi_miktari=this.salary*.03;
            System.out.println("Vergi miktari:\t"+vergi_miktari+"₺");
            this.salary-=vergi_miktari;

        }else {
            System.out.println("Vergi uygulanmayacak!");
        }

    }

    void bonus() {
        int fazla_mesai;
        if (this.workHours > 40) {
            fazla_mesai = this.workHours - 40;
            System.out.println("Bonus:\t"+fazla_mesai*30+"₺");
            this.salary+=fazla_mesai * 30;
        }else {
            System.out.println(this.name+" fazla mesai yapmadi bonus yok!");

        }
    }
    void raiseSalary(){
        int calisma_yili;
            calisma_yili=2021-this.hireYear;
            if (calisma_yili<10){
                System.out.println("maas artisi:\t"+this.salary*.05+"₺");
                this.salary+=this.salary*.05;
            }else if (calisma_yili>9&&calisma_yili<20){
                System.out.println("maas artisi:\t"+this.salary*.1+"₺");
                this.salary+=this.salary*.1;
            }else if (calisma_yili>19){
                System.out.println("maas artisi:\t"+this.salary*.15+"₺");
                this.salary+=this.salary*.15;
        }
    }

    void bilgiler(){
        int onceki_maas=this.salary,zam_miktari,toplam_maas,vergili_maas;
        System.out.println("*****************************************");
        System.out.println("Calisan adi :\t"+this.name);
        System.out.println("Calisan maasi :\t"+onceki_maas+"₺");
        System.out.println("Calisan haftalik calisma saati :\t"+this.workHours);
        System.out.println("Calisan ise baslama tarihi \t"+this.hireYear);
        tax();
        bonus();
        vergili_maas=this.salary;
        System.out.println("Vergiler ve bonus ile guncel maas:\t"+vergili_maas+"₺");
        this.salary=onceki_maas;
        raiseSalary();
        zam_miktari=this.salary-onceki_maas;
        toplam_maas=zam_miktari+vergili_maas;
        System.out.println("Toplam maas:\t"+toplam_maas+"₺");

    }


}
