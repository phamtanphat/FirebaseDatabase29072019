package phamtanphat.ptp.khoaphamtraining.firebasedatabase;
import android.content.Intent;

public class Thongtin {
    private String vitri;
    private Long sodienthoai;

    public Thongtin() {
    }

    public Thongtin(String vitri, Long sodienthoai) {
        this.vitri = vitri;
        this.sodienthoai = sodienthoai;
    }

    public String getVitri() {
        return vitri;
    }

    public void setVitri(String vitri) {
        this.vitri = vitri;
    }

    public Long getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(Long sodienthoai) {
        this.sodienthoai = sodienthoai;
    }
}
