package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1vijyc2 {
   private static final ConcurrentHashMap<String, String> Xqedii_1fdsvvil99i1 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_141wy8z34swtx = -969405058;
   private static volatile int Xqedii_3vridr8w5nvfu = -148910109;
   private static volatile int Xqedii_1a13ce0x9jvmy = 1825234819;
   private static volatile int Xqedii_2jca69d4vjdh8 = -2025071138;
   private static volatile long Xqedii_2co22qdwaew2q = -731128275260258890L;
   private static volatile long Xqedii_3pcen0c7m6c7m = 4772978566926825672L;
   private static volatile long Xqedii_3d3m98vwfkq1a = 1471655822020315979L;
   private static volatile long Xqedii_3fasxv7mrqjj = -8460555891363825892L;

   public static int Xqedii_21pxt1ipkg1y4(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_141wy8z34swtx, var1);
   }

   public static int Xqedii_35c9w4573crp6(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3vridr8w5nvfu;
   }

   public static int Xqedii_3w4qnknkhh9pd(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1a13ce0x9jvmy;
   }

   public static int Xqedii_bkfccfksetbi(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2jca69d4vjdh8, var1);
   }

   public static long Xqedii_b2iagstlpdkh(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2co22qdwaew2q, var2);
   }

   public static long Xqedii_1vu6w8gym355j(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3pcen0c7m6c7m;
   }

   public static long Xqedii_38z997bn84q6c(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3d3m98vwfkq1a;
   }

   public static long Xqedii_129ho4px1trz4(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3fasxv7mrqjj, var2);
   }

   public static String Xqedii_3ahgb93lq1jdx(String var0) {
      String var1 = Xqedii_1fdsvvil99i1.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("kNLTnsbshkP2uLZLieJuxb+6UBCX4l5MeEfFT5AgHIw=");
            int var3 = 1545296007;

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
            String var9 = Xqedii_1fdsvvil99i1.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1gktjfj3bx8bv() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1ihaorrc435u1() {
   }

   private static int Xqedii_249puaj9xbhc4(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_22ehe7x8hnt7m(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
