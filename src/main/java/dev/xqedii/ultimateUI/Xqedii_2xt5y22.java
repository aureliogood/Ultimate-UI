package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2xt5y22 {
   private static final ConcurrentHashMap<String, String> Xqedii_2swblr5d1wb2v = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1q0zcmxfb4w7a = 727446164;
   private static volatile int Xqedii_2cvr0fpxjcknp = -1023698395;
   private static volatile int Xqedii_3r3t7ax4gf28k = 826465859;
   private static volatile int Xqedii_3fah52mhmwyv3 = 1832695476;
   private static volatile long Xqedii_2h3k8ojdeg58y = -3407528741662493517L;
   private static volatile long Xqedii_2ym5ya8qb8dvq = -4587383538306538879L;
   private static volatile long Xqedii_37vzx9bfii9zg = -5100279311726153158L;
   private static volatile long Xqedii_3myfqm9xxrznh = -286954492780149186L;

   public static int Xqedii_3hoxyroqt8ca7(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1q0zcmxfb4w7a, var1);
   }

   public static int Xqedii_2uqoh0k8iet6p(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2cvr0fpxjcknp;
   }

   public static int Xqedii_xx9ohhklfrqy(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3r3t7ax4gf28k;
   }

   public static int Xqedii_15bnrz8b9kjrj(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3fah52mhmwyv3, var1);
   }

   public static long Xqedii_1qj1xqxvgq2an(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2h3k8ojdeg58y, var2);
   }

   public static long Xqedii_2cltunie61x95(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2ym5ya8qb8dvq;
   }

   public static long Xqedii_241591jpim3qd(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_37vzx9bfii9zg;
   }

   public static long Xqedii_28oslbxgbrxqt(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3myfqm9xxrznh, var2);
   }

   public static String Xqedii_2t3y3j1v1xzn6(String var0) {
      String var1 = Xqedii_2swblr5d1wb2v.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("yRLBrl+m1gm8ytATQYM+0nmdx/KJ1DmeJNmjCUQumgw=");
            int var3 = -1885172557;

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
            String var9 = Xqedii_2swblr5d1wb2v.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_23upqjohair8j() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1ngq0tc6l2kvt() {
   }

   private static int Xqedii_1hwqaa518iffq(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3t2gq4y3s47zk(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
