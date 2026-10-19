package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_154a8mr {
   private static final ConcurrentHashMap<String, String> Xqedii_365enyp3mth06 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_29v9nhmrikelo = 1598267731;
   private static volatile int Xqedii_1ca4ltc2hxz0p = 438166095;
   private static volatile int Xqedii_2kobap8st9gky = 596391377;
   private static volatile int Xqedii_2342eyt4n69r9 = -68002666;
   private static volatile long Xqedii_ksvy6op1iv9g = 2428976248205611671L;
   private static volatile long Xqedii_ufvisedkmgex = -8973451896230127828L;
   private static volatile long Xqedii_2g1w8n5xvvngk = -4911715564770658894L;
   private static volatile long Xqedii_36vthiygvvheb = 1414816016666219163L;

   public static int Xqedii_qaok5yug7q0l(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_29v9nhmrikelo, var1);
   }

   public static int Xqedii_uk6s25rt6ioo(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1ca4ltc2hxz0p;
   }

   public static int Xqedii_j7jyq59879uu(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_2kobap8st9gky;
   }

   public static int Xqedii_101falllz4gex(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2342eyt4n69r9, var1);
   }

   public static long Xqedii_2kpiddn4jclw3(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_ksvy6op1iv9g, var2);
   }

   public static long Xqedii_19612kly7dizy(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_ufvisedkmgex;
   }

   public static long Xqedii_2higtk7pmcygl(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_2g1w8n5xvvngk;
   }

   public static long Xqedii_327uoayy6ssyq(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_36vthiygvvheb, var2);
   }

   public static String Xqedii_1gn0pb2lmuicc(String var0) {
      String var1 = Xqedii_365enyp3mth06.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("a9IOSXQcce6qGzSf/k991L6MaOrg0x/dAPiXVsgfPRQ=");
            int var3 = 687290595;

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
            String var9 = Xqedii_365enyp3mth06.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_n95kal17a35z() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_8lojfpybqcwy() {
   }

   private static int Xqedii_3d9ca12tq8xal(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1zj15aj2upxlv(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
