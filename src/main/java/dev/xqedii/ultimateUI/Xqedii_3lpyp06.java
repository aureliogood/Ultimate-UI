package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3lpyp06 {
   private static final ConcurrentHashMap<String, String> Xqedii_23a90lzc374gu = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2e0wrlhlyegkf = 2028688706;
   private static volatile int Xqedii_37c1cmrh7uv26 = 252901938;
   private static volatile int Xqedii_4gsjjlvc9gmm = 770052141;
   private static volatile int Xqedii_ek88lrfi2i2f = -1007140062;
   private static volatile long Xqedii_239bnsc6otoj6 = -7147668122500101586L;
   private static volatile long Xqedii_1p7nt84uxw246 = 9139970271944282750L;
   private static volatile long Xqedii_vbnzyy1lrbr = 3921336576366168805L;
   private static volatile long Xqedii_342etyk9ppr1e = 7201494034088176348L;

   public static int Xqedii_1e9hzw9dwp5o7(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2e0wrlhlyegkf, var1);
   }

   public static int Xqedii_5kgbxaonsgpv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_37c1cmrh7uv26;
   }

   public static int Xqedii_2hha2qnfrnd4q(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_4gsjjlvc9gmm;
   }

   public static int Xqedii_w8s1sscm9zoq(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_ek88lrfi2i2f, var1);
   }

   public static long Xqedii_2e5c8npkh2n8x(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_239bnsc6otoj6, var2);
   }

   public static long Xqedii_2t4yyzjxmg4y8(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1p7nt84uxw246;
   }

   public static long Xqedii_2calcw4wpnorb(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_vbnzyy1lrbr;
   }

   public static long Xqedii_seuk8kbddpsd(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_342etyk9ppr1e, var2);
   }

   public static String Xqedii_1v6zoa0azjk8p(String var0) {
      String var1 = Xqedii_23a90lzc374gu.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("jh46ZOWSTjnJASfioJE+MnKK+Wo6QkqsMXxAKMaST+g=");
            int var3 = -1289531963;

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
            String var9 = Xqedii_23a90lzc374gu.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2td3po2atgpst() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_ch27mjfzmi79() {
   }

   private static int Xqedii_vzurgx2gix00(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3k006xqzn8qox(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
