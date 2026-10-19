package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1hmu1s7 {
   private static final ConcurrentHashMap<String, String> Xqedii_2er3atook56oo = new ConcurrentHashMap<>();
   private static volatile int Xqedii_995cob55ug9x = 866095466;
   private static volatile int Xqedii_2jhe2ink8ubgj = 710723417;
   private static volatile int Xqedii_13zy5ltzj4zmc = 1698968616;
   private static volatile int Xqedii_bbbfr253rks0 = -881340984;
   private static volatile long Xqedii_12htdv3pdqlv0 = -3384075505304820280L;
   private static volatile long Xqedii_182d90yutxfqq = -1935861304640568449L;
   private static volatile long Xqedii_1mkwm3g1qzpoz = 1340927882545327454L;
   private static volatile long Xqedii_15kqkm15lkwcl = 342107395368700513L;

   public static int Xqedii_3adxuzwxymmol(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_995cob55ug9x, var1);
   }

   public static int Xqedii_cjlxptp0bnuq(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2jhe2ink8ubgj;
   }

   public static int Xqedii_34k3gl81we56q(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_13zy5ltzj4zmc;
   }

   public static int Xqedii_2j612lcdgi6if(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_bbbfr253rks0, var1);
   }

   public static long Xqedii_3jmucozs0lqwn(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_12htdv3pdqlv0, var2);
   }

   public static long Xqedii_jif00kow9yjy(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_182d90yutxfqq;
   }

   public static long Xqedii_r9w81ranru1p(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1mkwm3g1qzpoz;
   }

   public static long Xqedii_1eq22b44nj6ws(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_15kqkm15lkwcl, var2);
   }

   public static String Xqedii_1qda0ogt3lgcu(String var0) {
      String var1 = Xqedii_2er3atook56oo.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("otzsTXVZPWLEFaExq4Zqyxo8wQ6soMAwiTJU6o114TU=");
            int var3 = -788269915;

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
            String var9 = Xqedii_2er3atook56oo.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1x08y7vc6xmjp() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3f1c062acjpnr() {
   }

   private static int Xqedii_2f436wcd1zyja(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2rzswql9lgzxf(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
