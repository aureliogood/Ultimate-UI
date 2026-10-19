package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_2hmwd7u {
   private static final ConcurrentHashMap<String, String> Xqedii_h78s7akp66l2 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_1hx73xpxqlcwk = 1683479029;
   private static volatile int Xqedii_3ho0g2tdk5zdg = -1247800741;
   private static volatile int Xqedii_1oi6zdi8t4ehg = -819650730;
   private static volatile int Xqedii_1o4ywj3nc3nwf = -380258206;
   private static volatile long Xqedii_3l2rm24zf9a7r = -172923137587439880L;
   private static volatile long Xqedii_1pfcakiy0y1ix = 3948453957820240617L;
   private static volatile long Xqedii_1h8u5jvpz80of = 1227328409160100680L;
   private static volatile long Xqedii_1dqxqs7vulkbo = -629870228310815980L;

   public static int Xqedii_12m8ul81r2612(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_1hx73xpxqlcwk, var1);
   }

   public static int Xqedii_w7b7l5qmyxh3(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_3ho0g2tdk5zdg;
   }

   public static int Xqedii_9nd3mkmag9fx(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_1oi6zdi8t4ehg;
   }

   public static int Xqedii_98lw4x9xxnlg(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_1o4ywj3nc3nwf, var1);
   }

   public static long Xqedii_1ss5sem6e9i1(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_3l2rm24zf9a7r, var2);
   }

   public static long Xqedii_3p5i3e37lni1d(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_1pfcakiy0y1ix;
   }

   public static long Xqedii_33jkkgp10gzeg(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_1h8u5jvpz80of;
   }

   public static long Xqedii_3bn9irdq8xlor(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_1dqxqs7vulkbo, var2);
   }

   public static String Xqedii_55wu8oay68ss(String var0) {
      String var1 = Xqedii_h78s7akp66l2.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("dHf2LtqXaUxznf5N2uXWGa1OrBPv4hE4E0TIKexf76k=");
            int var3 = 1852380341;

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
            String var9 = Xqedii_h78s7akp66l2.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_11jaf3cupwlyh() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_3oewy295dp939() {
   }

   private static int Xqedii_rej1u5gy0n2o(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_2tc7gwhiwvkuq(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
