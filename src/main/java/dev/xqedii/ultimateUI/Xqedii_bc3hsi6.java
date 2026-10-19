package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_bc3hsi6 {
   private static final ConcurrentHashMap<String, String> Xqedii_in8vmplmt8bs = new ConcurrentHashMap<>();
   private static volatile int Xqedii_18ld0up488uze = -1905097995;
   private static volatile int Xqedii_2aj51jge6sio6 = 995701189;
   private static volatile int Xqedii_nramipddorxt = 1072860428;
   private static volatile int Xqedii_13vw77u4t8ghp = 1833277537;
   private static volatile long Xqedii_3el32sj7zgqyh = -5870915667924018939L;
   private static volatile long Xqedii_3acjzvs3uuhp0 = -4554704886361568911L;
   private static volatile long Xqedii_1ke657htauwwp = -8073970353391307074L;
   private static volatile long Xqedii_3tch42c6916ub = 7584670030660667626L;

   public static int Xqedii_1de48byo4of2p(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_18ld0up488uze, var1);
   }

   public static int Xqedii_3mb9f8c0rhz3w(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2aj51jge6sio6;
   }

   public static int Xqedii_1lgdf6caq5a02(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_nramipddorxt;
   }

   public static int Xqedii_258f7yomyg8ty(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_13vw77u4t8ghp, var1);
   }

   public static long Xqedii_1192wr2w7coaa(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3el32sj7zgqyh, var2);
   }

   public static long Xqedii_1fft88gxxc793(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3acjzvs3uuhp0;
   }

   public static long Xqedii_2ynvyrpybryvi(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1ke657htauwwp;
   }

   public static long Xqedii_3qjxb1qho3z5c(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3tch42c6916ub, var2);
   }

   public static String Xqedii_o596iadtwi2g(String var0) {
      String var1 = Xqedii_in8vmplmt8bs.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("xNVxb6/IuukszRz+0hV3DXjCOZ/3vVhV34BLT1iU4vQ=");
            int var3 = -795483079;

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
            String var9 = Xqedii_in8vmplmt8bs.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_15ybmoda06xpl() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1mjrm76j7lha2() {
   }

   private static int Xqedii_2dastv9r49b5i(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_wvt7y0m52qv1(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
