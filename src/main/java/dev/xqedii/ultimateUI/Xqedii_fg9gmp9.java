package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_fg9gmp9 {
   private static final ConcurrentHashMap<String, String> Xqedii_4mr4pkzzeulc = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1ks02aiquv7x4 = -862920226;
   private static volatile int Xqedii_3og8pdjf4dcl4 = 221201773;
   private static volatile int Xqedii_2aoh2ca0mikly = -979213940;
   private static volatile int Xqedii_31cao5lc23jti = 1797332060;
   private static volatile long Xqedii_rkuq8gngb1b = -1544633424058970031L;
   private static volatile long Xqedii_29gfkgvm4caw2 = -8636211840536137915L;
   private static volatile long Xqedii_1blgj3827x5pb = -8803567601634429884L;
   private static volatile long Xqedii_296726dcvqrv4 = -1406002086595536373L;

   public static int Xqedii_3s7byvxi7i772(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1ks02aiquv7x4, var1);
   }

   public static int Xqedii_2l1ezpzd22oz3(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3og8pdjf4dcl4;
   }

   public static int Xqedii_38eomwcmy8psw(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2aoh2ca0mikly;
   }

   public static int Xqedii_o29bo0bbu1sb(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_31cao5lc23jti, var1);
   }

   public static long Xqedii_1nzmmexg2m8us(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_rkuq8gngb1b, var2);
   }

   public static long Xqedii_l5v9eg2ivmtl(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_29gfkgvm4caw2;
   }

   public static long Xqedii_pm7jkx0q3no6(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1blgj3827x5pb;
   }

   public static long Xqedii_2mb0m8o0pb3rn(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_296726dcvqrv4, var2);
   }

   public static String Xqedii_2w3o6qu4dmhvs(String var0) {
      String var1 = Xqedii_4mr4pkzzeulc.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("KFHiO3vv4Cj4xBF4IM8x4mXsc1XWkS1CejvHe+HWhEY=");
            int var3 = 1140660888;

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
            String var9 = Xqedii_4mr4pkzzeulc.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_12ifyuc611t2b() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3buqmhlcjrz1p() {
   }

   private static int Xqedii_111kxr5ifnbni(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3tnspvyra8jno(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
