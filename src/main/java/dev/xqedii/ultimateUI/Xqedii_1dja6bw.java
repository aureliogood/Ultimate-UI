package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1dja6bw {
   private static final ConcurrentHashMap<String, String> Xqedii_2hpjukg1ixw7z = new ConcurrentHashMap<>();
   private static volatile int Xqedii_35wjw1gd7mq33 = -2138606380;
   private static volatile int Xqedii_3iqttncotvrxf = -1206011855;
   private static volatile int Xqedii_vaqrobdgnxkm = 2104901509;
   private static volatile int Xqedii_uaedbungge8x = -219471284;
   private static volatile long Xqedii_91y7hcjy1aib = 5832322215288901855L;
   private static volatile long Xqedii_3nogrze10xf2z = 6714522326045925785L;
   private static volatile long Xqedii_1m31um4n9pqfc = -6174824414880401818L;
   private static volatile long Xqedii_28xv6yggvf9ol = -6311532895663105736L;

   public static int Xqedii_3ic447wemb0bz(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_35wjw1gd7mq33, var1);
   }

   public static int Xqedii_3tgry8emdmpdh(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3iqttncotvrxf;
   }

   public static int Xqedii_z0fadtjq372o(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_vaqrobdgnxkm;
   }

   public static int Xqedii_4xmczn0gp2op(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_uaedbungge8x, var1);
   }

   public static long Xqedii_1v24d2vi9ukin(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_91y7hcjy1aib, var2);
   }

   public static long Xqedii_1cq2ympzn3elu(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3nogrze10xf2z;
   }

   public static long Xqedii_2se1khn3ycieo(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1m31um4n9pqfc;
   }

   public static long Xqedii_34lh06ue80sdh(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_28xv6yggvf9ol, var2);
   }

   public static String Xqedii_befy4kzl677j(String var0) {
      String var1 = Xqedii_2hpjukg1ixw7z.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("3xZ8fjQ8URZojMFrqMR0ej8iPPuqFG7Qn20X1chX8Aw=");
            int var3 = -442346288;

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
            String var9 = Xqedii_2hpjukg1ixw7z.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2f6fujp0jvkph() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_270kf5acb7obs() {
   }

   private static int Xqedii_13lrdbwrgud2(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_38l5gj4775b6j(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
