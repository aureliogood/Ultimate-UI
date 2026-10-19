package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_dzz0vna {
   private static final ConcurrentHashMap<String, String> Xqedii_11pmhdfydzubd = new ConcurrentHashMap<>();
   private static volatile int Xqedii_lqrev6tx5wlf = -963979639;
   private static volatile int Xqedii_1uiirzuugn4i4 = -723795025;
   private static volatile int Xqedii_3h6mlgeb6o6bt = -780467565;
   private static volatile int Xqedii_1ikzaxot88afw = -272048117;
   private static volatile long Xqedii_2xwkdakz63x9u = 7485476685799727808L;
   private static volatile long Xqedii_2458lpdlngrif = 1042601840774319352L;
   private static volatile long Xqedii_39zcec5v8g47c = 5547935059786438907L;
   private static volatile long Xqedii_zcfm2xlxm8m9 = -3781433272315738829L;

   public static int Xqedii_3uhodrgdsafhs(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_lqrev6tx5wlf, var1);
   }

   public static int Xqedii_2il13rqih5sdr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1uiirzuugn4i4;
   }

   public static int Xqedii_1lvgp6j0eemm5(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3h6mlgeb6o6bt;
   }

   public static int Xqedii_1t1bic4ljhxg2(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1ikzaxot88afw, var1);
   }

   public static long Xqedii_1hskb9slckw4v(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2xwkdakz63x9u, var2);
   }

   public static long Xqedii_1wqeggn9cyvfe(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2458lpdlngrif;
   }

   public static long Xqedii_p72km1rof80q(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_39zcec5v8g47c;
   }

   public static long Xqedii_e3ybs401zq77(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_zcfm2xlxm8m9, var2);
   }

   public static String Xqedii_2m7mvzjbcr3o8(String var0) {
      String var1 = Xqedii_11pmhdfydzubd.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("9ihnvZoV3yiz5upwTZae3V8qg01a1qr1MF7TfRcxEyQ=");
            int var3 = -1776517142;

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
            String var9 = Xqedii_11pmhdfydzubd.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_22c1nomuq3jd0() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_mp94qug0z0an() {
   }

   private static int Xqedii_vuwm6y00lqvz(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_13dh85h7n72vp(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
