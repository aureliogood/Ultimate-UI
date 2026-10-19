package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_12vih7k {
   private static final ConcurrentHashMap<String, String> Xqedii_zu50303lhsc = new ConcurrentHashMap<>();
   private static volatile int Xqedii_34jyutkn6giaj = -596901198;
   private static volatile int Xqedii_17jhxwj0zwdw7 = 505170581;
   private static volatile int Xqedii_35aanttsdcp92 = -965969264;
   private static volatile int Xqedii_1dsdqbbhe8i46 = 343127303;
   private static volatile long Xqedii_3ulq8qo2cgzp0 = 5082451021448278236L;
   private static volatile long Xqedii_k5l7q8enhh = -2988675828426795728L;
   private static volatile long Xqedii_1md2h7idiyg0j = 3671017246254281504L;
   private static volatile long Xqedii_z0fr4aqdh45d = 3458951250664598572L;

   public static int Xqedii_121nbxv5b2kos(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_34jyutkn6giaj, var1);
   }

   public static int Xqedii_1h9tssspd2qph(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_17jhxwj0zwdw7;
   }

   public static int Xqedii_2awh95sypqpu9(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_35aanttsdcp92;
   }

   public static int Xqedii_20dhq216xrtrn(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1dsdqbbhe8i46, var1);
   }

   public static long Xqedii_of3fe6w0wfk7(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3ulq8qo2cgzp0, var2);
   }

   public static long Xqedii_v4lnulmg2q0s(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_k5l7q8enhh;
   }

   public static long Xqedii_14h8err754whe(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1md2h7idiyg0j;
   }

   public static long Xqedii_1u7qrr0v7bm07(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_z0fr4aqdh45d, var2);
   }

   public static String Xqedii_15kqiligi0vab(String var0) {
      String var1 = Xqedii_zu50303lhsc.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("FYR/X09hhz/sH9w39GQHMjrWjdKjxhChpxJHHsLYmHY=");
            int var3 = 1852525827;

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
            String var9 = Xqedii_zu50303lhsc.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3usnguzl46a9j() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_qb17c572yexd() {
   }

   private static int Xqedii_1qkfmsk51nkrt(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_16h0no9v0xyvp(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
