package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1jrxgxk {
   private static final ConcurrentHashMap<String, String> Xqedii_2xuk2dqeqm0sz = new ConcurrentHashMap<>();
   private static volatile int Xqedii_330jtxyc4c7c0 = -1698978362;
   private static volatile int Xqedii_12mqzv0lappmt = -765355053;
   private static volatile int Xqedii_1g6ge31dpt0fv = -2116049536;
   private static volatile int Xqedii_2sua3ywo45dfb = 170854290;
   private static volatile long Xqedii_5pvc60yvkl05 = 6142805316382752604L;
   private static volatile long Xqedii_gc39mdyvssbn = -8875099506741586832L;
   private static volatile long Xqedii_27n6jlkpkb3x5 = 2983337750337340029L;
   private static volatile long Xqedii_25vx9426qzjbc = -5753178148837484099L;

   public static int Xqedii_21ko1isss5w4k(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_330jtxyc4c7c0, var1);
   }

   public static int Xqedii_2f9ptwwbhaxh1(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_12mqzv0lappmt;
   }

   public static int Xqedii_s1lpaxlvzg4e(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1g6ge31dpt0fv;
   }

   public static int Xqedii_33neo6ow108j4(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2sua3ywo45dfb, var1);
   }

   public static long Xqedii_3vkyohtpxutkf(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_5pvc60yvkl05, var2);
   }

   public static long Xqedii_26qntxs5rv8iy(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_gc39mdyvssbn;
   }

   public static long Xqedii_3d38j3p1k3tr2(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_27n6jlkpkb3x5;
   }

   public static long Xqedii_x8jwnwurqmkv(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_25vx9426qzjbc, var2);
   }

   public static String Xqedii_8h3a3bw9wqi(String var0) {
      String var1 = Xqedii_2xuk2dqeqm0sz.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ku/MF8vbC/O+Bv5Knc9ZBLqKShwPsovKx03pKgbr3L0=");
            int var3 = 1104346410;

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
            String var9 = Xqedii_2xuk2dqeqm0sz.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1qy7h63so71zp() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1gj3gm21gyr8v() {
   }

   private static int Xqedii_3ox6yfuv9aab7(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_38dq8bpc1v76j(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
