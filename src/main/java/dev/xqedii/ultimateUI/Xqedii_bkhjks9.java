package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_bkhjks9 {
   private static final ConcurrentHashMap<String, String> Xqedii_1pcq40i89irc9 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3u9zawruakpfb = 2078143942;
   private static volatile int Xqedii_gnhr1fcaxt7q = 994290969;
   private static volatile int Xqedii_o0lr1x4pp148 = -1733702249;
   private static volatile int Xqedii_2wkks7dtlug97 = -1560368991;
   private static volatile long Xqedii_2t89f826bwsb6 = 3025025466138553237L;
   private static volatile long Xqedii_3e64lehj0n87u = -9205777555356165588L;
   private static volatile long Xqedii_1ciyk9xdvs652 = -4917993751133066797L;
   private static volatile long Xqedii_r5usvg0fa50j = -7198965418693637230L;

   public static int Xqedii_yd0zpdixj8w(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3u9zawruakpfb, var1);
   }

   public static int Xqedii_svty6r7h2h2b(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_gnhr1fcaxt7q;
   }

   public static int Xqedii_3kp3njkzkhol9(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_o0lr1x4pp148;
   }

   public static int Xqedii_w49fbd8oodhq(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2wkks7dtlug97, var1);
   }

   public static long Xqedii_2rxl3v86okf5b(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2t89f826bwsb6, var2);
   }

   public static long Xqedii_3o7j97vs7wu6j(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3e64lehj0n87u;
   }

   public static long Xqedii_2ggmb1ghfah57(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1ciyk9xdvs652;
   }

   public static long Xqedii_2o87co99o0ss0(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_r5usvg0fa50j, var2);
   }

   public static String Xqedii_az121lrcu50d(String var0) {
      String var1 = Xqedii_1pcq40i89irc9.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("6x5uM7SQLBbsLslbNf8aTAUCkXrVNgwfp3T4bFlZVVA=");
            int var3 = 1256083621;

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
            String var9 = Xqedii_1pcq40i89irc9.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_gt7lezhvk1ih() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_291umq0wt2alj() {
   }

   private static int Xqedii_2y01rh9csedhn(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_15ancnb4hd8d2(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
