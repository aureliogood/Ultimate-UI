package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_gh6onqt {
   private static final ConcurrentHashMap<String, String> Xqedii_e2weq97hawoy = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2cpmw7npk6efj = -1324290276;
   private static volatile int Xqedii_1c4xs75cztpej = 1020576876;
   private static volatile int Xqedii_1mo9gpa6gnbbk = -590327129;
   private static volatile int Xqedii_24mkugg7h64lg = -1315312375;
   private static volatile long Xqedii_3rjah1nj521el = -7275544172026234907L;
   private static volatile long Xqedii_3t2kbo8hakx23 = 5817838912009784935L;
   private static volatile long Xqedii_l4b3rq4uiarp = 6176669896755726760L;
   private static volatile long Xqedii_z62exhh7rubk = -3200196615718162958L;

   public static int Xqedii_22a0jwaipx8dc(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2cpmw7npk6efj, var1);
   }

   public static int Xqedii_3utt5efrtsx1z(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1c4xs75cztpej;
   }

   public static int Xqedii_donvbi465g3(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1mo9gpa6gnbbk;
   }

   public static int Xqedii_3dkwo5hxn8m2r(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_24mkugg7h64lg, var1);
   }

   public static long Xqedii_3g5lwp7gwotyp(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3rjah1nj521el, var2);
   }

   public static long Xqedii_173b1pnase8jv(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_3t2kbo8hakx23;
   }

   public static long Xqedii_mwjjlh63g6w3(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_l4b3rq4uiarp;
   }

   public static long Xqedii_1vnjmxqvq0m08(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_z62exhh7rubk, var2);
   }

   public static String Xqedii_3lhavs7p9gm7d(String var0) {
      String var1 = Xqedii_e2weq97hawoy.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("ohYIMWIXto50YyMlEebmDJt0Kjpi1kl8QOG7Ixh9j64=");
            int var3 = 254816355;

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
            String var9 = Xqedii_e2weq97hawoy.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_3cvezhbpsf4rh() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_23f8saslkdswd() {
   }

   private static int Xqedii_1dmpujdrqsr2j(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_19n43e4ieuxsr(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
