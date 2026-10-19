package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_18nv4sf {
   private static final ConcurrentHashMap<String, String> Xqedii_ifpnosa7xgim = new ConcurrentHashMap<>();
   private static volatile int Xqedii_10i4i2mxq0z5u = 1332349489;
   private static volatile int Xqedii_39bwspj2dd0x8 = -2074539286;
   private static volatile int Xqedii_3i9g3epbxmxmr = 1285453991;
   private static volatile int Xqedii_37m4ochi2xzm2 = 609437506;
   private static volatile long Xqedii_2cpgidtd9qfnq = -5436741961787177740L;
   private static volatile long Xqedii_y7480xtqpucw = -8240447713132356311L;
   private static volatile long Xqedii_37w6f9eoh316b = 1493238270685958178L;
   private static volatile long Xqedii_1xicogl5qx2d9 = -94950591295644800L;

   public static int Xqedii_1m73irwhx8s9a(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_10i4i2mxq0z5u, var1);
   }

   public static int Xqedii_3crngvx6gr0e9(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_39bwspj2dd0x8;
   }

   public static int Xqedii_kjfkxv5cjo7m(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_3i9g3epbxmxmr;
   }

   public static int Xqedii_17rziljlzm2rb(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_37m4ochi2xzm2, var1);
   }

   public static long Xqedii_g6bqnmyuyl7g(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_2cpgidtd9qfnq, var2);
   }

   public static long Xqedii_33hmpthbs0kiu(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_y7480xtqpucw;
   }

   public static long Xqedii_j7y5z9slysuu(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_37w6f9eoh316b;
   }

   public static long Xqedii_up5qmkqj4yfa(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1xicogl5qx2d9, var2);
   }

   public static String Xqedii_lgqce6l8z13z(String var0) {
      String var1 = Xqedii_ifpnosa7xgim.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("0O+hH/tjbP//UK+RPFkMPnbbMNZ3p4iDOQPOZgu+pBs=");
            int var3 = -13937877;

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
            String var9 = Xqedii_ifpnosa7xgim.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_26ew1g4iczl1b() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_2sw3n2xivqvoa() {
   }

   private static int Xqedii_1e656dddjmi8z(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_360be9wxz1p4z(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
