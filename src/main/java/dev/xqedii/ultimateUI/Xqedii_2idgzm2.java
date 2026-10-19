package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2idgzm2 {
   private static final ConcurrentHashMap<String, String> Xqedii_vt51hdthgcib = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1n1aa52068zcq = 1460270721;
   private static volatile int Xqedii_2pbxbgcg73dmf = -1162578067;
   private static volatile int Xqedii_1gvk1otqkykbu = -150603717;
   private static volatile int Xqedii_ubfs5t7d9j2q = 1574624641;
   private static volatile long Xqedii_3o6s4s9c3ba7v = 8102499559065172696L;
   private static volatile long Xqedii_3byokn45gqzyq = 1341232257942145257L;
   private static volatile long Xqedii_3b8p0v6ssxqob = 4791951661718041764L;
   private static volatile long Xqedii_m0w5m0x7zxix = -3114829410794274334L;

   public static int Xqedii_1lzj2b0v0drd8(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1n1aa52068zcq, var1);
   }

   public static int Xqedii_iggw2fdw2t4s(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2pbxbgcg73dmf;
   }

   public static int Xqedii_v35v98otl0fn(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1gvk1otqkykbu;
   }

   public static int Xqedii_2ajyjxnb9vv9e(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_ubfs5t7d9j2q, var1);
   }

   public static long Xqedii_3hhli7xx4j4ym(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3o6s4s9c3ba7v, var2);
   }

   public static long Xqedii_1xazdy3w3vnp6(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3byokn45gqzyq;
   }

   public static long Xqedii_236d65j726z6i(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3b8p0v6ssxqob;
   }

   public static long Xqedii_3f39s86b1pt57(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_m0w5m0x7zxix, var2);
   }

   public static String Xqedii_2p4m9txv96mi9(String var0) {
      String var1 = Xqedii_vt51hdthgcib.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("DFALzMlRtNIV197tvVZEMz8GwuXKcnNuPrVhpO05bNw=");
            int var3 = 1243122246;

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
            String var9 = Xqedii_vt51hdthgcib.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_33oe3uj4fh18a() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1m6n17u2ump6n() {
   }

   private static int Xqedii_frszpfcfuixo(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_221ba9yd8bzpg(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
