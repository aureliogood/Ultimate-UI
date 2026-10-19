package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1emexi9 {
   private static final ConcurrentHashMap<String, String> Xqedii_mvmsx94esvs1 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1ho7mq3k1m2p2 = -158486345;
   private static volatile int Xqedii_ou3wr911ryyl = -507723066;
   private static volatile int Xqedii_1zih1jpo36bzv = 1064757100;
   private static volatile int Xqedii_2pjwguxc0vdcj = 1386848714;
   private static volatile long Xqedii_1092vk9kbq9fo = 34514535873424049L;
   private static volatile long Xqedii_3fis1q7mvca9l = -7187179859758565338L;
   private static volatile long Xqedii_1ien067y80yc5 = -1039549836262317219L;
   private static volatile long Xqedii_2tgvkpy769zzd = 4633934866612983395L;

   public static int Xqedii_1lfa4ib136olr(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1ho7mq3k1m2p2, var1);
   }

   public static int Xqedii_j0iu1fskzse7(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_ou3wr911ryyl;
   }

   public static int Xqedii_rlvwzwyf506i(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1zih1jpo36bzv;
   }

   public static int Xqedii_1dwv73rr8m15s(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2pjwguxc0vdcj, var1);
   }

   public static long Xqedii_3dhthxggjxii3(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1092vk9kbq9fo, var2);
   }

   public static long Xqedii_pdf2le818dhb(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3fis1q7mvca9l;
   }

   public static long Xqedii_jmx65j6e40ir(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1ien067y80yc5;
   }

   public static long Xqedii_3ct0y7kmretya(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2tgvkpy769zzd, var2);
   }

   public static String Xqedii_15z2ftj9yctai(String var0) {
      String var1 = Xqedii_mvmsx94esvs1.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("go4/t2Zf6CDTHoyy878+q1wzSk8t8ljinaDaRDvGtNQ=");
            int var3 = -1586851858;

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
            String var9 = Xqedii_mvmsx94esvs1.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2ukdex527u7sr() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3q2hhfb7rse6v() {
   }

   private static int Xqedii_gol5go4183rt(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_32k2mb9ce6zma(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
