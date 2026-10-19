package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_76ufhm2 {
   private static final ConcurrentHashMap<String, String> Xqedii_9y3pgyo4vdnl = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3kzk7yz0w8y4a = -382273113;
   private static volatile int Xqedii_1w8i5469ytjxl = -1302142236;
   private static volatile int Xqedii_3kju1948wslzp = 1843318278;
   private static volatile int Xqedii_i7i438eyee5s = 2102073383;
   private static volatile long Xqedii_19hnj6iyskunx = -8927811025661347438L;
   private static volatile long Xqedii_3op1sb762zrsu = -1321364035097312542L;
   private static volatile long Xqedii_3gnae7visnbey = -6126128022412662430L;
   private static volatile long Xqedii_3b4wxd0ja5ogu = -3857884175191038702L;

   public static int Xqedii_1en8zd85cpgfi(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3kzk7yz0w8y4a, var1);
   }

   public static int Xqedii_3cyz1th9i5agm(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1w8i5469ytjxl;
   }

   public static int Xqedii_1s1d1d6274abz(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3kju1948wslzp;
   }

   public static int Xqedii_3mgy39o0fbvjy(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_i7i438eyee5s, var1);
   }

   public static long Xqedii_79n80pxtn410(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_19hnj6iyskunx, var2);
   }

   public static long Xqedii_kcjnwfalq7nh(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3op1sb762zrsu;
   }

   public static long Xqedii_2w1b0ivv03g0t(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3gnae7visnbey;
   }

   public static long Xqedii_qwsv8ugn9drf(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_3b4wxd0ja5ogu, var2);
   }

   public static String Xqedii_1hdrqcppudf05(String var0) {
      String var1 = Xqedii_9y3pgyo4vdnl.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("+YDBBXpPeQXYHV8Q4WCV59Fn+G5+a1WVYqp4c4jWLxY=");
            int var3 = 239604713;

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
            String var9 = Xqedii_9y3pgyo4vdnl.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_tr51scw9uqz0() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_qxsz5uyaq1vq() {
   }

   private static int Xqedii_36u8tijmnmi75(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_333ul2ul5mhnc(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
