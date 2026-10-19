package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_oocbr1k {
   private static final ConcurrentHashMap<String, String> Xqedii_1hf9kcl0qp3fb = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3g7jfe28m6rlb = 1900274090;
   private static volatile int Xqedii_30g6nxolptjct = -809674898;
   private static volatile int Xqedii_uylimkxt80mu = 783691440;
   private static volatile int Xqedii_1zcwqcvca6ihf = -1675753529;
   private static volatile long Xqedii_2sctifs0ozp0y = 2553720372287376110L;
   private static volatile long Xqedii_fc2cui4exmcq = 5724867974491822051L;
   private static volatile long Xqedii_l8y458d5e1su = -1079008631167973499L;
   private static volatile long Xqedii_ihym7crjwjfb = 4646011950815080493L;

   public static int Xqedii_26gjsr35llv3b(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3g7jfe28m6rlb, var1);
   }

   public static int Xqedii_2ae5wsudgskgu(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_30g6nxolptjct;
   }

   public static int Xqedii_2t9qgmoj3lczt(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_uylimkxt80mu;
   }

   public static int Xqedii_3owlg25h24alp(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1zcwqcvca6ihf, var1);
   }

   public static long Xqedii_uxzmibm829xi(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2sctifs0ozp0y, var2);
   }

   public static long Xqedii_p4fn9eongsxz(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_fc2cui4exmcq;
   }

   public static long Xqedii_3vrtdk9n39wdy(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_l8y458d5e1su;
   }

   public static long Xqedii_29yct32q0ieqb(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_ihym7crjwjfb, var2);
   }

   public static String Xqedii_ovjnd6p7rlb3(String var0) {
      String var1 = Xqedii_1hf9kcl0qp3fb.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("mcz6x1oOUdG41VhVUF7nV7NE+1NXmbHCgsHRvl7wmUM=");
            int var3 = 676280964;

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
            String var9 = Xqedii_1hf9kcl0qp3fb.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_14yslbngy9a16() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2d018fwoboclk() {
   }

   private static int Xqedii_2p8tmvpyvixt1(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1yiap15sgzgzv(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
