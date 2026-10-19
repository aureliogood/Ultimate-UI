package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_ghjfcat {
   private static final ConcurrentHashMap<String, String> Xqedii_jeas5fode571 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3l4en7i6v381u = -1704216573;
   private static volatile int Xqedii_2oqajjqjw0fxx = 339020419;
   private static volatile int Xqedii_252uev25rn67s = 373125614;
   private static volatile int Xqedii_1hpc1lbwx3keb = -1812981372;
   private static volatile long Xqedii_1cv4a5684dqrq = 3747149783505773653L;
   private static volatile long Xqedii_17n0mwfo3qg2k = -6280571310856597344L;
   private static volatile long Xqedii_2suv0m64zh9re = -8384378387357565046L;
   private static volatile long Xqedii_1v6usmzuoih14 = 9042153469979063995L;

   public static int Xqedii_31bh56qvl79rl(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3l4en7i6v381u, var1);
   }

   public static int Xqedii_26vxbbc6sldlk(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2oqajjqjw0fxx;
   }

   public static int Xqedii_3ae8jkqwbika3(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_252uev25rn67s;
   }

   public static int Xqedii_3011vjbfor69k(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1hpc1lbwx3keb, var1);
   }

   public static long Xqedii_2flro44ddnau7(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1cv4a5684dqrq, var2);
   }

   public static long Xqedii_3229p96t0nyw(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_17n0mwfo3qg2k;
   }

   public static long Xqedii_29mgezs5tllti(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2suv0m64zh9re;
   }

   public static long Xqedii_2lh9yt7b9y6em(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1v6usmzuoih14, var2);
   }

   public static String Xqedii_2z6rcdtjougfi(String var0) {
      String var1 = Xqedii_jeas5fode571.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("WUbe73CEoxm++u20SI3xTT8Ygta0+hIW4kGnCItRIUw=");
            int var3 = 1748993680;

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
            String var9 = Xqedii_jeas5fode571.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2m90ucbmsfp6w() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3d348yayn48c6() {
   }

   private static int Xqedii_3mobjqpsxzflz(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1qw29kv8gggsb(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
