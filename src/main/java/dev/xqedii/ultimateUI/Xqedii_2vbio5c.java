package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2vbio5c {
   private static final ConcurrentHashMap<String, String> Xqedii_3f4k0d8rw6nt = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1is5ieo1d9wax = 959011469;
   private static volatile int Xqedii_1zgvxjkju2ksg = 706794969;
   private static volatile int Xqedii_rt4jk7t6zj3x = 1077579829;
   private static volatile int Xqedii_27dx7rlpqivk4 = 1377499436;
   private static volatile long Xqedii_2plb8hc0wya09 = 7865897360647281166L;
   private static volatile long Xqedii_1nrcx22h02b24 = 9150113053315894537L;
   private static volatile long Xqedii_1nuqkc3zx9ekb = 6179078336821869926L;
   private static volatile long Xqedii_1db0ad2f389mz = 4265834720674891687L;

   public static int Xqedii_2whtpi9tmax0g(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1is5ieo1d9wax, var1);
   }

   public static int Xqedii_320m09do54ji2(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1zgvxjkju2ksg;
   }

   public static int Xqedii_febmnge73c3p(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_rt4jk7t6zj3x;
   }

   public static int Xqedii_1g7ru86qzdxo9(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_27dx7rlpqivk4, var1);
   }

   public static long Xqedii_rgotvn8q3hvw(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2plb8hc0wya09, var2);
   }

   public static long Xqedii_34v0fabzj9zs8(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1nrcx22h02b24;
   }

   public static long Xqedii_359ytzts0hpb8(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1nuqkc3zx9ekb;
   }

   public static long Xqedii_s7i4p1j1prl8(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1db0ad2f389mz, var2);
   }

   public static String Xqedii_2fdhqe9a4fjp8(String var0) {
      String var1 = Xqedii_3f4k0d8rw6nt.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("Jj6OUkUC9IjQR2o8M7QnXKv5WUvp8f5/KQa+2kkr9cc=");
            int var3 = 2143373846;

            for (int var4 = 0; var4 < var2.length; var4++) {
               var2[var4] ^= (byte)(var3 >>> (var4 & 3) * 8);
            }

            byte[] var11 = Base64.getDecoder().decode(var0);
            Cipher var5 = Cipher.getInstance("AES/GCM/NoPadding");
            var5.init(2, new SecretKeySpec(var2, "AES"), new GCMParameterSpec(128, var11, 0, 12));
            byte[] var6 = var5.doFinal(var11, 12, var11.length - 12);
            char[] var7 = new char[var6.length / 2];

            for (int var8 = 0; var8 < var7.length; var8++) {
               var7[var8] = (char)((var6[var8 * 2] & 255) << 8 | var6[var8 * 2 + 1] & 255);
            }

            String var12 = new String(var7).intern();
            Arrays.fill(var2, (byte)0);
            String var9 = Xqedii_3f4k0d8rw6nt.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2tkb8lgh9jv16() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2ataznuouocz9() {
   }

   private static int Xqedii_icpegiao5rt9(byte[] var0, byte[] var1) {
      if (var1.length != 0 && var0.length >= var1.length) {
         label27:
         for (int var2 = 0; var2 + var1.length <= var0.length; var2++) {
            for (int var3 = 0; var3 < var1.length; var3++) {
               if (var0[var2 + var3] != var1[var3]) {
                  continue label27;
               }
            }

            return var2;
         }

         return -1;
      } else {
         return -1;
      }
   }

   private static /* synthetic */ void Xqedii_1vzt18uidjm6w(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
