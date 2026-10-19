package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2qq6n25 {
   private static final ConcurrentHashMap<String, String> Xqedii_1t94mv0gg9y7e = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3bxbmmuiu8s9i = -266781177;
   private static volatile int Xqedii_2dcp89c9wi5aq = -1599166468;
   private static volatile int Xqedii_2qagzr32bsxog = 1661303090;
   private static volatile int Xqedii_1gq9l2kwjr3qd = -1959934051;
   private static volatile long Xqedii_1exqzazcc7918 = 2187283388756732390L;
   private static volatile long Xqedii_3vnobi8dwu867 = 8665990006777923995L;
   private static volatile long Xqedii_3df267o1b527e = 6887260055119683782L;
   private static volatile long Xqedii_3ouj9wzs4894 = 8081679910831127528L;

   public static int Xqedii_1tz5uc6b50ub9(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3bxbmmuiu8s9i, var1);
   }

   public static int Xqedii_2j7h5ni7ag0zu(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2dcp89c9wi5aq;
   }

   public static int Xqedii_g4sy6f69tb4g(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2qagzr32bsxog;
   }

   public static int Xqedii_3ubvzea9hwmka(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1gq9l2kwjr3qd, var1);
   }

   public static long Xqedii_2zvda2wvycjbc(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1exqzazcc7918, var2);
   }

   public static long Xqedii_2i4cvspnf90e2(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3vnobi8dwu867;
   }

   public static long Xqedii_1agakuuim0t26(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3df267o1b527e;
   }

   public static long Xqedii_11t9ek9gflhl2(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3ouj9wzs4894, var2);
   }

   public static String Xqedii_3b8qtadi3pbdy(String var0) {
      String var1 = Xqedii_1t94mv0gg9y7e.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("8lSw2HhH3Yz0oFznr/o1ejUY34D3a5Xo2dDTy5D8l7w=");
            int var3 = -117891132;

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
            String var9 = Xqedii_1t94mv0gg9y7e.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2yjk7czwo80vi() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_17ct7hw4amvfe() {
   }

   private static int Xqedii_281hpq7m55gne(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_mttuuotn0jca(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
