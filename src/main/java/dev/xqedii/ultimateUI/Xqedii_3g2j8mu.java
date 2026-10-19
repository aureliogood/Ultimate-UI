package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3g2j8mu {
   private static final ConcurrentHashMap<String, String> Xqedii_3cjl0e1x7hqix = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1l944p06cyrv = -329866546;
   private static volatile int Xqedii_3kbwpqtfzgsds = 664542654;
   private static volatile int Xqedii_1bqwee2kz1p27 = 1000690891;
   private static volatile int Xqedii_2hh94ejq3b1vv = -1163694031;
   private static volatile long Xqedii_2ivpd2kx397v1 = -4064599386401645336L;
   private static volatile long Xqedii_2c35hx1eitfed = -8860772173094081268L;
   private static volatile long Xqedii_73g4rwq46du9 = -846241718076122030L;
   private static volatile long Xqedii_2wzjfmz8scla8 = -6169310986999466074L;

   public static int Xqedii_37ghm0y0rzyaj(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1l944p06cyrv, var1);
   }

   public static int Xqedii_bo0xpk6m94r5(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3kbwpqtfzgsds;
   }

   public static int Xqedii_2rpfmjwst5nft(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1bqwee2kz1p27;
   }

   public static int Xqedii_i3fli6fxf12q(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2hh94ejq3b1vv, var1);
   }

   public static long Xqedii_2jxw4w5jmxwgw(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2ivpd2kx397v1, var2);
   }

   public static long Xqedii_rkop13h6ce33(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2c35hx1eitfed;
   }

   public static long Xqedii_wjigyzi52vt8(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_73g4rwq46du9;
   }

   public static long Xqedii_346quz37nsdtn(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2wzjfmz8scla8, var2);
   }

   public static String Xqedii_3yva3e3jfqol(String var0) {
      String var1 = Xqedii_3cjl0e1x7hqix.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("jz1+iOEyu7ZUv+gBCCn97CxI9AMHqbnN5Fqefxb6E08=");
            int var3 = 1785939757;

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
            String var9 = Xqedii_3cjl0e1x7hqix.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1y0iqtzu3reo9() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3u5skhcq1r1hw() {
   }

   private static int Xqedii_ytiz53h1lawv(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2vahe9kfnd27d(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
