package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_ht83xj4 {
   private static final ConcurrentHashMap<String, String> Xqedii_2gx1dmwjc9x4h = new ConcurrentHashMap<>();
   private static volatile int Xqedii_il9jm00aqn51 = 180840964;
   private static volatile int Xqedii_2k65zs6g7f9lj = 902278762;
   private static volatile int Xqedii_1j7br088qo5a1 = -1903542078;
   private static volatile int Xqedii_twb2llgzi8t6 = 575388574;
   private static volatile long Xqedii_2t587ma3s6a86 = 1622333050562320065L;
   private static volatile long Xqedii_xe6ow3038wky = -2524641865037425603L;
   private static volatile long Xqedii_afgn7f1a5dwu = -7146046108943095336L;
   private static volatile long Xqedii_m6cqgb9rzkqb = 5279505830648249898L;

   public static int Xqedii_wbqhkm4fr8tm(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_il9jm00aqn51, var1);
   }

   public static int Xqedii_2fsksqdlv7k2p(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2k65zs6g7f9lj;
   }

   public static int Xqedii_35okk2w672gjb(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1j7br088qo5a1;
   }

   public static int Xqedii_2nk1rfpt99rsc(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_twb2llgzi8t6, var1);
   }

   public static long Xqedii_1mwle2g5naraa(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2t587ma3s6a86, var2);
   }

   public static long Xqedii_35a9mm9nijk61(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_xe6ow3038wky;
   }

   public static long Xqedii_8znjw66b4rk3(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_afgn7f1a5dwu;
   }

   public static long Xqedii_1ij513psskaf7(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_m6cqgb9rzkqb, var2);
   }

   public static String Xqedii_1vq521uqkuiqb(String var0) {
      String var1 = Xqedii_2gx1dmwjc9x4h.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("cE3w43jmkN1RWbPdctGNYEkGGWZLZAdGaWErUSHbeDw=");
            int var3 = -436640280;

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
            String var9 = Xqedii_2gx1dmwjc9x4h.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2qw0rs7hvbopy() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1zdj5s79nik8v() {
   }

   private static int Xqedii_229pphsu6esd1(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1yhwxv53umubi(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
