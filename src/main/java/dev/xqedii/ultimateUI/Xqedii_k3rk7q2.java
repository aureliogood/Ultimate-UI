package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_k3rk7q2 {
   private static final ConcurrentHashMap<String, String> Xqedii_3913r3siogcrb = new ConcurrentHashMap<>();
   private static volatile int Xqedii_n88cjmtq1tcm = -2022613928;
   private static volatile int Xqedii_6aah1t0cssl2 = -1917712608;
   private static volatile int Xqedii_2uwcwrzwutvgt = 246041988;
   private static volatile int Xqedii_z0wgkkxzlry9 = -87490585;
   private static volatile long Xqedii_1rois942lh5g2 = 8488650418260626825L;
   private static volatile long Xqedii_2l63yi4sbdls7 = 1575872188078254059L;
   private static volatile long Xqedii_3k0gcqweuu05h = 6945286093009570321L;
   private static volatile long Xqedii_7y6zhvz2980s = -3690924883253190699L;

   public static int Xqedii_3iyee3v0uy4og(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_n88cjmtq1tcm, var1);
   }

   public static int Xqedii_19uqrlw7l2xtz(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_6aah1t0cssl2;
   }

   public static int Xqedii_3bftlb98tzkne(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2uwcwrzwutvgt;
   }

   public static int Xqedii_1t7yqc31m5xvn(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_z0wgkkxzlry9, var1);
   }

   public static long Xqedii_2n08w5y7103q8(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1rois942lh5g2, var2);
   }

   public static long Xqedii_3vkut9q4nitdf(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2l63yi4sbdls7;
   }

   public static long Xqedii_2kcbnbdj7p697(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3k0gcqweuu05h;
   }

   public static long Xqedii_30c9foy93m0uv(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_7y6zhvz2980s, var2);
   }

   public static String Xqedii_3qg51vyv601bi(String var0) {
      String var1 = Xqedii_3913r3siogcrb.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("/WqcyNPoPBqXGQP26v2injKjS1DlKwbAfcgzvVj2XxM=");
            int var3 = -395289839;

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
            String var9 = Xqedii_3913r3siogcrb.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1sjwm22cz3wu1() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_21whfmo8r8dfu() {
   }

   private static int Xqedii_3inn6kgchh9lx(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_36vq873xyebrj(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
