package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_290gplq {
   private static final ConcurrentHashMap<String, String> Xqedii_24qd29uxxz3d9 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1va05taqy8nan = -1073415262;
   private static volatile int Xqedii_2dh1ku3fzfwry = -735299706;
   private static volatile int Xqedii_3iozv1xuwx24 = -1153516989;
   private static volatile int Xqedii_8lwq6uj3owz4 = 1967954897;
   private static volatile long Xqedii_cflxaftzg8i4 = -6169416969049931760L;
   private static volatile long Xqedii_1u3vgeixmjx4b = 3294687270632771692L;
   private static volatile long Xqedii_2chvmhjwmlfu1 = 4685994890139713580L;
   private static volatile long Xqedii_2j0q7efkjr2d8 = -2847247856267709572L;

   public static int Xqedii_1smf3ilrfaawk(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1va05taqy8nan, var1);
   }

   public static int Xqedii_3nxxzrf937kk8(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2dh1ku3fzfwry;
   }

   public static int Xqedii_14nvwuxrup67g(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3iozv1xuwx24;
   }

   public static int Xqedii_2unhrdsaseonv(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_8lwq6uj3owz4, var1);
   }

   public static long Xqedii_1od86s90xqhtt(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_cflxaftzg8i4, var2);
   }

   public static long Xqedii_lr3qxe1gfswx(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1u3vgeixmjx4b;
   }

   public static long Xqedii_3jgkcx3idds53(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2chvmhjwmlfu1;
   }

   public static long Xqedii_3shzk4fihy6zj(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2j0q7efkjr2d8, var2);
   }

   public static String Xqedii_1j0zabi8wuwrv(String var0) {
      String var1 = Xqedii_24qd29uxxz3d9.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("L91HoBLzWrK1jAaoUv5PMFD29+cxfX6kDd8Gsi41LnQ=");
            int var3 = -179049278;

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
            String var9 = Xqedii_24qd29uxxz3d9.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2p6b8vfmm78t2() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1m4hzwhu2ob2b() {
   }

   private static int Xqedii_50ic13uft0v4(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1pgjw36ge3xpj(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
