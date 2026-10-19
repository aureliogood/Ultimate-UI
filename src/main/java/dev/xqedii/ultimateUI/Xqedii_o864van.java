package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_o864van {
   private static final ConcurrentHashMap<String, String> Xqedii_3somd4wkualyl = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3rgzmriksd53n = -767782373;
   private static volatile int Xqedii_22yjrk7tda7vd = 763738446;
   private static volatile int Xqedii_1jzibtwk7b1xi = -1647726099;
   private static volatile int Xqedii_1c8ithqjpsmm8 = -408477481;
   private static volatile long Xqedii_60sp0zjwi5q9 = 3912604803902575797L;
   private static volatile long Xqedii_2r9qsoa05tihm = 6309008283183802471L;
   private static volatile long Xqedii_12rr2yz0aeuio = -4101065644407727409L;
   private static volatile long Xqedii_378bof0k2tpnv = 7138343334986245635L;

   public static int Xqedii_hfzct7abfhpf(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3rgzmriksd53n, var1);
   }

   public static int Xqedii_2m34gyf7orvq3(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_22yjrk7tda7vd;
   }

   public static int Xqedii_12igzvhfaxe5b(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1jzibtwk7b1xi;
   }

   public static int Xqedii_3brm3agbw69r1(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1c8ithqjpsmm8, var1);
   }

   public static long Xqedii_kejk7sj2gl62(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_60sp0zjwi5q9, var2);
   }

   public static long Xqedii_9anw5plr8as7(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_2r9qsoa05tihm;
   }

   public static long Xqedii_5ydvlrjse6qo(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_12rr2yz0aeuio;
   }

   public static long Xqedii_21ouxbxb5aidd(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_378bof0k2tpnv, var2);
   }

   public static String Xqedii_324sa92bqzzci(String var0) {
      String var1 = Xqedii_3somd4wkualyl.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("GsJjdYJASkepCK3Kp0y5ICuY2VolvHnwZjeXgD4fz7k=");
            int var3 = -742728624;

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
            String var9 = Xqedii_3somd4wkualyl.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2at06fzczimg6() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_278i17oee6g1i() {
   }

   private static int Xqedii_o5r07y57klnf(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_4i9ug8hqvh13(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
