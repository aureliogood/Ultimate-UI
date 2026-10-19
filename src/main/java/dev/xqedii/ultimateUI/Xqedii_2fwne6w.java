package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2fwne6w {
   private static final ConcurrentHashMap<String, String> Xqedii_1bgy1mjmg1vcx = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1xv18r7pwmo13 = 722013765;
   private static volatile int Xqedii_2l7zmv040ms31 = 519616196;
   private static volatile int Xqedii_3fl9wngv0m5bt = -1719162180;
   private static volatile int Xqedii_21n3xb3jpezob = 1589962;
   private static volatile long Xqedii_1mgsp5f8rasfj = -8158488997468287517L;
   private static volatile long Xqedii_39wrfb5ahix93 = -1214958701550696225L;
   private static volatile long Xqedii_slla9wj5ezic = 6719475491598437819L;
   private static volatile long Xqedii_2w72hoowqmjks = -6199115959940721915L;

   public static int Xqedii_3mvpcxa470l7(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1xv18r7pwmo13, var1);
   }

   public static int Xqedii_3mektaa8mnko5(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_2l7zmv040ms31;
   }

   public static int Xqedii_97b8dy1hyhxs(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3fl9wngv0m5bt;
   }

   public static int Xqedii_tndg258plek0(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_21n3xb3jpezob, var1);
   }

   public static long Xqedii_1ee2prip4xvr2(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_1mgsp5f8rasfj, var2);
   }

   public static long Xqedii_1lcna8hr8w6oc(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_39wrfb5ahix93;
   }

   public static long Xqedii_1gztmbte2vrd2(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_slla9wj5ezic;
   }

   public static long Xqedii_20h4i82mxjaft(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2w72hoowqmjks, var2);
   }

   public static String Xqedii_l3golxqa69ji(String var0) {
      String var1 = Xqedii_1bgy1mjmg1vcx.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("1DQaCmAl8tY3YDwqy1kI8nAp5YmDe+1mVr8XiNJObis=");
            int var3 = 1552776057;

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
            String var9 = Xqedii_1bgy1mjmg1vcx.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_27q8vo5c33wfg() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_18hzfk1dw7bki() {
   }

   private static int Xqedii_2z2caw7axa1ra(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1f5gm18i2kpg8(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
