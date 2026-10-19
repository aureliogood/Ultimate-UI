package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_65g97z6 {
   private static final ConcurrentHashMap<String, String> Xqedii_38ir4oi8574wk = new ConcurrentHashMap<>();
   private static volatile int Xqedii_2xr7aqenobmll = -1657754774;
   private static volatile int Xqedii_1az8qkk91huvg = 457709740;
   private static volatile int Xqedii_xjc7vgtyzmnp = 2137250666;
   private static volatile int Xqedii_2zz67lo69wprg = -1120376228;
   private static volatile long Xqedii_27cyhejtkjdnp = 888964779148774885L;
   private static volatile long Xqedii_ia2ro08ugcnc = 1309212317282801191L;
   private static volatile long Xqedii_27kjpvrnsqir5 = 3043820398272498190L;
   private static volatile long Xqedii_14q155b6hx6ju = 5399824856641592270L;

   public static int Xqedii_1179j6038xqg6(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_2xr7aqenobmll, var1);
   }

   public static int Xqedii_h304p3ta23bc(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1az8qkk91huvg;
   }

   public static int Xqedii_1kifojtg0sfu9(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_xjc7vgtyzmnp;
   }

   public static int Xqedii_2b341k51mbddg(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2zz67lo69wprg, var1);
   }

   public static long Xqedii_28z82vux5lhu5(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_27cyhejtkjdnp, var2);
   }

   public static long Xqedii_1wt5sqdzq617(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_ia2ro08ugcnc;
   }

   public static long Xqedii_wizscg6njvya(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_27kjpvrnsqir5;
   }

   public static long Xqedii_3fz7emsdmfih2(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_14q155b6hx6ju, var2);
   }

   public static String Xqedii_1e1sta3e995j4(String var0) {
      String var1 = Xqedii_38ir4oi8574wk.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("iOC7BJS+l29FilfY/pACV8FWNU34MXIic/MxNlVozlQ=");
            int var3 = -1495070211;

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
            String var9 = Xqedii_38ir4oi8574wk.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_2e7vdwjh76n2y() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_o2mejv9jr4uv() {
   }

   private static int Xqedii_zrcha4olet5c(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1apw24kdjmlik(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
