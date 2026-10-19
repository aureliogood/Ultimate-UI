package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1yz8dcn {
   private static final ConcurrentHashMap<String, String> Xqedii_1f8eryyxez1xj = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1pm2c4djx9zob = 1111466069;
   private static volatile int Xqedii_3n4wco4uj8dgc = 1473662642;
   private static volatile int Xqedii_2ct6i8uucv0yg = -1449078916;
   private static volatile int Xqedii_2wq2q7qumbkhx = -2070297090;
   private static volatile long Xqedii_158be8u7117xi = -6945426133654058480L;
   private static volatile long Xqedii_2zoxc06aj1x17 = 7415104808911312823L;
   private static volatile long Xqedii_3twx6551p3jle = -56108686243923175L;
   private static volatile long Xqedii_1nynejzbu6di7 = -97927482091375193L;

   public static int Xqedii_tke6w2p1e040(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1pm2c4djx9zob, var1);
   }

   public static int Xqedii_1yn4al1oc8z1r(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3n4wco4uj8dgc;
   }

   public static int Xqedii_1kcxereztfk5z(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2ct6i8uucv0yg;
   }

   public static int Xqedii_3kmzwbn92ryb0(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2wq2q7qumbkhx, var1);
   }

   public static long Xqedii_3835kimmqbms7(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_158be8u7117xi, var2);
   }

   public static long Xqedii_om8o25x4cx9s(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2zoxc06aj1x17;
   }

   public static long Xqedii_33183dwlcdqo0(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3twx6551p3jle;
   }

   public static long Xqedii_1h1btdnrdn40x(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1nynejzbu6di7, var2);
   }

   public static String Xqedii_2t43o2xa0t1qa(String var0) {
      String var1 = Xqedii_1f8eryyxez1xj.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("P5PHlL4+C4UVCeZOliGd5f4mG2YTq2MShZJ3e9wnwFw=");
            int var3 = 854307792;

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
            String var9 = Xqedii_1f8eryyxez1xj.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1tqbzcc9ommj9() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3rl3u22rbqyv0() {
   }

   private static int Xqedii_27pms12m6d44m(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3ca8m9ua2ejzs(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
