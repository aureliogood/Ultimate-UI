package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2i9gjgu {
   private static final ConcurrentHashMap<String, String> Xqedii_3unipdebin2vv = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3rocn0hiqefyi = -246822814;
   private static volatile int Xqedii_26es6jne0h56u = 929157644;
   private static volatile int Xqedii_18ujg0wxjucmo = -2077833469;
   private static volatile int Xqedii_1voohbwvtoi6q = 2073660013;
   private static volatile long Xqedii_meaazsmky4ml = 451405706956186132L;
   private static volatile long Xqedii_bbjakf13ith2 = 221656165336634197L;
   private static volatile long Xqedii_1ej0vgpjjlyml = 4040252511399891614L;
   private static volatile long Xqedii_12sx0277dwupv = -561191154888601441L;

   public static int Xqedii_3v2xg7tgbfn71(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3rocn0hiqefyi, var1);
   }

   public static int Xqedii_1m84p73d4pzww(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_26es6jne0h56u;
   }

   public static int Xqedii_r62apor7xfmk(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_18ujg0wxjucmo;
   }

   public static int Xqedii_bblyed9bzick(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1voohbwvtoi6q, var1);
   }

   public static long Xqedii_1ruh9qgjmfkgh(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_meaazsmky4ml, var2);
   }

   public static long Xqedii_qgq18wfpcpe5(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_bbjakf13ith2;
   }

   public static long Xqedii_1lcs4cxuo3mrp(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1ej0vgpjjlyml;
   }

   public static long Xqedii_xo9gpfagckhm(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_12sx0277dwupv, var2);
   }

   public static String Xqedii_13oivz4n6e0rz(String var0) {
      String var1 = Xqedii_3unipdebin2vv.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("hCM/EXCgtP8421RvVTQiMY1gliiAZN7lpZVU8GcUdyE=");
            int var3 = 1909607731;

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
            String var9 = Xqedii_3unipdebin2vv.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1e7kjhvpp2cn1() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2xketpylyal2() {
   }

   private static int Xqedii_2vcv3mv2qqomy(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_xc12v3fe5uqw(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
