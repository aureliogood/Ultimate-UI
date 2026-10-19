package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1v15wt0 {
   private static final ConcurrentHashMap<String, String> Xqedii_1e4u5zb1xwy3p = new ConcurrentHashMap<>();
   private static volatile int Xqedii_4wgcjzfsfmuz = 532427803;
   private static volatile int Xqedii_3jfno78c1wwzg = -1890144890;
   private static volatile int Xqedii_gi9dupw678hi = 1331094046;
   private static volatile int Xqedii_1u7one8n6h89y = -103959890;
   private static volatile long Xqedii_2mickk5el2a5v = -5377588016662115765L;
   private static volatile long Xqedii_364qj4f52bs80 = 7148913914856893111L;
   private static volatile long Xqedii_25kk3oge578z6 = 2637623050811565079L;
   private static volatile long Xqedii_11el20sybamqq = -2000822351707779266L;

   public static int Xqedii_wxtq7uzu4z83(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_4wgcjzfsfmuz, var1);
   }

   public static int Xqedii_3kra8oxlm07mv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3jfno78c1wwzg;
   }

   public static int Xqedii_23e8ayqic58pp(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_gi9dupw678hi;
   }

   public static int Xqedii_136j0hw0yeqyf(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1u7one8n6h89y, var1);
   }

   public static long Xqedii_3f6w6bu4hhlge(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2mickk5el2a5v, var2);
   }

   public static long Xqedii_1d9jb7rgdp1zd(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_364qj4f52bs80;
   }

   public static long Xqedii_3uudhtwfkrntv(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_25kk3oge578z6;
   }

   public static long Xqedii_2mdq2faarb02c(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_11el20sybamqq, var2);
   }

   public static String Xqedii_202trwmha0pne(String var0) {
      String var1 = Xqedii_1e4u5zb1xwy3p.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("KKWPDBe0itziVwp6sEebMpsG9hA2aNBwe5L10AbsnDk=");
            int var3 = -1668367712;

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
            String var9 = Xqedii_1e4u5zb1xwy3p.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3fa03frsg78nk() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2uzydqnvj5bmn() {
   }

   private static int Xqedii_1536eiar2ofad(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1e6rqekah5psm(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
