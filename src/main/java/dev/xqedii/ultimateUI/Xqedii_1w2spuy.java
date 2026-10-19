package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1w2spuy {
   private static final ConcurrentHashMap<String, String> Xqedii_nr2jasvuwyqv = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1frbolvnsy4u4 = -1788280730;
   private static volatile int Xqedii_2yc8eb7uo98eo = 782247507;
   private static volatile int Xqedii_1eb99e9dfoo8a = 611723385;
   private static volatile int Xqedii_wbh5snabjoqg = -901311185;
   private static volatile long Xqedii_2syomzgw8ypik = 2025978648241853704L;
   private static volatile long Xqedii_cenozbkd91o2 = 7433674256548304749L;
   private static volatile long Xqedii_29z8tafcyn664 = 4121851759767054083L;
   private static volatile long Xqedii_3o0q2qd6ezegl = 2505975373522373523L;

   public static int Xqedii_3eku49ayz96bv(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1frbolvnsy4u4, var1);
   }

   public static int Xqedii_2hf0e24lf9foa(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2yc8eb7uo98eo;
   }

   public static int Xqedii_g5w54i1tymkv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1eb99e9dfoo8a;
   }

   public static int Xqedii_1q355lr7pwogd(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_wbh5snabjoqg, var1);
   }

   public static long Xqedii_xik04siuz1r6(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2syomzgw8ypik, var2);
   }

   public static long Xqedii_u49775koen3j(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_cenozbkd91o2;
   }

   public static long Xqedii_2qh7xp435g20l(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_29z8tafcyn664;
   }

   public static long Xqedii_if2vzkev4pni(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3o0q2qd6ezegl, var2);
   }

   public static String Xqedii_x2kddcpny5mn(String var0) {
      String var1 = Xqedii_nr2jasvuwyqv.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("VOwU0/TfZueX8hyVocVKG1BroYNB35Yw1x/+Tw8cWbU=");
            int var3 = 2056856954;

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
            String var9 = Xqedii_nr2jasvuwyqv.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1zji73b8lhg67() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1vgvj3grgq45r() {
   }

   private static int Xqedii_2ozgs0wcvj3te(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3qvqypce7m09w(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
