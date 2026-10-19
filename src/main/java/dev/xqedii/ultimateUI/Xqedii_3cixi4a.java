package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_3cixi4a {
   private static final ConcurrentHashMap<String, String> Xqedii_1sgoknt37a45u = new ConcurrentHashMap<>();
   private static volatile int Xqedii_39g41nlg9izg8 = 1119521525;
   private static volatile int Xqedii_2h1rvseyloaix = 1577520207;
   private static volatile int Xqedii_1nf2w0ghokhql = 133319411;
   private static volatile int Xqedii_2yjib21yljget = 1117172658;
   private static volatile long Xqedii_1f69xmj8fkiop = -7996615474963150298L;
   private static volatile long Xqedii_3on3hw5i4dlsk = -716551853557245758L;
   private static volatile long Xqedii_3o1yfant1gopu = -8280793762727074389L;
   private static volatile long Xqedii_2t2xm64yx2mi6 = -8403358124273732969L;

   public static int Xqedii_msf85l6knrw(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_39g41nlg9izg8, var1);
   }

   public static int Xqedii_3ka92ug4ul8ro(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2h1rvseyloaix;
   }

   public static int Xqedii_3gzocs2yb67db(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1nf2w0ghokhql;
   }

   public static int Xqedii_3euxbxh3rbfby(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2yjib21yljget, var1);
   }

   public static long Xqedii_ogajtbm6o39l(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1f69xmj8fkiop, var2);
   }

   public static long Xqedii_2lovcihfu3s4d(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3on3hw5i4dlsk;
   }

   public static long Xqedii_25jm4az152n3j(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3o1yfant1gopu;
   }

   public static long Xqedii_73mhqkqay0vf(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2t2xm64yx2mi6, var2);
   }

   public static String Xqedii_1enshhypuzwuf(String var0) {
      String var1 = Xqedii_1sgoknt37a45u.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("Me8cH8QrU6z3dcb2BGy6izdMfEa+o2vYUfzSawOUrU8=");
            int var3 = 130566893;

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
            String var9 = Xqedii_1sgoknt37a45u.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_30yyx1yhli5r8() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_ok5zrhln4opz() {
   }

   private static int Xqedii_6yy3bitvx0w8(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2uj8kfldqtrzi(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
