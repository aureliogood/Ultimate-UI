package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_144eogi {
   private static final ConcurrentHashMap<String, String> Xqedii_3he44ae7goqos = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2kqx3kdh9cews = 825845376;
   private static volatile int Xqedii_22vshqreuhi5j = 512688040;
   private static volatile int Xqedii_p2bfr22ik6tt = 1241262596;
   private static volatile int Xqedii_3t6frfzjevx8w = -721810234;
   private static volatile long Xqedii_1x3uytlvp6zde = 2487010215263944851L;
   private static volatile long Xqedii_35wlxy6xirabb = 7813464816081333206L;
   private static volatile long Xqedii_2vjsobtb5yfj0 = -3937329494511661726L;
   private static volatile long Xqedii_3mxrbz81nv93u = 8798744558463926358L;

   public static int Xqedii_111ehwx07w8i(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2kqx3kdh9cews, var1);
   }

   public static int Xqedii_7syyowo92hgg(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_22vshqreuhi5j;
   }

   public static int Xqedii_21f6ki8nog7xd(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_p2bfr22ik6tt;
   }

   public static int Xqedii_qgzmegn7nf5p(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3t6frfzjevx8w, var1);
   }

   public static long Xqedii_fv2tmp0vm94o(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1x3uytlvp6zde, var2);
   }

   public static long Xqedii_108da41rrda18(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_35wlxy6xirabb;
   }

   public static long Xqedii_1p484qtty8xvx(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2vjsobtb5yfj0;
   }

   public static long Xqedii_3l5k35h8lr49o(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3mxrbz81nv93u, var2);
   }

   public static String Xqedii_1m52nqoyeel5v(String var0) {
      String var1 = Xqedii_3he44ae7goqos.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("MUOjCa/3PNV+n/hInHroXK1WcMOzZL/toHEFcDdQ4xA=");
            int var3 = -274052582;

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
            String var9 = Xqedii_3he44ae7goqos.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1h2w43gksgn8m() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2bfjdw7m4h4s6() {
   }

   private static int Xqedii_1xvrl3a52snpe(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_14a29ir5uw5nc(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
