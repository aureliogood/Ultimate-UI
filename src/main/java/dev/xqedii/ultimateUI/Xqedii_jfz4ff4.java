package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_jfz4ff4 {
   private static final ConcurrentHashMap<String, String> Xqedii_3gd661we8ol0a = new ConcurrentHashMap<>();
   private static volatile int Xqedii_4d3oiqs38h52 = -69648447;
   private static volatile int Xqedii_2lupspbgqx79a = -1245310077;
   private static volatile int Xqedii_26rw9ala4k3eg = 461685608;
   private static volatile int Xqedii_1ebn2gq4zz2w1 = -297295176;
   private static volatile long Xqedii_3hua41itcbj99 = 1048306038603168625L;
   private static volatile long Xqedii_o4ykptchcfp8 = -7088378613404917607L;
   private static volatile long Xqedii_p0cj14ivx2ik = -3852613530535993905L;
   private static volatile long Xqedii_3jeqi16adxcy7 = -5996583335929403473L;

   public static int Xqedii_350h0oyh90dle(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_4d3oiqs38h52, var1);
   }

   public static int Xqedii_18a438y8zz0mw(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2lupspbgqx79a;
   }

   public static int Xqedii_3m43c84yshllr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_26rw9ala4k3eg;
   }

   public static int Xqedii_38cw10mqq1mby(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1ebn2gq4zz2w1, var1);
   }

   public static long Xqedii_e3g884o9edo4(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3hua41itcbj99, var2);
   }

   public static long Xqedii_3b43pj740r6vr(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_o4ykptchcfp8;
   }

   public static long Xqedii_2cwdb4xgau8r6(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_p0cj14ivx2ik;
   }

   public static long Xqedii_17lty37eglzde(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3jeqi16adxcy7, var2);
   }

   public static String Xqedii_18hfvc9bf6ans(String var0) {
      String var1 = Xqedii_3gd661we8ol0a.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("wFHtCX44gdQrmVrYnggdRcitdMc4/+gAuOHWkajSMSE=");
            int var3 = 1725058233;

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
            String var9 = Xqedii_3gd661we8ol0a.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_c6wmazd19i6j() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1tw0ddorxyk44() {
   }

   private static int Xqedii_10d85vedhnyuk(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_303w117o4hgc6(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
