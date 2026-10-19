package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_y2ppbml {
   private static final ConcurrentHashMap<String, String> Xqedii_21mssxxu4x6sa = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2680zym2m5040 = -1854152348;
   private static volatile int Xqedii_2ip5hvogd7tjx = -1201874128;
   private static volatile int Xqedii_1i7xlcupsoq7t = -654446657;
   private static volatile int Xqedii_3qbkw3w10vp0b = 1390548851;
   private static volatile long Xqedii_17nt5cc6y9z4b = -2117320149463433809L;
   private static volatile long Xqedii_3gqpfs1dovzwy = -3486021318913737852L;
   private static volatile long Xqedii_5j6bsqeuirj0 = 3608085236019810287L;
   private static volatile long Xqedii_1wex17zbfzbgx = -5995097042161972466L;

   public static int Xqedii_3dijhofxpppgn(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2680zym2m5040, var1);
   }

   public static int Xqedii_pcozdfc95hjb(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2ip5hvogd7tjx;
   }

   public static int Xqedii_2fo5np48jvfg9(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1i7xlcupsoq7t;
   }

   public static int Xqedii_4h58vvmrupdl(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3qbkw3w10vp0b, var1);
   }

   public static long Xqedii_p68wiiuz9hgv(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_17nt5cc6y9z4b, var2);
   }

   public static long Xqedii_3cf01fxn53w6p(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3gqpfs1dovzwy;
   }

   public static long Xqedii_37ifge8qwe4cp(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_5j6bsqeuirj0;
   }

   public static long Xqedii_23iqwy955xe7v(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1wex17zbfzbgx, var2);
   }

   public static String Xqedii_1td2rpphnibmm(String var0) {
      String var1 = Xqedii_21mssxxu4x6sa.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("VhKMtcyNA5N2QXtnm782PhCFo27YbxPzfwdOwusPZ2M=");
            int var3 = 1770367377;

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
            String var9 = Xqedii_21mssxxu4x6sa.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1ow31xj8kpce8() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3b157a8mo1l2r() {
   }

   private static int Xqedii_26gp9z1won4fr(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_36hu15clphe34(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
