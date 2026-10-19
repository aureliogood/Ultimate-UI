package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1vvlmnj {
   private static final ConcurrentHashMap<String, String> Xqedii_1jo282bs3k0wc = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2kby9l4mzllvp = -308188026;
   private static volatile int Xqedii_vo69oud1ojdd = -506451948;
   private static volatile int Xqedii_mt96exzhl4oe = 992782966;
   private static volatile int Xqedii_1mof7sy71vo17 = 1864338312;
   private static volatile long Xqedii_1gscexevo5oc8 = -691778798747140223L;
   private static volatile long Xqedii_1p70yhbp2ro85 = -4817891939351879773L;
   private static volatile long Xqedii_2lyvi3cbx5qrw = 5821939697105992619L;
   private static volatile long Xqedii_auqg1g8a5qwb = -2722273865355723419L;

   public static int Xqedii_1lm5e6xpx979g(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2kby9l4mzllvp, var1);
   }

   public static int Xqedii_2pzkzz7p02xlc(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_vo69oud1ojdd;
   }

   public static int Xqedii_3qcksy94ajq07(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_mt96exzhl4oe;
   }

   public static int Xqedii_3g1fad9vz8b97(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1mof7sy71vo17, var1);
   }

   public static long Xqedii_3igmywjkyet5d(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1gscexevo5oc8, var2);
   }

   public static long Xqedii_38ivsw0i3a51j(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1p70yhbp2ro85;
   }

   public static long Xqedii_2t8fjf15hgn52(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2lyvi3cbx5qrw;
   }

   public static long Xqedii_30kfcb4jx2t2m(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_auqg1g8a5qwb, var2);
   }

   public static String Xqedii_2pn4301mqfe7o(String var0) {
      String var1 = Xqedii_1jo282bs3k0wc.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("eWxb+HBn5FEF9cLEuyRV9/rfZ7GOHmHWdAUlgc0yDZE=");
            int var3 = 1672580434;

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
            String var9 = Xqedii_1jo282bs3k0wc.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3leeob809jymu() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3pcz1v2nq5346() {
   }

   private static int Xqedii_vgpkuk0ajsw3(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_197lhc5quovg6(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
