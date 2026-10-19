package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_172kbr3 {
   private static final ConcurrentHashMap<String, String> Xqedii_3oeshqzyfbnc5 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_lgykfjd541xb = 1851824224;
   private static volatile int Xqedii_37u8a2i2q5ota = 1386822458;
   private static volatile int Xqedii_33w6u6ziusma6 = -392028355;
   private static volatile int Xqedii_x6fju8j5dkl6 = -1334497478;
   private static volatile long Xqedii_1wy9qluzw4o0j = 2923736482889648181L;
   private static volatile long Xqedii_2w1448ur7r2y5 = -6427318981664708813L;
   private static volatile long Xqedii_16id0joisyhv4 = 4555016418839462255L;
   private static volatile long Xqedii_23q7d1v66dmir = -1595225706902248207L;

   public static int Xqedii_2v2367thn0sqy(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_lgykfjd541xb, var1);
   }

   public static int Xqedii_1alga9hlsi90e(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_37u8a2i2q5ota;
   }

   public static int Xqedii_1wnwav2c16y23(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_33w6u6ziusma6;
   }

   public static int Xqedii_2z3yfqyr6mi2l(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_x6fju8j5dkl6, var1);
   }

   public static long Xqedii_3u24splc6q24n(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1wy9qluzw4o0j, var2);
   }

   public static long Xqedii_se9pzg26awy(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2w1448ur7r2y5;
   }

   public static long Xqedii_1u0km2c7xkvlc(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_16id0joisyhv4;
   }

   public static long Xqedii_2psvhohscv8kr(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_23q7d1v66dmir, var2);
   }

   public static String Xqedii_1vcan8fuioxig(String var0) {
      String var1 = Xqedii_3oeshqzyfbnc5.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("Uc/lXigSdxuxhg1IJ6Y40goVdwhfEgoILBsjgqyd5aQ=");
            int var3 = -1334291902;

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
            String var9 = Xqedii_3oeshqzyfbnc5.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_dxkvh9t062hl() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_rcm8x2mjd9ar() {
   }

   private static int Xqedii_3oszwt8g6xwte(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1fq3oail6hfxq(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
