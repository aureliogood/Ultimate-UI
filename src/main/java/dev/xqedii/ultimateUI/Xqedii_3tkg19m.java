package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3tkg19m {
   private static final ConcurrentHashMap<String, String> Xqedii_3ouqzegaszs3d = new ConcurrentHashMap<>();
   private static volatile int Xqedii_39f421gxeancp = 684529036;
   private static volatile int Xqedii_2cuq0z4zwivmp = 1951340087;
   private static volatile int Xqedii_xl386k7jmdy = -158684304;
   private static volatile int Xqedii_38pz699e7z9ta = -1413592754;
   private static volatile long Xqedii_1sbp2w4vaxu5x = 3172775963197273206L;
   private static volatile long Xqedii_1cpcjfb5pt3zi = 7713443838510923575L;
   private static volatile long Xqedii_xdiprc3eglrk = 881549194584746261L;
   private static volatile long Xqedii_1ewf7fvbaq6h = 7520124242680502188L;

   public static int Xqedii_eyjo0ouxyer6(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_39f421gxeancp, var1);
   }

   public static int Xqedii_3bobx1j3kzr7k(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2cuq0z4zwivmp;
   }

   public static int Xqedii_1rjufq9yp4sdk(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_xl386k7jmdy;
   }

   public static int Xqedii_1vgn2v1j4no1l(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_38pz699e7z9ta, var1);
   }

   public static long Xqedii_19tusy18xd1gb(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1sbp2w4vaxu5x, var2);
   }

   public static long Xqedii_10dnzl82o2dpi(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1cpcjfb5pt3zi;
   }

   public static long Xqedii_4un7ute5109k(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_xdiprc3eglrk;
   }

   public static long Xqedii_1o9ih8gj2my45(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1ewf7fvbaq6h, var2);
   }

   public static String Xqedii_3birnq1sv4buz(String var0) {
      String var1 = Xqedii_3ouqzegaszs3d.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("nkj14D2zlLw9NUdwkNqvIeKz7qMB0uCjYuj0bwDa3gM=");
            int var3 = -233966371;

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
            String var9 = Xqedii_3ouqzegaszs3d.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1m5tmkb6bx8dx() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3at5kykolbr4l() {
   }

   private static int Xqedii_2j06rbhqd57rk(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3e564xemay7j6(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
