package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1dzb6sa {
   private static final ConcurrentHashMap<String, String> Xqedii_39gvk4dmxqn0z = new ConcurrentHashMap<>();
   private static volatile int Xqedii_364qic7kh948r = 468129702;
   private static volatile int Xqedii_jireyckhj96h = -1440602384;
   private static volatile int Xqedii_crzjukpsonnd = -1117134558;
   private static volatile int Xqedii_1ylbosi2aymfz = 1119479120;
   private static volatile long Xqedii_plbx1r4ict8y = -307925513900778771L;
   private static volatile long Xqedii_8qgh8lixn1bs = -4892205541362050000L;
   private static volatile long Xqedii_5fn3ecnhyfkh = 6661578457533514312L;
   private static volatile long Xqedii_22k817cyk2ix9 = 9114189040968690133L;

   public static int Xqedii_2u9hza0gc4r46(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_364qic7kh948r, var1);
   }

   public static int Xqedii_36a5iq9gdhvw3(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_jireyckhj96h;
   }

   public static int Xqedii_1z2fh00250m2q(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_crzjukpsonnd;
   }

   public static int Xqedii_h9mzgekne2vg(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1ylbosi2aymfz, var1);
   }

   public static long Xqedii_1cto0t5znsqmi(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_plbx1r4ict8y, var2);
   }

   public static long Xqedii_us2t0t8z4732(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_8qgh8lixn1bs;
   }

   public static long Xqedii_2ki6frkj72tuc(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_5fn3ecnhyfkh;
   }

   public static long Xqedii_23iljta2phwj1(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_22k817cyk2ix9, var2);
   }

   public static String Xqedii_2c6rse1kipb3m(String var0) {
      String var1 = Xqedii_39gvk4dmxqn0z.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("CtrBZZ/K+Rx4ULor1jLFiFgU9cu1+Muq2L8OULklMig=");
            int var3 = 1109967749;

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
            String var9 = Xqedii_39gvk4dmxqn0z.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_jftrhrvpdqzf() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_777lvznsuvxb() {
   }

   private static int Xqedii_3giustw6si1ef(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3o9r8935ggwnw(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
