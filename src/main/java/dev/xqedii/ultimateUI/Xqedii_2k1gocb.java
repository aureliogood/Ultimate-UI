package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2k1gocb {
   private static final ConcurrentHashMap<String, String> Xqedii_2aoqsqwgim3nn = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3hwo4c4lvts80 = -897283024;
   private static volatile int Xqedii_1nc7qf98fdnxt = -1963756145;
   private static volatile int Xqedii_lj1r0zkkh3pt = 1346810899;
   private static volatile int Xqedii_628if01r463p = -267007174;
   private static volatile long Xqedii_1zh3uzj8n6e7z = -2646716585268647757L;
   private static volatile long Xqedii_jk35eu2cwqan = -2127524403168869574L;
   private static volatile long Xqedii_382wy9fsj2c9h = 2875282326316132067L;
   private static volatile long Xqedii_1larez0cxdus2 = 185399306823537205L;

   public static int Xqedii_2829590fsnlyq(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3hwo4c4lvts80, var1);
   }

   public static int Xqedii_2ummd44y7fzl8(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1nc7qf98fdnxt;
   }

   public static int Xqedii_1rp8dp5axtkae(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_lj1r0zkkh3pt;
   }

   public static int Xqedii_11xmga3udzpu6(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_628if01r463p, var1);
   }

   public static long Xqedii_1llk4cfc64pj(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1zh3uzj8n6e7z, var2);
   }

   public static long Xqedii_3ov2d3h3t7w7y(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_jk35eu2cwqan;
   }

   public static long Xqedii_1abb47kl4z2mk(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_382wy9fsj2c9h;
   }

   public static long Xqedii_2fpl19tkpjhlm(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1larez0cxdus2, var2);
   }

   public static String Xqedii_13k9qp3cbgidp(String var0) {
      String var1 = Xqedii_2aoqsqwgim3nn.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("sJtmgjNcOY3VL1bPrsCR1iuMzfSLL6DWVARyKroh7LM=");
            int var3 = -890672404;

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
            String var9 = Xqedii_2aoqsqwgim3nn.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_y3vtgri1kbg7() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3taruvyngovbm() {
   }

   private static int Xqedii_2ba7c8xp7c8e1(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_18h2mjy6zgtq8(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
