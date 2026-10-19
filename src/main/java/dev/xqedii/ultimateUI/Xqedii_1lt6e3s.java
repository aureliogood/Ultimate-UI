package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1lt6e3s {
   private static final ConcurrentHashMap<String, String> Xqedii_3kmxphi1lugmj = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1j3kr5oiqi07r = -1867877997;
   private static volatile int Xqedii_urgcf2nb4on7 = -1488672851;
   private static volatile int Xqedii_211oazg60s8bi = 903898900;
   private static volatile int Xqedii_2d23j8gosd092 = -1474178180;
   private static volatile long Xqedii_v46mfva1xu3c = 1321968375062728227L;
   private static volatile long Xqedii_3a55h8bi4n9b5 = 1317181527783121603L;
   private static volatile long Xqedii_1dsjraw6sub9i = -8483673067489545445L;
   private static volatile long Xqedii_g1tl4r5o6ob7 = 4958929750157911179L;

   public static int Xqedii_hyg6u4aj6lxy(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1j3kr5oiqi07r, var1);
   }

   public static int Xqedii_vdua4jw1eppr(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_urgcf2nb4on7;
   }

   public static int Xqedii_6um7i4rizuza(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_211oazg60s8bi;
   }

   public static int Xqedii_2ahnt5mtafzt9(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2d23j8gosd092, var1);
   }

   public static long Xqedii_3i36vtuyfqcq9(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_v46mfva1xu3c, var2);
   }

   public static long Xqedii_3mad7xyxspr7k(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3a55h8bi4n9b5;
   }

   public static long Xqedii_235s1neg9uhqv(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1dsjraw6sub9i;
   }

   public static long Xqedii_3gpdlolw0rd0(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_g1tl4r5o6ob7, var2);
   }

   public static String Xqedii_3jqzr42ng9btc(String var0) {
      String var1 = Xqedii_3kmxphi1lugmj.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("HfzdfvTzubipV3wk9WticrmmUwlzLsKcNFcJrasI45o=");
            int var3 = 1745741227;

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
            String var9 = Xqedii_3kmxphi1lugmj.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_225yy4pavwfld() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_lij6emw4sor4() {
   }

   private static int Xqedii_3qruwr7hbp2ls(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_ttzkt9nyh13i(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
