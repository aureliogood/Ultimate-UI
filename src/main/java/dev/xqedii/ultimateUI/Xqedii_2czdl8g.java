package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2czdl8g {
   private static final ConcurrentHashMap<String, String> Xqedii_2zlpid909meyo = new ConcurrentHashMap<>();
   private static volatile int Xqedii_9ad2dkd2ngxa = 1932856676;
   private static volatile int Xqedii_3a968qul7njqu = -1426900189;
   private static volatile int Xqedii_2qgm18y7owjqs = 1904099241;
   private static volatile int Xqedii_1297224975e46 = 759789781;
   private static volatile long Xqedii_38h85kx1xk2p5 = 3515860124671143826L;
   private static volatile long Xqedii_hvtk6rtl0a71 = 4991455934569827394L;
   private static volatile long Xqedii_1q7tm9j6enfz6 = -1798584157665245496L;
   private static volatile long Xqedii_vftf9en0bv9n = 5363887101278325665L;

   public static int Xqedii_3rnhcczpqrxqv(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_9ad2dkd2ngxa, var1);
   }

   public static int Xqedii_flugiaqvm3pu(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3a968qul7njqu;
   }

   public static int Xqedii_107nk5pzqqmoa(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2qgm18y7owjqs;
   }

   public static int Xqedii_2sagpwczeisyt(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1297224975e46, var1);
   }

   public static long Xqedii_n90ib0nqqwhc(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_38h85kx1xk2p5, var2);
   }

   public static long Xqedii_19z032heaufp(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_hvtk6rtl0a71;
   }

   public static long Xqedii_1zky38y9eo4ae(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1q7tm9j6enfz6;
   }

   public static long Xqedii_dex8thhhvr63(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_vftf9en0bv9n, var2);
   }

   public static String Xqedii_1h5m79bptl9bh(String var0) {
      String var1 = Xqedii_2zlpid909meyo.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("JX0IalDYr6vyQ5npAEH9QqGY4Ra4Si4oAIkUsYRxhiE=");
            int var3 = -1241450367;

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
            String var9 = Xqedii_2zlpid909meyo.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1rumo6juq42t1() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_qtwzkh0bgm8u() {
   }

   private static int Xqedii_164kik4fjjk5a(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3q7exq2t0hbs1(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
