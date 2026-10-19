package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2lun6e9 {
   private static final ConcurrentHashMap<String, String> Xqedii_1fxhvf7ybmx00 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3ietm96wqx5nr = 125610735;
   private static volatile int Xqedii_1qtw5suw2xofg = -1718716970;
   private static volatile int Xqedii_sw561t0r20u9 = 1577302087;
   private static volatile int Xqedii_3j8lt1fyxwvnn = -1555134358;
   private static volatile long Xqedii_2sh6sz0fk7o3 = 3577627741656380330L;
   private static volatile long Xqedii_5m6850jczibp = -7606984126836026552L;
   private static volatile long Xqedii_1p1za91vd5qao = 4341348857802304372L;
   private static volatile long Xqedii_qx96vk6myfac = -7444757322029298907L;

   public static int Xqedii_17r3vnx55szal(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3ietm96wqx5nr, var1);
   }

   public static int Xqedii_27y9v4v0zkdg0(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1qtw5suw2xofg;
   }

   public static int Xqedii_a939dwhpq03f(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_sw561t0r20u9;
   }

   public static int Xqedii_1408ammsxycfh(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3j8lt1fyxwvnn, var1);
   }

   public static long Xqedii_v3lv9tgwrcl0(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2sh6sz0fk7o3, var2);
   }

   public static long Xqedii_2r4x39vrd4906(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_5m6850jczibp;
   }

   public static long Xqedii_vnljktpat6b7(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1p1za91vd5qao;
   }

   public static long Xqedii_1s1fsbwjzbmu2(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_qx96vk6myfac, var2);
   }

   public static String Xqedii_1lnc1a1u7tq0e(String var0) {
      String var1 = Xqedii_1fxhvf7ybmx00.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("GM0XP4oVduHs0xyZke6aLlbcgZT1n3zwWlfKUuLvLeM=");
            int var3 = -1900994469;

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
            String var9 = Xqedii_1fxhvf7ybmx00.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_qg70dwycgglr() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2320mhnjxtcf6() {
   }

   private static int Xqedii_3or5nnmzh5tyi(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1dnx88i0d75ov(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
