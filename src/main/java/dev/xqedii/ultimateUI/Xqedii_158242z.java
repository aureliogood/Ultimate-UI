package dev.xqedii.ultimateUI;

import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Xqedii_158242z {
   private static final ConcurrentHashMap<String, String> Xqedii_378nx48fr12h1 = new ConcurrentHashMap<>();
   private static volatile int Xqedii_sq996d0z8r0h = -1980039935;
   private static volatile int Xqedii_19prgt24a6ea9 = -1585348675;
   private static volatile int Xqedii_dhezb4hmnhj = -1185444698;
   private static volatile int Xqedii_aum7hmyxm43t = -1043547870;
   private static volatile long Xqedii_31zpovl6aaycb = -7693137099879160137L;
   private static volatile long Xqedii_34tvjty2ttpq0 = -1267020932184039940L;
   private static volatile long Xqedii_3nsnuffyx6792 = -3723629934035894587L;
   private static volatile long Xqedii_353g5fg5mshwc = -3747393522048557186L;

   public static int Xqedii_90irrtokxj9(int var0, int var1) {
      return Integer.rotateRight(var0 ^ Xqedii_sq996d0z8r0h, var1);
   }

   public static int Xqedii_1xktxk0imblli(int var0, int var1) {
      return Integer.rotateRight(var0, var1) ^ Xqedii_19prgt24a6ea9;
   }

   public static int Xqedii_5xcb0efwzxjd(int var0, int var1) {
      return Integer.rotateRight(var0, var1) - Xqedii_dhezb4hmnhj;
   }

   public static int Xqedii_44gqp84czx4n(int var0, int var1) {
      return -Integer.rotateRight(var0 ^ Xqedii_aum7hmyxm43t, var1);
   }

   public static long Xqedii_2bvleamthshhm(long var0, int var2) {
      return Long.rotateRight(var0 ^ Xqedii_31zpovl6aaycb, var2);
   }

   public static long Xqedii_sr0ywjdcv3ab(long var0, int var2) {
      return Long.rotateRight(var0, var2) ^ Xqedii_34tvjty2ttpq0;
   }

   public static long Xqedii_2fxs9apyeex9l(long var0, int var2) {
      return Long.rotateRight(var0, var2) - Xqedii_3nsnuffyx6792;
   }

   public static long Xqedii_1myni0j3sdjoi(long var0, int var2) {
      return -Long.rotateRight(var0 ^ Xqedii_353g5fg5mshwc, var2);
   }

   public static String Xqedii_2ct323nck6b2j(String var0) {
      String var1 = Xqedii_378nx48fr12h1.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         try {
            byte[] var2 = Base64.getDecoder().decode("3psy7oUUUIkROgZ1hz1krX4gGthOB4DXqLLYlVoNamU=");
            int var3 = -1086623142;

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
            String var9 = Xqedii_378nx48fr12h1.putIfAbsent(var0, var12);
            return var9 == null ? var12 : var9;
         } catch (Exception var10) {
            throw new IllegalStateException("Protected constant integrity failure", var10);
         }
      }
   }

   public static String Xqedii_n5g13dsamzaw() {
      return "xqedii-1.4.2-20261012b";
   }

   public static void Xqedii_v8t3583pjxw4() {
   }

   private static int Xqedii_h20xvjku53qr(byte[] var0, byte[] var1) {
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

   private static /* synthetic */ void Xqedii_1wln4cyxwd504(java.util.ArrayList arrayList, java.util.jar.JarEntry jarEntry) {
        if (!jarEntry.isDirectory()) {
            arrayList.add(jarEntry.getName());
        }
    }
}
