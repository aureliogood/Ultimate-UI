package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_s7u76or {
   private static final ConcurrentHashMap<String, String> Xqedii_v5e2y1975gf3 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2xnte96v34hdx = -2084671605;
   private static volatile int Xqedii_16hlxjq9p69h1 = 1780433441;
   private static volatile int Xqedii_1k7pfolynu5o5 = 975241434;
   private static volatile int Xqedii_5f6knakq1n2x = -1829421773;
   private static volatile long Xqedii_h198ge4a2p6i = 773462383864314739L;
   private static volatile long Xqedii_1tcoji21ojo32 = -3171892856317707009L;
   private static volatile long Xqedii_3aawlchbcr3zs = -1490924068350584692L;
   private static volatile long Xqedii_5ukiq4qnaaab = 1741639664862786128L;

   public static int Xqedii_2xjw54uuwzmbp(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2xnte96v34hdx, var1);
   }

   public static int Xqedii_fviiw2x1bqad(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_16hlxjq9p69h1;
   }

   public static int Xqedii_2abz22a9ki5f1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1k7pfolynu5o5;
   }

   public static int Xqedii_1qbzm9yq5tm0m(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_5f6knakq1n2x, var1);
   }

   public static long Xqedii_2zcxur1la9ls(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_h198ge4a2p6i, var2);
   }

   public static long Xqedii_15truuz7xbmu1(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1tcoji21ojo32;
   }

   public static long Xqedii_1urewgg9suikz(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3aawlchbcr3zs;
   }

   public static long Xqedii_l9ueflghz60f(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_5ukiq4qnaaab, var2);
   }

   public static String Xqedii_3e2oqp63g99fs(String var0) {
      String var1 = Xqedii_v5e2y1975gf3.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("gtbywar7CEfG1ymk/Kn5nNNvu/vXmKJDFt8yFEIr25Y=");
            int var3 = 2019066066;

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
            String var9 = Xqedii_v5e2y1975gf3.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1lo1t71jgsbmz() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_qtt3peawnix3() {
   }

   private static int Xqedii_2937ukapyplcl(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2mody6y2lukp9(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
