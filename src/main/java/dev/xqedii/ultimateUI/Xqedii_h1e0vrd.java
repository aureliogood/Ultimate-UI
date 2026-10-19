package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_h1e0vrd {
   private static final ConcurrentHashMap<String, String> Xqedii_1pw6adzw1z4vp = new ConcurrentHashMap<>();
   private static volatile int Xqedii_131yxxc2u9g01 = -1956532557;
   private static volatile int Xqedii_2wadcu162cukb = 1340613466;
   private static volatile int Xqedii_ufl35gmihe8x = -1635725513;
   private static volatile int Xqedii_133aw3mjx3xw5 = -1531684408;
   private static volatile long Xqedii_g3won9d8oj5n = 1599396673836238903L;
   private static volatile long Xqedii_yaoothdbw2vd = -1081172530494248674L;
   private static volatile long Xqedii_ms9c3v0xvj5d = 2532969818319977679L;
   private static volatile long Xqedii_1tsyqyirf8b6h = 6524370634778422541L;

   public static int Xqedii_3m99vmxc44xn2(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_131yxxc2u9g01, var1);
   }

   public static int Xqedii_3htho3j5hwsus(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2wadcu162cukb;
   }

   public static int Xqedii_24k7kyo6smg6a(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_ufl35gmihe8x;
   }

   public static int Xqedii_2f1strh4ar04b(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_133aw3mjx3xw5, var1);
   }

   public static long Xqedii_3mcjoz73eamec(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_g3won9d8oj5n, var2);
   }

   public static long Xqedii_2fanvtpu6spop(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_yaoothdbw2vd;
   }

   public static long Xqedii_380xs6blwj3re(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_ms9c3v0xvj5d;
   }

   public static long Xqedii_2z09naxj3b94z(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1tsyqyirf8b6h, var2);
   }

   public static String Xqedii_1oe2xbgswa2kq(String var0) {
      String var1 = Xqedii_1pw6adzw1z4vp.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("hMM/G3iJ8ONlcfuinqgEyboIacy2QcVHQI/u//oVE3M=");
            int var3 = -542708599;

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
            String var9 = Xqedii_1pw6adzw1z4vp.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_e2qhu3345sc6() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2usto0yxycoa8() {
   }

   private static int Xqedii_m97i3mha9csi(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1s6v1lscmuqlt(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
