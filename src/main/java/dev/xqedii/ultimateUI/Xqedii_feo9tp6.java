package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_feo9tp6 {
   private static final ConcurrentHashMap<String, String> Xqedii_2m9pw6uln7l0z = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1824etj29tacj = 1240159692;
   private static volatile int Xqedii_25r5db8jmtjfu = -1581784364;
   private static volatile int Xqedii_1lqfqg5qm7rze = -1438231370;
   private static volatile int Xqedii_32sznxq3do90 = -697607302;
   private static volatile long Xqedii_1m0vbdc3oeov9 = -9061308250678804854L;
   private static volatile long Xqedii_lby4cph4pqfo = -2850507532460967049L;
   private static volatile long Xqedii_12fvvmw8xe473 = -5928958437250954459L;
   private static volatile long Xqedii_ejm2pb2qq4rc = 633754704273172101L;

   public static int Xqedii_1o2hixqjvf2a3(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1824etj29tacj, var1);
   }

   public static int Xqedii_3vtczbvs4qwr1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_25r5db8jmtjfu;
   }

   public static int Xqedii_j6atig8r3fzl(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1lqfqg5qm7rze;
   }

   public static int Xqedii_1rygwzk3bep1(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_32sznxq3do90, var1);
   }

   public static long Xqedii_3tupyatfl51e9(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1m0vbdc3oeov9, var2);
   }

   public static long Xqedii_2wo3gw9n448x7(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_lby4cph4pqfo;
   }

   public static long Xqedii_1xl23ya1b4ouu(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_12fvvmw8xe473;
   }

   public static long Xqedii_9j9sagzvyc9s(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_ejm2pb2qq4rc, var2);
   }

   public static String Xqedii_1oon7cnr96222(String var0) {
      String var1 = Xqedii_2m9pw6uln7l0z.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("1WO8viHkPdzDvnxT7OiWwfLkqG2f3zTfDwCU3SZpd74=");
            int var3 = 1910334555;

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
            String var9 = Xqedii_2m9pw6uln7l0z.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2s42g3v28t8mt() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_31n1t6uqm7pij() {
   }

   private static int Xqedii_2y7sat1pw4b6p(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_164sv8vxg3jku(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
