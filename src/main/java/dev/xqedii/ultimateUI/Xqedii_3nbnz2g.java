package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3nbnz2g {
   private static final ConcurrentHashMap<String, String> Xqedii_22lauf26gtpl1 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_115cx9iqp9u2h = 907499681;
   private static volatile int Xqedii_9wbged3rm0pz = 1193585711;
   private static volatile int Xqedii_3rdjpd7gk75m0 = -282537211;
   private static volatile int Xqedii_2tefbb7zng4zf = 685761847;
   private static volatile long Xqedii_16f1iovpgytq0 = 453420413891930387L;
   private static volatile long Xqedii_3awrzfzi56197 = -95277005901425089L;
   private static volatile long Xqedii_13jzavd9bp8sd = 4567875585915168759L;
   private static volatile long Xqedii_397ekbhqhluib = -9042905197173002954L;

   public static int Xqedii_i9s3np25sgwr(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_115cx9iqp9u2h, var1);
   }

   public static int Xqedii_30cacuyy0z6dz(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_9wbged3rm0pz;
   }

   public static int Xqedii_213rdwe1paokz(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3rdjpd7gk75m0;
   }

   public static int Xqedii_2hes9lnle93nu(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2tefbb7zng4zf, var1);
   }

   public static long Xqedii_3b4oq45qvku94(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_16f1iovpgytq0, var2);
   }

   public static long Xqedii_tpx6o5uigyfv(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3awrzfzi56197;
   }

   public static long Xqedii_18n9xk8n63xiw(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_13jzavd9bp8sd;
   }

   public static long Xqedii_kfgycxhcbgo0(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_397ekbhqhluib, var2);
   }

   public static String Xqedii_1bhz5qo8w7avc(String var0) {
      String var1 = Xqedii_22lauf26gtpl1.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ubbA7QkQmqRGabuBq+aGqdOor+Q549nh6wb40Hxx00s=");
            int var3 = 1440011629;

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
            String var9 = Xqedii_22lauf26gtpl1.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3il8lg8fkdqq3() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3d2o50djnwl3s() {
   }

   private static int Xqedii_1a9zvc03fts3b(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3uixgqocqf5br(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
