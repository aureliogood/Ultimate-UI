package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1u9l425 {
   private static final ConcurrentHashMap<String, String> Xqedii_25ptltvdymcu7 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_m92o8r6k2ork = 1067978694;
   private static volatile int Xqedii_2vskxh2y0fg8e = -1382597038;
   private static volatile int Xqedii_33ol6z2yv8p7p = 804519551;
   private static volatile int Xqedii_24ptkacbw7vcr = 200476488;
   private static volatile long Xqedii_2gpvudq797d1a = -836494391703545224L;
   private static volatile long Xqedii_18c277wzoj7eu = 6021810462729140768L;
   private static volatile long Xqedii_10g60e34bre7m = 5859380359654036897L;
   private static volatile long Xqedii_2olw5adlxbemj = -8536456627880340930L;

   public static int Xqedii_25tp5jh638c3p(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_m92o8r6k2ork, var1);
   }

   public static int Xqedii_1ltng9189kcbd(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2vskxh2y0fg8e;
   }

   public static int Xqedii_3qbq6xtaldgxg(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_33ol6z2yv8p7p;
   }

   public static int Xqedii_1d1j945ygxw5p(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_24ptkacbw7vcr, var1);
   }

   public static long Xqedii_2rawyss6wonfi(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2gpvudq797d1a, var2);
   }

   public static long Xqedii_pv284yb2lbe4(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_18c277wzoj7eu;
   }

   public static long Xqedii_74uxgac8jozl(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_10g60e34bre7m;
   }

   public static long Xqedii_1yk6e3javd4ax(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2olw5adlxbemj, var2);
   }

   public static String Xqedii_3mfk89eg8gg4s(String var0) {
      String var1 = Xqedii_25ptltvdymcu7.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("X7mgLh7vNKVHfLuuTHi8E4hbZh7f/gywdbHXhDRpg2I=");
            int var3 = 977162728;

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
            String var9 = Xqedii_25ptltvdymcu7.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2r1g2d7tinwrh() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_15kbak2jnd3li() {
   }

   private static int Xqedii_37g8bui0czpcq(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3du8359ppr38x(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
