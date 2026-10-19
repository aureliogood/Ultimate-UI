package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_26s6s3x {
   private static final ConcurrentHashMap<String, String> Xqedii_2nvz06xh4v46k = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3hvlu5hpneff5 = 715525335;
   private static volatile int Xqedii_3acvrjhzb5xvd = 110510171;
   private static volatile int Xqedii_5wgqkgyozh7b = 1487654431;
   private static volatile int Xqedii_33c877ior0xme = -300673125;
   private static volatile long Xqedii_37opsk6ieyyew = -2437668523327899704L;
   private static volatile long Xqedii_1i2142lwy79b4 = 2518726936453164217L;
   private static volatile long Xqedii_2a4tmoqxhpvnb = -5728939937624334216L;
   private static volatile long Xqedii_1p9vsa5vomjil = 3193381687643636812L;

   public static int Xqedii_2ywy9fuukj0gu(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3hvlu5hpneff5, var1);
   }

   public static int Xqedii_2inhlir0fjz6p(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3acvrjhzb5xvd;
   }

   public static int Xqedii_2q5d33610bg86(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_5wgqkgyozh7b;
   }

   public static int Xqedii_3aot0iktwatcl(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_33c877ior0xme, var1);
   }

   public static long Xqedii_1p496kvn96a4v(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_37opsk6ieyyew, var2);
   }

   public static long Xqedii_3iissoo16sgpq(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1i2142lwy79b4;
   }

   public static long Xqedii_2nz0f15wo1e1b(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2a4tmoqxhpvnb;
   }

   public static long Xqedii_ft8d3aj58faj(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1p9vsa5vomjil, var2);
   }

   public static String Xqedii_1iyiqhnivqhrn(String var0) {
      String var1 = Xqedii_2nvz06xh4v46k.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("QkbNZMFjTgjdqxmDs07Ny9gNeQOR34U1Ad2Dk6g6oSM=");
            int var3 = -2082289502;

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
            String var9 = Xqedii_2nvz06xh4v46k.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_25lmc2ip2cxn5() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2k7uz9fmxjt1q() {
   }

   private static int Xqedii_1t4lmjq8zrdwd(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2eysmlydf17la(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
