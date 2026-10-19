package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_kqeqdps {
   private static final ConcurrentHashMap<String, String> Xqedii_3e9txdsjf16x2 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2viov4q8mdsll = 1381501888;
   private static volatile int Xqedii_1zqith8uxzkv5 = -1907988843;
   private static volatile int Xqedii_2knl0zmxi5416 = -1911343607;
   private static volatile int Xqedii_zvou8rrrwmjm = 1531949217;
   private static volatile long Xqedii_2hs4mujq8rq98 = -7429974074048141177L;
   private static volatile long Xqedii_126kvxkxaqzrv = -8920971677699322899L;
   private static volatile long Xqedii_3g8o9yeedzrxi = 5853780370523947518L;
   private static volatile long Xqedii_2ga5gpuk5f6m3 = 3576994483209553540L;

   public static int Xqedii_1i68g3hfo6u12(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2viov4q8mdsll, var1);
   }

   public static int Xqedii_1ct2nulntom26(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1zqith8uxzkv5;
   }

   public static int Xqedii_1zctiekm4l771(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2knl0zmxi5416;
   }

   public static int Xqedii_2vfxigeyrtt74(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_zvou8rrrwmjm, var1);
   }

   public static long Xqedii_3r41gkw8h6h64(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2hs4mujq8rq98, var2);
   }

   public static long Xqedii_2ymx2kdqdynj6(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_126kvxkxaqzrv;
   }

   public static long Xqedii_215xq04utxte9(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3g8o9yeedzrxi;
   }

   public static long Xqedii_7i1rieeawrgc(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2ga5gpuk5f6m3, var2);
   }

   public static String Xqedii_1kli4tch65sxa(String var0) {
      String var1 = Xqedii_3e9txdsjf16x2.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("edpcbP9r6GPTfTiLe2bEhqX4PozNxnSHZlLYlFcQgNw=");
            int var3 = 91319413;

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
            String var9 = Xqedii_3e9txdsjf16x2.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_5zkdyz25u5nk() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2732d7w9z8n5c() {
   }

   private static int Xqedii_z7zhumq0bxre(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_u736jaen0cs0(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
