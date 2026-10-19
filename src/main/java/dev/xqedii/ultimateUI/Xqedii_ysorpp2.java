package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_ysorpp2 {
   private static final ConcurrentHashMap<String, String> Xqedii_bvrendnzbw4s = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2fhbqkso5ncaq = 150983175;
   private static volatile int Xqedii_1vt1fdasxgmc3 = 1073713327;
   private static volatile int Xqedii_1mpvhas22azhg = -535381789;
   private static volatile int Xqedii_isf9lzz4mbxb = 65819870;
   private static volatile long Xqedii_2ikets8rj5nky = 1691723649579217035L;
   private static volatile long Xqedii_2ww9k0si3h2g2 = -6297422996396003743L;
   private static volatile long Xqedii_1c1egrmddikh1 = 7219326568894365179L;
   private static volatile long Xqedii_2tvy1guslwzvy = 205462167560240177L;

   public static int Xqedii_mrl7pdj7lqdl(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2fhbqkso5ncaq, var1);
   }

   public static int Xqedii_35uc0zonst06t(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1vt1fdasxgmc3;
   }

   public static int Xqedii_2rh8rtfs7o74b(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1mpvhas22azhg;
   }

   public static int Xqedii_324zrjnvu8gew(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_isf9lzz4mbxb, var1);
   }

   public static long Xqedii_bp7eccmoxxeq(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2ikets8rj5nky, var2);
   }

   public static long Xqedii_l2iuo3v4lrjx(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2ww9k0si3h2g2;
   }

   public static long Xqedii_3uwnodcog6vi(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1c1egrmddikh1;
   }

   public static long Xqedii_3rul6ikjjjzcv(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2tvy1guslwzvy, var2);
   }

   public static String Xqedii_h7n297z94pis(String var0) {
      String var1 = Xqedii_bvrendnzbw4s.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("9z7/ZCoAoDcrp8kyLD4/0sHa0Z+On+TKLnmuVl1ShAA=");
            int var3 = 908572476;

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
            String var9 = Xqedii_bvrendnzbw4s.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_pqihruchfewx() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_qorgao642mb5() {
   }

   private static int Xqedii_1h8frsx4wlx5t(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_lznvwjhys3aq(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
