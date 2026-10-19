package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_nzgx240 {
   private static final ConcurrentHashMap<String, String> Xqedii_g06gnhi1n8ig = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2oa3l1vxawhei = -1532006058;
   private static volatile int Xqedii_hdedyeaptmsq = -2070906442;
   private static volatile int Xqedii_30apa3jjmgu9w = 1206016529;
   private static volatile int Xqedii_m8zr2i5invvt = 2011855571;
   private static volatile long Xqedii_l53eajglwdx0 = 9064026155086064361L;
   private static volatile long Xqedii_j3m6pcpdhhqv = -354561990794017953L;
   private static volatile long Xqedii_14vei65j1vmh4 = -2499213847372538882L;
   private static volatile long Xqedii_35seug819jp08 = 4319545594237592155L;

   public static int Xqedii_1l9pvorhwr3yn(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2oa3l1vxawhei, var1);
   }

   public static int Xqedii_2156t7l5q95ks(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_hdedyeaptmsq;
   }

   public static int Xqedii_2uy9p1ux1eymy(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_30apa3jjmgu9w;
   }

   public static int Xqedii_10abivb4w67i7(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_m8zr2i5invvt, var1);
   }

   public static long Xqedii_3d1sp8nb8d955(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_l53eajglwdx0, var2);
   }

   public static long Xqedii_3vwjqwjod6ene(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_j3m6pcpdhhqv;
   }

   public static long Xqedii_2n4qvvxgs3qd3(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_14vei65j1vmh4;
   }

   public static long Xqedii_82sp3tfyuacx(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_35seug819jp08, var2);
   }

   public static String Xqedii_3kqbdzqgifmw9(String var0) {
      String var1 = Xqedii_g06gnhi1n8ig.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("+D/C6AAazChcBnHGm0rdwyLgdbrkOl7uZtRhLtgyvp0=");
            int var3 = 167525833;

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
            String var9 = Xqedii_g06gnhi1n8ig.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2onyqskamlp0v() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_33szaw2fr85sx() {
   }

   private static int Xqedii_14bsec9l68qqp(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2hkzntokmrnlg(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
