package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2ctuejg {
   private static final ConcurrentHashMap<String, String> Xqedii_1tievxog2onh9 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3uoo7kahj5bts = 171921028;
   private static volatile int Xqedii_12xyx1yjj8f6i = -1547769410;
   private static volatile int Xqedii_3d9bcvj35cgs9 = -454981541;
   private static volatile int Xqedii_3ucv4g3hi5jd5 = -353081462;
   private static volatile long Xqedii_21zd88xp0atl0 = -7724073679576320222L;
   private static volatile long Xqedii_34pncip5lfm58 = -893795738916623379L;
   private static volatile long Xqedii_2jdwaau9utgjv = 2813017330958985007L;
   private static volatile long Xqedii_30mlxn9x8uqsx = 4435609317088705851L;

   public static int Xqedii_jn0pf4e4l4lv(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3uoo7kahj5bts, var1);
   }

   public static int Xqedii_2fdlvzwk2819v(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_12xyx1yjj8f6i;
   }

   public static int Xqedii_6avucy8clr6h(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3d9bcvj35cgs9;
   }

   public static int Xqedii_hg0bhuwdupjy(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_3ucv4g3hi5jd5, var1);
   }

   public static long Xqedii_3q0aoddo71lrr(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_21zd88xp0atl0, var2);
   }

   public static long Xqedii_1l4pzd79xtx39(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_34pncip5lfm58;
   }

   public static long Xqedii_3ajiu6rc15ud3(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2jdwaau9utgjv;
   }

   public static long Xqedii_1cpfzsqx0l1e1(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_30mlxn9x8uqsx, var2);
   }

   public static String Xqedii_2bt0gq4td0it(String var0) {
      String var1 = Xqedii_1tievxog2onh9.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("AuN90qmXcuCCiHAHkSAptnEmvpT/awFhrynf8oFMocs=");
            int var3 = -1651892097;

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
            String var9 = Xqedii_1tievxog2onh9.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_hmwtbtlfxewr() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3gqzcq9pmc3ge() {
   }

   private static int Xqedii_3bh98cc1ggrxt(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_195clotty4bs7(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
