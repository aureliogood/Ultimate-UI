package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_11o45ft {
   private static final ConcurrentHashMap<String, String> Xqedii_1a44ztpxs4bl2 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_23qou456ydol4 = 1229253110;
   private static volatile int Xqedii_2j5w2pwztkkld = -537224483;
   private static volatile int Xqedii_3sb99o5gqtdtc = -1785516837;
   private static volatile int Xqedii_1achuo0dq5j6h = -1158521619;
   private static volatile long Xqedii_2mbt5t7n4c5l6 = 7658882574839325764L;
   private static volatile long Xqedii_2ambo57nadet2 = 3015802475338625153L;
   private static volatile long Xqedii_18r5tyo0y5c8e = -969194952364274243L;
   private static volatile long Xqedii_3anzz8v4gjwaa = 4560872003307515517L;

   public static int Xqedii_wyrx3fxp4j9q(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_23qou456ydol4, var1);
   }

   public static int Xqedii_3uuathz0dg8rg(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2j5w2pwztkkld;
   }

   public static int Xqedii_36rwjshpxj8iv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3sb99o5gqtdtc;
   }

   public static int Xqedii_3lx96nebszc42(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1achuo0dq5j6h, var1);
   }

   public static long Xqedii_3m9rvlceoyyqc(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2mbt5t7n4c5l6, var2);
   }

   public static long Xqedii_i84o9gtbhcxq(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2ambo57nadet2;
   }

   public static long Xqedii_1ou07ghbvpag5(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_18r5tyo0y5c8e;
   }

   public static long Xqedii_3qninncgrvqtb(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3anzz8v4gjwaa, var2);
   }

   public static String Xqedii_3bq1pb0dajh64(String var0) {
      String var1 = Xqedii_1a44ztpxs4bl2.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("uSyUFldI7aEUy4YH3rSdx/k6pwaj9/2y08dWz58klbg=");
            int var3 = -1552603408;

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
            String var9 = Xqedii_1a44ztpxs4bl2.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1s8k11zhmy6h4() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1nr7104yrl35g() {
   }

   private static int Xqedii_139uh460wltdj(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3hrlckjqpebzl(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
