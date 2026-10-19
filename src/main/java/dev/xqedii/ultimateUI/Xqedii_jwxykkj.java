package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_jwxykkj {
   private static final ConcurrentHashMap<String, String> Xqedii_3vj9qnfrwsg1b = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2vbyqkxavqtmd = 1651638138;
   private static volatile int Xqedii_3sspero03vj07 = -1033350898;
   private static volatile int Xqedii_1so2pqag5edmd = 1843518561;
   private static volatile int Xqedii_3ebyvgspgze23 = -1191689219;
   private static volatile long Xqedii_3jq7ydl07m4tt = -387117251991815036L;
   private static volatile long Xqedii_vigq0exua0xp = -8303739645069747646L;
   private static volatile long Xqedii_kf50k1vo0ykk = -1543345827877398718L;
   private static volatile long Xqedii_n78crrs789xq = -2247615274277644042L;

   public static int Xqedii_3tjk5a0coxseb(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2vbyqkxavqtmd, var1);
   }

   public static int Xqedii_14x5zv9282aia(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3sspero03vj07;
   }

   public static int Xqedii_3sesiomawokm4(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1so2pqag5edmd;
   }

   public static int Xqedii_1cdai8mx5arqr(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3ebyvgspgze23, var1);
   }

   public static long Xqedii_2u13u6kcu69ab(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3jq7ydl07m4tt, var2);
   }

   public static long Xqedii_3smimh3lzab8q(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_vigq0exua0xp;
   }

   public static long Xqedii_s540oinup97(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_kf50k1vo0ykk;
   }

   public static long Xqedii_vyb46s0gvkp0(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_n78crrs789xq, var2);
   }

   public static String Xqedii_2jj6z1wvyz6xb(String var0) {
      String var1 = Xqedii_3vj9qnfrwsg1b.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("+58T1xD7AqdrzNAqKqt/LJRuo+9TnXI6LeruqnAj3I8=");
            int var3 = 1842841129;

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
            String var9 = Xqedii_3vj9qnfrwsg1b.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_35lgk261s8hlx() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_27x1u9nuof18m() {
   }

   private static int Xqedii_lj4kxu6xw3k2(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_7rysqfcg9qs5(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
