package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1rgprri {
   private static final ConcurrentHashMap<String, String> Xqedii_imyz97ehazuu = new ConcurrentHashMap<>();
   private static volatile int Xqedii_8i332z67td6q = 85853849;
   private static volatile int Xqedii_3k4cblg6s8ojc = 1599699592;
   private static volatile int Xqedii_1gv51fbb3embh = -1190048136;
   private static volatile int Xqedii_3pygiyeo8cki = 1015999974;
   private static volatile long Xqedii_3pie0z2ujftib = 2674986732261503414L;
   private static volatile long Xqedii_1cuennsilyblo = 2364788968850248706L;
   private static volatile long Xqedii_1mwagqsntz6n9 = -1358119460979520938L;
   private static volatile long Xqedii_3b0dpi7qrp4ep = 3272159611263106986L;

   public static int Xqedii_njd7h3uluzmm(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_8i332z67td6q, var1);
   }

   public static int Xqedii_1qllrum9dbowt(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3k4cblg6s8ojc;
   }

   public static int Xqedii_3gslbghoq0d1h(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1gv51fbb3embh;
   }

   public static int Xqedii_386bfvvm2i804(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3pygiyeo8cki, var1);
   }

   public static long Xqedii_2ndglw5khe8um(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3pie0z2ujftib, var2);
   }

   public static long Xqedii_yyrenhcxtz9g(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1cuennsilyblo;
   }

   public static long Xqedii_75clq6fm7xn9(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1mwagqsntz6n9;
   }

   public static long Xqedii_1wo6eu06jqysn(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3b0dpi7qrp4ep, var2);
   }

   public static String Xqedii_2sijggm3h7qbx(String var0) {
      String var1 = Xqedii_imyz97ehazuu.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("rw41E1vhMFXmDdKfIaQoiJB6bWKMhcSKMCx6tYLFCWQ=");
            int var3 = -462057090;

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
            String var9 = Xqedii_imyz97ehazuu.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3j6u2peozxt8w() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3d4lattjh18rb() {
   }

   private static int Xqedii_3h0plv83bdq7n(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3kxqpxneqwp5i(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
