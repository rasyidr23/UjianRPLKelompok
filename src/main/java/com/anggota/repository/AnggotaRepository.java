/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.anggota.repository;

import com.anggota.model.ModelAnggota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author rasyid
 */
@Repository
public interface AnggotaRepository extends JpaRepository<ModelAnggota, Integer> {
    
}