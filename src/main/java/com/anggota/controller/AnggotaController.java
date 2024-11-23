/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anggota.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.anggota.model.ModelAnggota;
import com.anggota.service.AnggotaService;

import java.util.List;
import org.springframework.stereotype.Controller;
/**
 *
 * @author rasyid
 */
@Controller
public class AnggotaController {

    @Autowired
    private AnggotaService mahasiswaService;

    // Add new Mahasiswa
    public String addMahasiswa(@RequestBody ModelAnggota mhs) {
        mahasiswaService.addMhs(mhs);
        return "Mahasiswa added successfully";
    }

    // Get Mahasiswa by ID
    public ModelAnggota getMahasiswa(@PathVariable int id) {
        return mahasiswaService.getMhs(id);
    }

    // Update Mahasiswa
    public String updateMahasiswa(@RequestBody ModelAnggota mhs) {
        mahasiswaService.updateMhs(mhs);
        return "Mahasiswa updated successfully";
    }

    // Delete Mahasiswa by ID
    public String deleteMahasiswa(@PathVariable int id) {
        mahasiswaService.deleteMhs(id);
        return "Mahasiswa deleted successfully";
    }

    // Get all Mahasiswa
    public List<ModelAnggota> getAllMahasiswa() {
        return mahasiswaService.getAllMahasiswa();
    }
}
