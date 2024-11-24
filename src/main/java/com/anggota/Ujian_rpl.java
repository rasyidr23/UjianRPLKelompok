/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.anggota;
import com.anggota.controller.AnggotaController;
import com.anggota.service.AnggotaService;
import com.anggota.view.AnggotaView;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
/**
 *
 * @author rasyid
 */
@SpringBootApplication
public class Ujian_rpl {

    @Autowired
    private AnggotaService mahasiswaService;
    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        
        ApplicationContext context = SpringApplication.run(Ujian_rpl.class, args);
        
        AnggotaController controller = context.getBean(AnggotaController.class);
        
        AnggotaView mahasiswaView = new AnggotaView(controller);
        mahasiswaView.setVisible(true);
    }
}
