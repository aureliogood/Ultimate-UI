package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_20ef81w {
   private static final ConcurrentHashMap<String, String> Xqedii_2zgdospkbix46 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2upqf3ft60tx0 = 109525016;
   private static volatile int Xqedii_2cqh48vytqizu = -468199576;
   private static volatile int Xqedii_3h0u8h64yt5u9 = 520181347;
   private static volatile int Xqedii_2qj2ix51f7gl = 700970366;
   private static volatile long Xqedii_2v86qmg0qp5p2 = 7238640324855078711L;
   private static volatile long Xqedii_2uwkfvfwoytww = 7726629964232289046L;
   private static volatile long Xqedii_3cw83hqjvmgf8 = -5837523148191835679L;
   private static volatile long Xqedii_1rwkat85zlmgv = 8769137011498576945L;

   public static int Xqedii_1tpscy7jibpys(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2upqf3ft60tx0, var1);
   }

   public static int Xqedii_3moiklhrhdse1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2cqh48vytqizu;
   }

   public static int Xqedii_3mfa6a1bt7ytf(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3h0u8h64yt5u9;
   }

   public static int Xqedii_bk39excixsgx(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2qj2ix51f7gl, var1);
   }

   public static long Xqedii_2zyt0s6oe4qkb(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2v86qmg0qp5p2, var2);
   }

   public static long Xqedii_351ho5plv85cu(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2uwkfvfwoytww;
   }

   public static long Xqedii_3gius9im22e41(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3cw83hqjvmgf8;
   }

   public static long Xqedii_hq086cq2yusa(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1rwkat85zlmgv, var2);
   }

   public static String Xqedii_1aq6ghlygecy5(String var0) {
      String var1 = Xqedii_2zgdospkbix46.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("OCnCOgMTRyGEPTeOPHI2dTMKl8WIRonOJ726MdQkiK0=");
            int var3 = 1626635317;

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
            String var9 = Xqedii_2zgdospkbix46.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2mfuj65tkznqe() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1itf1jz193u0u() {
   }

   private static int Xqedii_2ziugyj6f41u5(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3mqljkfmwhf1p(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
