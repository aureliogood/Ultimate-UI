package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_r15g1rt {
   private static final ConcurrentHashMap<String, String> Xqedii_b710ouopiz0a = new ConcurrentHashMap<>();
   private static volatile int Xqedii_233qqjw2c4hfu = 1744696503;
   private static volatile int Xqedii_qo9te9q1dd11 = -786543060;
   private static volatile int Xqedii_1m1vfwb232wbw = -1460620856;
   private static volatile int Xqedii_j3ll9c6ds3pi = 664272836;
   private static volatile long Xqedii_2amm03vel0dy2 = -4218089141480548108L;
   private static volatile long Xqedii_3cgb4g2y6z7do = -8015412731393984413L;
   private static volatile long Xqedii_29iw2g1cq8d65 = -6974975009668990130L;
   private static volatile long Xqedii_1ocr63m61hmeo = -2663863576083083425L;

   public static int Xqedii_eyeo0lsh96ej(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_233qqjw2c4hfu, var1);
   }

   public static int Xqedii_3hb59cs971lly(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_qo9te9q1dd11;
   }

   public static int Xqedii_2kdh6lghqryfi(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1m1vfwb232wbw;
   }

   public static int Xqedii_2lemon9c5m9s5(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_j3ll9c6ds3pi, var1);
   }

   public static long Xqedii_9t5v8xgqmiyq(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2amm03vel0dy2, var2);
   }

   public static long Xqedii_1v51e1ydye8k5(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3cgb4g2y6z7do;
   }

   public static long Xqedii_3ee3ckdz6pv40(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_29iw2g1cq8d65;
   }

   public static long Xqedii_3gfqifc43bjoe(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1ocr63m61hmeo, var2);
   }

   public static String Xqedii_3vao8hav0jomk(String var0) {
      String var1 = Xqedii_b710ouopiz0a.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("/f29moFaR7xH1q0F244v2Uk8o1iRvBHEQGhS96gNU9A=");
            int var3 = 594517918;

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
            String var9 = Xqedii_b710ouopiz0a.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_ndedibjb9o6v() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2m9aayeg5jnvy() {
   }

   private static int Xqedii_1n84yv7oy7iii(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_c3l8vnjt4d8h(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
