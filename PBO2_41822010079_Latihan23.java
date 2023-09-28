/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pbo2_41822010079_latihan23;

import java.util.Scanner;

/**
 *
 * @author ASUS
 * Nama : Adjeng Rara Rengganis 
 * NIM  : 41822010079
 * Nama : Vanisha Putri Kania
 * NIM  : 41822010082
 */
public class PBO2_41822010079_Latihan23 
{

    public static void main(String[] args) 
    {
        System.out.println("Format Tugas PBO");
   
        Scanner input = new Scanner(System.in);

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai Mahasiswa=====");
        
        System.out.print("Masukan Nama Petugas : ");
        String namaPetugas = input.nextLine();
        
        System.out.print("Masukan Banyaknya Nilai mahasiswa : ");
        int banyakMahasiswa = input.nextInt();
        
        int[] nilaiMahasiswa = new int[banyakMahasiswa];

        for (int i = 0; i < banyakMahasiswa; i++) 
        {
            System.out.print("Masukan Nilai Mahasiswa Ke-" + (i + 1) + " = ");
            nilaiMahasiswa[i] = input.nextInt();
        }

        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        for (int i = 0; i < banyakMahasiswa; i++) 
        {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " =" + nilaiMahasiswa[i]);
        }

        int nilaiTerbesar = nilaiMahasiswa[0];
        int nilaiTerkecil = nilaiMahasiswa[0];

        for (int i = 1; i < banyakMahasiswa; i++) 
        {
            if (nilaiMahasiswa[i] > nilaiTerbesar) 
            {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
            if (nilaiMahasiswa[i] < nilaiTerkecil) 
            {
                nilaiTerkecil = nilaiMahasiswa[i];
            }
        }

        System.out.println("\nNilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);

        System.out.println("\nPetugas : " + namaPetugas);
        
    }
}