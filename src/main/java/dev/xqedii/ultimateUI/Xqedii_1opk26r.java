package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1opk26r {
   private static final ConcurrentHashMap<String, String> Xqedii_3fzexubckp8ky = new ConcurrentHashMap<>();
   private static volatile int Xqedii_29sum07subexc = 1327371295;
   private static volatile int Xqedii_3jnhq6v1c90wh = -410916199;
   private static volatile int Xqedii_l3hgyfakyww8 = 946283915;
   private static volatile int Xqedii_3gcq62v1i7hiw = 1100655965;
   private static volatile long Xqedii_1ldbq9mel52jt = -2644084298200531447L;
   private static volatile long Xqedii_nnk3ukhdujs7 = 6159204378667805808L;
   private static volatile long Xqedii_hlj1qljzt0wb = 3954763783772679246L;
   private static volatile long Xqedii_20n8wuozv7ugy = -7852485150274020618L;

   public static int Xqedii_1vjzntna7k51h(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_29sum07subexc, var1);
   }

   public static int Xqedii_30c2deaqzb3vm(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3jnhq6v1c90wh;
   }

   public static int Xqedii_1hmdbhhu1588k(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_l3hgyfakyww8;
   }

   public static int Xqedii_1hbpr0p7a6gwq(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3gcq62v1i7hiw, var1);
   }

   public static long Xqedii_39fkgq0j54s81(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1ldbq9mel52jt, var2);
   }

   public static long Xqedii_20ppl3b63vi2q(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_nnk3ukhdujs7;
   }

   public static long Xqedii_1isp25aalsmw1(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_hlj1qljzt0wb;
   }

   public static long Xqedii_1gq3zeap1delr(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_20n8wuozv7ugy, var2);
   }

   public static String Xqedii_au9fp68tlkd4(String var0) {
      String var1 = Xqedii_3fzexubckp8ky.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("9Fzr7euL5eapN+lx1t4nVEjkgCTy/U9P6qAgbNdmwRE=");
            int var3 = 1406674740;

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
            String var9 = Xqedii_3fzexubckp8ky.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1ak7q2u3u2g7() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_igpn7ervfhmy() {
   }

   private static int Xqedii_352a9806qdc5v(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2504lakz5o8hd(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
