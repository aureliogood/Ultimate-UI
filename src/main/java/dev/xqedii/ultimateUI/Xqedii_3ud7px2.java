package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3ud7px2 {
   private static final ConcurrentHashMap<String, String> Xqedii_3togfv7ln4j5i = new ConcurrentHashMap<>();
   private static volatile int Xqedii_hzxuxfaewf02 = -746774399;
   private static volatile int Xqedii_3luhaa5c1xjkb = -276777919;
   private static volatile int Xqedii_3tjnahn7sckk7 = 1843017841;
   private static volatile int Xqedii_19v497uydkmst = 271582795;
   private static volatile long Xqedii_gubr2lzet9aa = -4981565233919384058L;
   private static volatile long Xqedii_2h3cvxagtaaus = 1768820539071620567L;
   private static volatile long Xqedii_3sb2dnk09u48a = -3887535262689754586L;
   private static volatile long Xqedii_35ovdglcdao4y = 7101711418033307123L;

   public static int Xqedii_axm4xb067viv(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_hzxuxfaewf02, var1);
   }

   public static int Xqedii_m725fcjiugch(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3luhaa5c1xjkb;
   }

   public static int Xqedii_2e4lg1wr0gdje(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3tjnahn7sckk7;
   }

   public static int Xqedii_g2crp75fwhbd(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_19v497uydkmst, var1);
   }

   public static long Xqedii_1gz1wtfpfvmum(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_gubr2lzet9aa, var2);
   }

   public static long Xqedii_1cen6gbwy9ziz(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2h3cvxagtaaus;
   }

   public static long Xqedii_2fc1dh2jtcvgr(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3sb2dnk09u48a;
   }

   public static long Xqedii_26kqlq9cqmcsc(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_35ovdglcdao4y, var2);
   }

   public static String Xqedii_1de20hrkryrlk(String var0) {
      String var1 = Xqedii_3togfv7ln4j5i.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("vyX4r3DZ6OcqGV5LOA9oNPN41umjsX46jfaZQQNtlb4=");
            int var3 = -1047327552;

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
            String var9 = Xqedii_3togfv7ln4j5i.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_cyjw9erwro6p() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2go670661unkf() {
   }

   private static int Xqedii_edh1y4f7jd6g(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1fnzm3ys5c0mc(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
