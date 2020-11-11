/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10116378.latihan31.perkenalanmahasiswa;

/**
 *
 * @author Sri Utami Ningsih
 * Nama  : Sri Utami Ningsih
 * Kelas : PBO-IF2
 * Nim   : 10116378
 */
public class PerkenalanMahasiswa {
    public static void main(String[] args) {
        mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNim("10110269");
        mhs1.setNama("Rizki Adam Kurniawan");
        mhs1.perkenalkanDiri();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNim("10110270");
        mhs2.setNama("Indra Tiola");
        mhs2.perkenalkanDiri();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.setNim("10110271");
        mhs3.setNama("Robi Tanzil Ganefi");
        mhs3.perkenalkanDiri();

        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.setNim("10110272");
        mhs4.setNama("Muhammad Nur Awaluddin");
        mhs4.perkenalkanDiri();

    }

    private static class Mahasiswa extends mahasiswa {

        public Mahasiswa() {
        }
    }
}
