package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_d2816sq {
   private static final ConcurrentHashMap<String, String> Xqedii_3abchnh8d0313 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3tqkw3gpgo46p = -90026678;
   private static volatile int Xqedii_3t680ytqlzmge = 1873106398;
   private static volatile int Xqedii_2ham93dl3sisx = -1311966287;
   private static volatile int Xqedii_36sy76leqpydh = 595974366;
   private static volatile long Xqedii_15xq8csfkl1zy = -6444860695811945489L;
   private static volatile long Xqedii_1rjr30oot43ug = -7228996328535088623L;
   private static volatile long Xqedii_kle5czcvc4d = 272856214753007240L;
   private static volatile long Xqedii_3m0e4iclb50ut = -8800149991689887277L;

   public static int Xqedii_26h9rtx6c9tid(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3tqkw3gpgo46p, var1);
   }

   public static int Xqedii_30e3l4xkggwdf(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3t680ytqlzmge;
   }

   public static int Xqedii_cc2j0yeeeb95(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2ham93dl3sisx;
   }

   public static int Xqedii_1oba2i6xtyq5c(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_36sy76leqpydh, var1);
   }

   public static long Xqedii_3kreef3v7sng7(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_15xq8csfkl1zy, var2);
   }

   public static long Xqedii_ivlge7prs2xp(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1rjr30oot43ug;
   }

   public static long Xqedii_3v3casw7tuhjj(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_kle5czcvc4d;
   }

   public static long Xqedii_3oozvyr5fk1g(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3m0e4iclb50ut, var2);
   }

   public static String Xqedii_aggfx9ilwwzc(String var0) {
      String var1 = Xqedii_3abchnh8d0313.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("i7fjYRD9blIG3di2lGBkhE2jBtFoA2bDn/msbcOU8fM=");
            int var3 = -2129632237;

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
            String var9 = Xqedii_3abchnh8d0313.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3qduqfiqlm839() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3beu5ezl9eb1h() {
   }

   private static int Xqedii_1lbtvy4ahofcw(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2ooxqx729tlfa(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
