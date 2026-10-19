package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_344dfpu {
   private static final ConcurrentHashMap<String, String> Xqedii_pmflbf145exg = new ConcurrentHashMap<>();
   private static volatile int Xqedii_o5mgn33ef21 = -1100993690;
   private static volatile int Xqedii_2skemxpvpn12d = -1280218114;
   private static volatile int Xqedii_1cjcg156rpops = -2099079959;
   private static volatile int Xqedii_3c33hszjmfe53 = -748662457;
   private static volatile long Xqedii_1w2c5m2mpbojp = 4842612877476362244L;
   private static volatile long Xqedii_3bu914ir4iwgy = 7328098436938045345L;
   private static volatile long Xqedii_2e4m0jq5104r7 = 7244252929444722507L;
   private static volatile long Xqedii_1gnbyqxn7e0dj = 8617562204412081571L;

   public static int Xqedii_o5hmly3nit02(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_o5mgn33ef21, var1);
   }

   public static int Xqedii_2w8hk59nkxd8r(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2skemxpvpn12d;
   }

   public static int Xqedii_23pkazknxxor3(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1cjcg156rpops;
   }

   public static int Xqedii_2aydf5dsbd1mk(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3c33hszjmfe53, var1);
   }

   public static long Xqedii_1qfa9u49jo3xv(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1w2c5m2mpbojp, var2);
   }

   public static long Xqedii_2dww6h28cx16q(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3bu914ir4iwgy;
   }

   public static long Xqedii_15hg6uxjybve3(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2e4m0jq5104r7;
   }

   public static long Xqedii_opgogeqb5vk0(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1gnbyqxn7e0dj, var2);
   }

   public static String Xqedii_julonwejv4mf(String var0) {
      String var1 = Xqedii_pmflbf145exg.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("fBiLYonrGVPks0nNLa8Xlnjb+zrGD4Z44Nn6d8r4L50=");
            int var3 = 847146319;

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
            String var9 = Xqedii_pmflbf145exg.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1k7xyoolk039o() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1gnv0j90gv0so() {
   }

   private static int Xqedii_3nflqjoqz7i0x(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2glcbhh6qs5av(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
