/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anggota.service;

import com.anggota.model.ModelAnggota;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anggota.repository.AnggotaRepository;
/**
 *
 * @author rasyid
 */

@Service
public class AnggotaService {
    @Autowired
    private AnggotaRepository repository;
    
    public void addMhs(ModelAnggota mhs){
        repository.save(mhs);
    }
    
    public ModelAnggota getMhs(int id){
        return repository.findById(id).orElse(null);
    }
    
    public void updateMhs(ModelAnggota mhs){
        // Cek apakah data dengan ID tertentu ada di dalam database
        if (repository.existsById(mhs.getId())) {
            repository.save(mhs); // Jika ada, simpan perubahan
        } else {
            throw new RuntimeException("Anggota dengan ID " + mhs.getId() + " tidak ditemukan.");
        }
    }
    
    public void deleteMhs(int id){
        repository.deleteById(id);
    }
    
    public List<ModelAnggota> getAllMahasiswa(){
        return repository.findAll();
    }
}
