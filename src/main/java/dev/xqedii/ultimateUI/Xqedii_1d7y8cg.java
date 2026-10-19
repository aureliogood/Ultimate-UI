package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1d7y8cg {
   private static final ConcurrentHashMap<String, String> Xqedii_2xvbdhjualfsk = new ConcurrentHashMap<>();
   private static volatile int Xqedii_22z5rysaiqnqy = 2016548398;
   private static volatile int Xqedii_f00c0zlimfrj = 370376655;
   private static volatile int Xqedii_1fleru1wmxumw = 48487617;
   private static volatile int Xqedii_cyy9vqlcwelc = -1760551869;
   private static volatile long Xqedii_3vzwqx4zo8xm4 = 6490833204469132409L;
   private static volatile long Xqedii_1dalvtqhqu7dq = -2778033863568178965L;
   private static volatile long Xqedii_3uxyfiqimbrrl = -5098610884170001632L;
   private static volatile long Xqedii_15ap32fzzzhaf = 6472461224904150885L;

   public static int Xqedii_ys28qrymz9tj(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_22z5rysaiqnqy, var1);
   }

   public static int Xqedii_1nc7zchh08zjk(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_f00c0zlimfrj;
   }

   public static int Xqedii_3vswx95hhtehx(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1fleru1wmxumw;
   }

   public static int Xqedii_39xfafatf754t(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_cyy9vqlcwelc, var1);
   }

   public static long Xqedii_1u6jcr130648f(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3vzwqx4zo8xm4, var2);
   }

   public static long Xqedii_88mkjjpvagio(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1dalvtqhqu7dq;
   }

   public static long Xqedii_2ypstf8t8y9zn(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3uxyfiqimbrrl;
   }

   public static long Xqedii_rdws7rupvi64(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_15ap32fzzzhaf, var2);
   }

   public static String Xqedii_1bj3azgglt626(String var0) {
      String var1 = Xqedii_2xvbdhjualfsk.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("KpuTNn3vP6vBjaZatcY2oCfP6gUklpnHtkvVRDNTUWs=");
            int var3 = -429988842;

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
            String var9 = Xqedii_2xvbdhjualfsk.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3lumwawnsec1w() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1wk9vjmun0tv3() {
   }

   private static int Xqedii_1y8m7qst3nvyo(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2im526cnteqml(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
