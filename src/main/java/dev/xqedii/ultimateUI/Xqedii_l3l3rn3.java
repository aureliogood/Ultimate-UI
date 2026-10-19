package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_l3l3rn3 {
   private static final ConcurrentHashMap<String, String> Xqedii_3oaclfugkw7e6 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_hxrlhl9xni08 = 1285741121;
   private static volatile int Xqedii_176b7oj19b7da = 1784170936;
   private static volatile int Xqedii_272pvly4lga37 = -905337199;
   private static volatile int Xqedii_3vqtdjnnybyvf = -2133688342;
   private static volatile long Xqedii_1p2s86uvqh010 = 5954483112608583038L;
   private static volatile long Xqedii_1adtrfy9e38a2 = -2630568254211423093L;
   private static volatile long Xqedii_1772dx9h9t7ky = -4564304113639768735L;
   private static volatile long Xqedii_2o4nyurk6vjpb = 8988706476540653675L;

   public static int Xqedii_1rw2znk8xxpe8(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_hxrlhl9xni08, var1);
   }

   public static int Xqedii_3qwyd3h57p8u4(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_176b7oj19b7da;
   }

   public static int Xqedii_1pho73ssrio3(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_272pvly4lga37;
   }

   public static int Xqedii_3gfz5yflbxo85(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3vqtdjnnybyvf, var1);
   }

   public static long Xqedii_bl8busxnhxjg(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1p2s86uvqh010, var2);
   }

   public static long Xqedii_2crretqu1y2ik(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1adtrfy9e38a2;
   }

   public static long Xqedii_3u4vc7e4k8wd3(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1772dx9h9t7ky;
   }

   public static long Xqedii_3nor5rguu77x7(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2o4nyurk6vjpb, var2);
   }

   public static String Xqedii_h4paj2et5ma9(String var0) {
      String var1 = Xqedii_3oaclfugkw7e6.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("+9p5MjutdG6vURRRhBeEqjSZVlaOMYcLGwDZBeqQjOM=");
            int var3 = -1808935657;

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
            String var9 = Xqedii_3oaclfugkw7e6.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_28qqk0tann9rn() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_38lulgx35kgx() {
   }

   private static int Xqedii_3met9qt1y3gpp(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_13xisxpljuqmx(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
