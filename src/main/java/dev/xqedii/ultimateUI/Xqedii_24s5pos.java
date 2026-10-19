package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_24s5pos {
   private static final ConcurrentHashMap<String, String> Xqedii_1i14a2nz9e81a = new ConcurrentHashMap<>();
   private static volatile int Xqedii_39v4exqtqcbmy = 777052562;
   private static volatile int Xqedii_o0l4cyn0y8yw = -1637734826;
   private static volatile int Xqedii_138ydein8nem0 = -1412762081;
   private static volatile int Xqedii_2js2tt7oof6zo = -1571603184;
   private static volatile long Xqedii_1be9mjyjwsgga = 2143439466384478654L;
   private static volatile long Xqedii_2dcvtc24qfcyh = 21920326127853714L;
   private static volatile long Xqedii_3fez9cu6g2jnd = -4149637177383501893L;
   private static volatile long Xqedii_1knvpf8p436au = 3449682038393288692L;

   public static int Xqedii_iw49kel9swxl(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_39v4exqtqcbmy, var1);
   }

   public static int Xqedii_1vodyi3ojgqrb(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_o0l4cyn0y8yw;
   }

   public static int Xqedii_l2fsnlneow97(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_138ydein8nem0;
   }

   public static int Xqedii_3nsc3m0hw9wna(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2js2tt7oof6zo, var1);
   }

   public static long Xqedii_21wzk6gi1pr7c(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1be9mjyjwsgga, var2);
   }

   public static long Xqedii_uycxbxggnwzk(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2dcvtc24qfcyh;
   }

   public static long Xqedii_2tj6pyay2qdqs(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3fez9cu6g2jnd;
   }

   public static long Xqedii_1owrx6l80wukx(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1knvpf8p436au, var2);
   }

   public static String Xqedii_2xwm2fawkae3f(String var0) {
      String var1 = Xqedii_1i14a2nz9e81a.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("eaNroKLaPexP10QYe3ZCJA2giisJNSHD1g4mkRgv+BQ=");
            int var3 = 1599713724;

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
            String var9 = Xqedii_1i14a2nz9e81a.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2m1ccepghjp1q() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3so7bn23r25zd() {
   }

   private static int Xqedii_1ywc74424a73e(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_174pflotpwy7c(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
