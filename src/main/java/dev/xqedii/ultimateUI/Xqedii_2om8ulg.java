package dev.xqedii.ultimateUI;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public final class Xqedii_2om8ulg {
   public static final String Xqedii_39pv1bhqlojx0 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";
   public final Path Xqedii_2hw69rw;
   public final List<Path> Xqedii_23z7ald;
   public final Set<String> Xqedii_3eq8bxc;
   public final Set<String> Xqedii_18wf8zl;
   public final Xqedii_3vpi3ac Xqedii_1qtmyyn;
   public int Xqedii_2j5wggn;
   public int Xqedii_q9b6pe4;

   public Xqedii_2om8ulg(Path var1, List<Path> var2, Set<String> var3, Set<String> var4, Xqedii_3vpi3ac var5) {
      this.Xqedii_2hw69rw = var1;
      this.Xqedii_23z7ald = var2;
      this.Xqedii_3eq8bxc = var3;
      this.Xqedii_18wf8zl = var4;
      this.Xqedii_1qtmyyn = var5;
   }

   public byte[] Xqedii_2r3ltno(String var1, File var2) {
      if (((-546777872 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (this.Xqedii_1qtmyyn == null) {
         return null;
      } else {
         Matcher var3 = Xqedii_3s68w2g.Xqedii_18mqikn.matcher(var1);
         if (!var3.matches()) {
            return null;
         } else {
            String var4;
            try {
               var4 = Files.readString(var2.toPath(), StandardCharsets.UTF_8);
            } catch (IOException var10) {
               return null;
            }

            int var5 = Xqedii_37mmpgf(
               var4, var4.indexOf(Xqedii_9b0c7uf.Xqedii_25ggc5kf08bci("1y3AdQq0ii1BwPTLC3EfWNsybzKfQ9YbuTRWw2cPHnWBlaTe//w6WhXjFDgJQyBqwcU="))
            );
            int var6 = Xqedii_37mmpgf(
               var4, var4.indexOf(Xqedii_9b0c7uf.Xqedii_25ggc5kf08bci("PVSZ1fhYLhtMXCgaKZh0WxILHdUhBfEFtGgxOjKGht6P4FmU4+s+7IJUmXQ8p7ObsQuqFOn4"))
            );
            if (var5 >= 0 && var6 >= 0 && var6 > var5) {
               String var7 = var3.group(Xqedii_9b0c7uf.Xqedii_3rzivhsoof8nd(-15160472, 5));
               int var8 = var7 != null && this.Xqedii_18wf8zl.contains(var7)
                  ? Xqedii_9b0c7uf.Xqedii_3ab21nqahmuzo(1335778150, 11)
                  : Xqedii_9b0c7uf.Xqedii_3rzivhsoof8nd(-15160504, 8);
               String var9 = Xqedii_3lbaun6o6q9m5(
                  var4.substring(Xqedii_9b0c7uf.Xqedii_3dwwt11dmnjm9(892358948, 26), var5),
                  this.Xqedii_1qtmyyn.functions((var8 != 0)),
                  var4.substring(var5, var6),
                  var4.substring(var6)
               );
               this.Xqedii_2j5wggn = this.Xqedii_2j5wggn + Xqedii_9b0c7uf.Xqedii_3dwwt11dmnjm9(-1994274430, 13);
               return var9.getBytes(StandardCharsets.UTF_8);
            } else {
               return null;
            }
         }
      }
   }

   public void Xqedii_1bv0otb(ZipOutputStream var1, Set<String> var2) throws IOException {
      if ((1179118253 * (1179118253 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         for (Path var4 : this.Xqedii_23z7ald) {
            String var5 = Xqedii_3s68w2g.Xqedii_3c4jmju(this.Xqedii_2hw69rw, var4);
            if (!this.Xqedii_2uhmyhc(var5) && (var2 == null || var2.add(var5.toLowerCase(Locale.ROOT)))) {
               ZipEntry var6 = new ZipEntry(var5);
               var6.setTime(var4.toFile().lastModified());
               var1.putNextEntry(var6);
               var1.write(Files.readAllBytes(var4));
               var1.closeEntry();
               this.Xqedii_q9b6pe4 = this.Xqedii_q9b6pe4 + Xqedii_9b0c7uf.Xqedii_3rzivhsoof8nd(-552031416, 29);
            }
         }
      }
   }

   public int Xqedii_255fjeb() {
      if ((2085839028 * (2085839028 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_2j5wggn;
      }
   }

   public int Xqedii_km8lvcg() {
      if ((-933590748 * -933590748 + -933590748 & 1) != 0) {
         throw new IllegalStateException();
      } else {
         return this.Xqedii_q9b6pe4;
      }
   }

   public boolean Xqedii_ivak95i() {
      if (((-1325412281 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         return ((this.Xqedii_1qtmyyn != null
            ? Xqedii_9b0c7uf.Xqedii_3ab21nqahmuzo(1335778150, 11)
            : Xqedii_9b0c7uf.Xqedii_1y6g7735lot2u(1710588894, 19)) != 0);
      }
   }

   public boolean Xqedii_2uhmyhc(String var1) {
      if (((1548768333 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String var2 = var1.toLowerCase(Locale.ROOT);
         if (!var2.equals(Xqedii_9b0c7uf.Xqedii_25ggc5kf08bci("Yxlh+9G6wPg3G8W2XPXGCMvur58VopRgGegvAuw8MCmItjc3C3EqjY3UXrWd1zIqiw8="))
            && !var2.equals(Xqedii_9b0c7uf.Xqedii_25ggc5kf08bci("TowuccJkb+OYm8Lp8vvNU4N1/Hh7P8kCpb+4Oro0e6/1nV3khc8dFNb5rPs="))
            && !var2.contains(Xqedii_9b0c7uf.Xqedii_25ggc5kf08bci("9q35lH4Z3qsSGQvuZplMdK7XQhlxeDFiYicBCRG7kzT4ejoOBscDZc/2HJ9v8g=="))
            && !var2.startsWith(Xqedii_9b0c7uf.Xqedii_25ggc5kf08bci("YTyb2Y8/Z4ik+a/lJDR5ExKBb3IEBoIh+On0MsI/HBglVX6/eXK0Qrt+Bng="))) {
            int var3 = var1.indexOf(Xqedii_9b0c7uf.Xqedii_1y6g7735lot2u(-281917759, 10));
            return ((var3 > 0 && this.Xqedii_3eq8bxc.contains(var1.substring(Xqedii_9b0c7uf.Xqedii_3rzivhsoof8nd(-15160504, 11), var3))
               ? Xqedii_9b0c7uf.Xqedii_1y6g7735lot2u(1038507992, 7)
               : Xqedii_9b0c7uf.Xqedii_3rzivhsoof8nd(-15160504, 2)) != 0);
         } else {
            return (Xqedii_9b0c7uf.Xqedii_1y6g7735lot2u(2040002063, 13) != 0);
         }
      }
   }

   public static int Xqedii_37mmpgf(String var0, int var1) {
      if (((-2128676202 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 < 0) {
         return Xqedii_9b0c7uf.Xqedii_1y6g7735lot2u(-259626967, 5);
      } else {
         int var2 = var0.lastIndexOf(Xqedii_9b0c7uf.Xqedii_3dwwt11dmnjm9(1276397847, 0), var1);
         return var2 < 0 ? Xqedii_9b0c7uf.Xqedii_3rzivhsoof8nd(-15160504, 7) : var2 + Xqedii_9b0c7uf.Xqedii_3ab21nqahmuzo(1335778150, 22);
      }
   }

   private static /* synthetic */ String Xqedii_3lbaun6o6q9m5(String string, String string2, String string3, String string4) {
        return string + string2 + string3 + Xqedii_9b0c7uf.Xqedii_25ggc5kf08bci((String)"v03v9kB1eIFmKHMriZvb8WYA4oTgMXZ4Ula7BDYz+pssN/fI4OxGk/R9mt76SwCI6X42rUplURnlkDx4hcxn7kfnCZoTgel4CXsgBX/gd0j11ARSRz/xZChbBlblsOVJkopcd8EjfFVgTp6jHcN4VxaCeusxxRuVoFvHXYTw86E=") + string4;
    }
}
