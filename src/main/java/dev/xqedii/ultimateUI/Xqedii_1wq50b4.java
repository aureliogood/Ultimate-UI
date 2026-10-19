package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_1wq50b4 {
   private static final ConcurrentHashMap<String, String> Xqedii_22tku8i5799ew = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2nzlwtxtkya3f = 1464994666;
   private static volatile int Xqedii_18a0rt825lvhr = -1946143900;
   private static volatile int Xqedii_2v73a6wd8p8dd = 580858081;
   private static volatile int Xqedii_3lz4xu9zda4qg = 64864182;
   private static volatile long Xqedii_igszh7vu02wq = -649670091084236425L;
   private static volatile long Xqedii_2kkmswuf9thqg = -1624057020050101506L;
   private static volatile long Xqedii_2ah9daosch5k9 = -4975795402325347320L;
   private static volatile long Xqedii_2p1nbeo8k7vyg = -2391000389283595401L;

   public static int Xqedii_2nluayycq3afl(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2nzlwtxtkya3f, var1);
   }

   public static int Xqedii_3269zhpralrh0(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_18a0rt825lvhr;
   }

   public static int Xqedii_21z8o0aiadix0(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2v73a6wd8p8dd;
   }

   public static int Xqedii_d917vvzpsa7b(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3lz4xu9zda4qg, var1);
   }

   public static long Xqedii_3svy9dln4igto(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_igszh7vu02wq, var2);
   }

   public static long Xqedii_2f2o8cnh51bj2(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2kkmswuf9thqg;
   }

   public static long Xqedii_1cm5xzx8n8bt6(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2ah9daosch5k9;
   }

   public static long Xqedii_3of6l9mv4vjqp(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2p1nbeo8k7vyg, var2);
   }

   public static String Xqedii_5n6v51yimurq(String var0) {
      String var1 = Xqedii_22tku8i5799ew.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("oygN3TVAr+rXMrlcBzv17oALeAyQdoudwX4My/7p+wQ=");
            int var3 = -146796128;

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
            String var9 = Xqedii_22tku8i5799ew.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_1zyatmung3eo() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_30bji0w6xhybr() {
   }

   private static int Xqedii_3b4tar4a14wek(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_3dnr3nfi5jr7p(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
