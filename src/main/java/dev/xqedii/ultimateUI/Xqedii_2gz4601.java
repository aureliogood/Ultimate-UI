package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2gz4601 {
   private static final ConcurrentHashMap<String, String> Xqedii_3py013ooleit6 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2tjohcss4b4wj = -590016116;
   private static volatile int Xqedii_2oh0po145sftp = 1019770500;
   private static volatile int Xqedii_3at2vpedjl0ry = -1857530331;
   private static volatile int Xqedii_3bpmt6kgco38y = 1265937048;
   private static volatile long Xqedii_3n7r2t60hxasf = -7715016607253653833L;
   private static volatile long Xqedii_soldye5d4s30 = 6124505575339200812L;
   private static volatile long Xqedii_30k15t6koopcl = -8834222064421722016L;
   private static volatile long Xqedii_gxqops8nu3y1 = -5660874249507398765L;

   public static int Xqedii_cnfcbwu2e96k(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2tjohcss4b4wj, var1);
   }

   public static int Xqedii_3sdl6amqsle36(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2oh0po145sftp;
   }

   public static int Xqedii_22qcb024weump(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3at2vpedjl0ry;
   }

   public static int Xqedii_30jjthgwnwcm2(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3bpmt6kgco38y, var1);
   }

   public static long Xqedii_2e4j5crcjar4t(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3n7r2t60hxasf, var2);
   }

   public static long Xqedii_172x6p1zsrtni(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_soldye5d4s30;
   }

   public static long Xqedii_1d2l609b1l6zl(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_30k15t6koopcl;
   }

   public static long Xqedii_1so4bibcxibsi(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_gxqops8nu3y1, var2);
   }

   public static String Xqedii_1gv4fzho7m9r5(String var0) {
      String var1 = Xqedii_3py013ooleit6.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ZzjpWyfakh/NYHbj2xpLl9lyIeLLJcyFkDgvxqpG0EM=");
            int var3 = -1933349329;

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
            String var9 = Xqedii_3py013ooleit6.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2dq89nc5yadnx() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3line09crgm9g() {
   }

   private static int Xqedii_3m1ci5xild00t(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3v6vcdofqmmai(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
