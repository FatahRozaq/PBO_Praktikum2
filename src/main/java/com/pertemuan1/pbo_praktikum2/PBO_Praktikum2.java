/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan1.pbo_praktikum2;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PBO_Praktikum2 {
    
//  Soal 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan string pertama (A): ");
        String A = scanner.nextLine();
        
        System.out.print("Masukkan string kedua (B): ");
        String B = scanner.nextLine();
        
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);
        
        String lexicoComparison = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(lexicoComparison);
        
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);
        
    }
    
//    Soal 4
//    class ConvertDataType
//    {
//        static short methodOne(long l)
//        {
//            int i = (int) l;
//            return (short)i;
//        }
//        
//        public static void main(String[] args)
//        {
//            double d = 10.25;
//            float f = (float) d;
//            byte b = (byte) methodOne((long) f);
//            System.out.println(b);
//        }
//    }

//    Soal 3
//    Class FloatingPoint{
//        public static void main(String[] args) {
//            double x = 92.98;
//            int nx = (int) Math.round(x);
//            System.out.println("Sebelum menggunakan round : " + x);
//            System.out.println("Hasil round : " + nx);
//        }
//    }

    
//    Soal 2 (Variables)
//    public class Constants {
//    public static void main(String[] args) {
//        final double CM_PER_INCH = 2.54;
//        double paperWidth = 8.5;
//        double paperHeight = 11;
//        System.out.println("Paper size in centimeters: " +
//        paperWidth * CM_PER_INCH + " by " + paperHeight *
//        CM_PER_INCH);
//    }
//    }
    
//    public class Constants2 {
//    public static final double CM_PER_INCH = 2.54;
//    public static void main(String[] args) {
//        double paperWidth = 8.5;
//        double paperHeight = 11;
//        System.out.println("Paper size in centimeters: " + paperWidth *
//        CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
//    }
//}


    
//    Soal no 1
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Masukkan angka: ");
//        
//        String input = scanner.nextLine();
//
//        try {
//            long number = Long.parseLong(input);
//            boolean fitsInByte = (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE);
//            boolean fitsInShort = (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE);
//            boolean fitsInInt = (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE);
//            boolean fitsInLong = (number >= Long.MIN_VALUE && number <= Long.MAX_VALUE);
//
//            if (fitsInByte) {
//                System.out.println(" * byte");
//            }
//
//            if (fitsInShort) {
//                System.out.println(" * short");
//            }
//
//            if (fitsInInt) {
//                System.out.println(" * int");
//            }
//            
//            if (fitsInLong) {
//                System.out.println(" * long");
//            }
//        } catch (NumberFormatException e) {
//            System.out.println(input + " tidak muat/cocok ke dalam tipe data number apapun.");
//        }
//                
//    }
}
