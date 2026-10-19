package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3tsww8g {
   private static final ConcurrentHashMap<String, String> Xqedii_1wxcsoxlra6k0 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_241kcih1q3y20 = -1002941970;
   private static volatile int Xqedii_28sf9q1gf3jjr = -1574497194;
   private static volatile int Xqedii_1milk3678mgya = 728657453;
   private static volatile int Xqedii_1fw94yvmf06gr = -92774842;
   private static volatile long Xqedii_2uzqzfklo953w = 6828058042957131457L;
   private static volatile long Xqedii_heaod989vrit = 1328565171395216799L;
   private static volatile long Xqedii_3dqcr6z2b28qs = 6595621002860893347L;
   private static volatile long Xqedii_2rusgau1hlmzc = -4457590246977244700L;

   public static int Xqedii_1li5zldk5jwsp(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_241kcih1q3y20, var1);
   }

   public static int Xqedii_3r3eig3nrnsrg(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_28sf9q1gf3jjr;
   }

   public static int Xqedii_g6ruzvskka9g(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1milk3678mgya;
   }

   public static int Xqedii_2lvza0zqgbwq6(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1fw94yvmf06gr, var1);
   }

   public static long Xqedii_12easi050s0wf(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2uzqzfklo953w, var2);
   }

   public static long Xqedii_2igmreaopxmir(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_heaod989vrit;
   }

   public static long Xqedii_1pczhaes0ar6w(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3dqcr6z2b28qs;
   }

   public static long Xqedii_3ntj446cfjc1c(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2rusgau1hlmzc, var2);
   }

   public static String Xqedii_2kd4fkcq3e1k5(String var0) {
      String var1 = Xqedii_1wxcsoxlra6k0.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("qO3ZN2owAyqBzuLKJEvTPL+1D27jLbN+/xfH1ztZuNc=");
            int var3 = -2134355313;

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
            String var9 = Xqedii_1wxcsoxlra6k0.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_ba0ly9qfbnd3() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_r93hu2rkdz8h() {
   }

   private static int Xqedii_tg7lu63aci5(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3f63c7xs16wu2(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
