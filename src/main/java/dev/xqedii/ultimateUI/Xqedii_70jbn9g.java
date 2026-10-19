package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_70jbn9g {
   private static final ConcurrentHashMap<String, String> Xqedii_1rhwwpf556roe = new ConcurrentHashMap<>();
   private static volatile int Xqedii_3o0gcw6kwc3q = -1457538276;
   private static volatile int Xqedii_1fek85bw2hsod = 1932020614;
   private static volatile int Xqedii_273tt9drl8iuy = 1803345020;
   private static volatile int Xqedii_2mwsgjl843v59 = -1039146396;
   private static volatile long Xqedii_yrgkywm3muc3 = 3584904466272964271L;
   private static volatile long Xqedii_1twic8kg9b49r = 8836961461249325601L;
   private static volatile long Xqedii_3c5djllhkr1w6 = -1199033814954678885L;
   private static volatile long Xqedii_2jusjzts9k7l0 = 5282630283151633197L;

   public static int Xqedii_19cbekaqlkaqa(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_3o0gcw6kwc3q, var1);
   }

   public static int Xqedii_jukx2sz37jqv(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_1fek85bw2hsod;
   }

   public static int Xqedii_1r91ytx7s78l3(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_273tt9drl8iuy;
   }

   public static int Xqedii_2clthcq32b08r(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_2mwsgjl843v59, var1);
   }

   public static long Xqedii_1yaz6gj4n23jb(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_yrgkywm3muc3, var2);
   }

   public static long Xqedii_1pqpr171azaop(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1twic8kg9b49r;
   }

   public static long Xqedii_35jdj2envgdpc(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3c5djllhkr1w6;
   }

   public static long Xqedii_1rcm83637ugt7(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_2jusjzts9k7l0, var2);
   }

   public static String Xqedii_ngbp6gvr2oh0(String var0) {
      String var1 = Xqedii_1rhwwpf556roe.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("K6pTB3btFiQWRMLkKPyzckby7AmW0u7jmGbsiUqoA5M=");
            int var3 = -2101464216;

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
            String var9 = Xqedii_1rhwwpf556roe.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_10okc51n81o8i() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_1h1e1bx59vi4w() {
   }

   private static int Xqedii_1m5lp4nkocnqi(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_b9xibdqtqm25(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
