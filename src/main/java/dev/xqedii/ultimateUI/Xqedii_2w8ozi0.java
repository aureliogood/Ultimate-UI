package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2w8ozi0 {
   private static final ConcurrentHashMap<String, String> Xqedii_ac92kwscaui1 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2sonajzl4l5sm = -1868627103;
   private static volatile int Xqedii_2qr9f2315xsob = -359676411;
   private static volatile int Xqedii_2nzz7wl9aw62x = -1564462762;
   private static volatile int Xqedii_2si2yl4q5bqpo = -546757674;
   private static volatile long Xqedii_1g2vnzzcgy3ay = 1109034220891026450L;
   private static volatile long Xqedii_20br88oa018s5 = -2104532485894422739L;
   private static volatile long Xqedii_vx1qfstbxkco = -579553393262378236L;
   private static volatile long Xqedii_2ku8szt5j1cp9 = 4855621634169244328L;

   public static int Xqedii_1ykcvb11up3td(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2sonajzl4l5sm, var1);
   }

   public static int Xqedii_3pnvw9ns2tbcp(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2qr9f2315xsob;
   }

   public static int Xqedii_2cbpg9psv7voj(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2nzz7wl9aw62x;
   }

   public static int Xqedii_8luskr55goo(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2si2yl4q5bqpo, var1);
   }

   public static long Xqedii_2fr6ojqhhteep(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1g2vnzzcgy3ay, var2);
   }

   public static long Xqedii_39sfcu4v1kqla(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_20br88oa018s5;
   }

   public static long Xqedii_24k0qwne3j8ia(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_vx1qfstbxkco;
   }

   public static long Xqedii_3bbzy4ehtm7f1(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2ku8szt5j1cp9, var2);
   }

   public static String Xqedii_3fpu0lvvy8in3(String var0) {
      String var1 = Xqedii_ac92kwscaui1.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("/9611kM85csfc2eDbHdXJJOEsV+KMh+xhNKBtBxc+hU=");
            int var3 = -403145619;

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
            String var9 = Xqedii_ac92kwscaui1.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_rxu7gxgv6k5r() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3vk6nk05v6fta() {
   }

   private static int Xqedii_3bktll76ft4g7(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_s89ppmrv8lof(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
