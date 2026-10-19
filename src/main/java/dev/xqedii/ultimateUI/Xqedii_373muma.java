package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_373muma {
   private static final ConcurrentHashMap<String, String> Xqedii_232e4x42x1a0n = new ConcurrentHashMap<>();
   private static volatile int Xqedii_8hj7a3oget8a = -340425328;
   private static volatile int Xqedii_1gmmahtog26kc = 1743361587;
   private static volatile int Xqedii_241zu0qzjz0wp = -1725294453;
   private static volatile int Xqedii_2dp3j1rnlfwuw = -358951802;
   private static volatile long Xqedii_3tkdvasb2efnn = 8388308317611465382L;
   private static volatile long Xqedii_951gfh0az1c9 = 7375854470584192775L;
   private static volatile long Xqedii_3t7lqnw4bs7v = 8120113114765977214L;
   private static volatile long Xqedii_2o2dhx745lzx3 = -2547746150621449407L;

   public static int Xqedii_112hxxyfxwe14(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_8hj7a3oget8a, var1);
   }

   public static int Xqedii_cf5on53o77vi(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1gmmahtog26kc;
   }

   public static int Xqedii_gtyyy2g6639k(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_241zu0qzjz0wp;
   }

   public static int Xqedii_1gginu5udtp4q(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2dp3j1rnlfwuw, var1);
   }

   public static long Xqedii_zy0de8f6n56p(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3tkdvasb2efnn, var2);
   }

   public static long Xqedii_2rfbjnholf23i(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_951gfh0az1c9;
   }

   public static long Xqedii_33d4mb2h9bxmh(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3t7lqnw4bs7v;
   }

   public static long Xqedii_2chdlboow46eq(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2o2dhx745lzx3, var2);
   }

   public static String Xqedii_3up9nqwy505ub(String var0) {
      String var1 = Xqedii_232e4x42x1a0n.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("uGdnhkF6sUwkicgLH9mmeWTTD5x11V7gfXOXEO2cE4E=");
            int var3 = -1494506523;

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
            String var9 = Xqedii_232e4x42x1a0n.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2znkuhzubiqwj() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_eps167yc9ex4() {
   }

   private static int Xqedii_qezcmovsj64h(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2i2ozxxg8u6v(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
