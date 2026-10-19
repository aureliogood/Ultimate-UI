package dev.xqedii.ultimateUI;

import dev.xqedii.ultimateUI.service.resourcepack.UiImageAtlasService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public abstract class UiImageLookup extends ResourcePackDelivery {
   public static final String Xqedii_14kacxgcnuny5 = "\n//\n// well well well, Hello!\n// Contact: https://xqedii.dev/dc\n//\n";

   public List<UiImageAtlasService.GeneratedImage> getGeneratedUiImagesForEditor() {
      if ((1880590581 * (1880590581 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         this.rebuildUiImagesIntoResourcePack();
         if (this.Xqedii_11hx7yt != null && !this.Xqedii_11hx7yt.isEmpty()) {
            ArrayList<UiImageAtlasService.GeneratedImage> var1 = new ArrayList<>();

            for (UiImageAtlasService.GeneratedImage var3 : this.Xqedii_11hx7yt.values()) {
               if (var3 != null && var3.name() != null && !var3.name().isBlank()) {
                  var1.add(var3);
               }
            }

            var1.sort((UiImageAtlasService.GeneratedImage var1x, UiImageAtlasService.GeneratedImage var2) -> {
               if ((-311657642 ^ -311657642) != 0) {
                  throw new IllegalStateException();
               } else {
                  Comparator var10000 = String.CASE_INSENSITIVE_ORDER;
                  String[] var10002 = new String[Xqedii_1lt6e3s.Xqedii_hyg6u4aj6lxy(-2136313453, 28)];
                  var10002[Xqedii_1lt6e3s.Xqedii_vdua4jw1eppr(1317621595, 1)] = var1x == null ? null : var1x.name();
                  String var10001 = this.firstNonBlank(var10002);
                  String[] var10003 = new String[Xqedii_1lt6e3s.Xqedii_vdua4jw1eppr(-1795844888, 13)];
                  var10003[Xqedii_1lt6e3s.Xqedii_2ahnt5mtafzt9(-1474178180, 21)] = var2 == null ? null : var2.name();
                  return var10000.compare(var10001, this.firstNonBlank(var10003));
               }
            });
            return var1;
         } else {
            return Collections.emptyList();
         }
      }
   }

   public UiImageAtlasService.GeneratedImage resolveGeneratedUiImageForEditor(String var1) {
      if ((132651406 * (132651406 + 1) & 1) != 0) {
         throw new IllegalStateException();
      } else {
         UiImageAtlasService.GeneratedImage var2 = this.resolveGeneratedUiImage(var1);
         if (var2 != null) {
            return var2;
         } else {
            String var3 = this.alternateImageLookupName(var1);
            UiImageAtlasService.GeneratedImage var4 = this.Xqedii_1e7k2q0.Xqedii_1jkbht0(this.getDataFolder(), var1, this.getLogger());
            if (var4 == null && var3 != null) {
               var4 = this.Xqedii_1e7k2q0.Xqedii_1jkbht0(this.getDataFolder(), var3, this.getLogger());
            }

            if (var4 != null) {
               if (this.Xqedii_11hx7yt == null) {
                  this.Xqedii_11hx7yt = new HashMap<>();
               }

               this.Xqedii_11hx7yt.put(this.normalizeImageLookupKey(var1), var4);
               return var4;
            } else {
               return null;
            }
         }
      }
   }

   public UiImageAtlasService.GeneratedImage resolveGeneratedUiImage(String var1) {
      if (((-1913909383 << 1 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank() && this.Xqedii_11hx7yt != null && !this.Xqedii_11hx7yt.isEmpty()) {
         String var2 = this.normalizeImageLookupKey(var1);
         UiImageAtlasService.GeneratedImage var3 = this.Xqedii_11hx7yt.get(var2);
         if (var3 != null) {
            return var3;
         } else {
            String var4 = this.alternateImageLookupKey(var2);
            return var4 != null ? this.Xqedii_11hx7yt.get(var4) : null;
         }
      } else {
         return null;
      }
   }

   public String alternateImageLookupKey(String var1) {
      if ((-1700673516 ^ -1700673516) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         return var1.startsWith(Xqedii_1lt6e3s.Xqedii_3jqzr42ng9btc("0707b9bJseHKFsik/8G/IDuyLiD07MDDTSijl17VRnGeRrpL"))
            ? var1.substring(Xqedii_1lt6e3s.Xqedii_hyg6u4aj6lxy(-1867878253, 6))
            : Xqedii_mqq0rttm3mpy(var1);
      } else {
         return null;
      }
   }

   public String alternateImageLookupName(String var1) {
      if ((-1795182940 * -1795182940 - -1795182940 & 1) != 0) {
         throw new IllegalStateException();
      } else if (var1 != null && !var1.isBlank()) {
         String var2 = this.normalizeImageLookupKey(var1);
         return var2.startsWith(Xqedii_1lt6e3s.Xqedii_3jqzr42ng9btc("0707b9bJseHKFsik/8G/IDuyLiD07MDDTSijl17VRnGeRrpL"))
            ? var2.substring(Xqedii_1lt6e3s.Xqedii_2ahnt5mtafzt9(1373514883, 25))
            : Xqedii_li7vzxmw5n5d(var2);
      } else {
         return null;
      }
   }

   public String normalizeImageLookupKey(String var1) {
      if (((1855662046 | 1) & 1) == 0) {
         throw new IllegalStateException();
      } else {
         String[] var10001 = new String[Xqedii_1lt6e3s.Xqedii_6um7i4rizuza(1423409564, 26)];
         var10001[Xqedii_1lt6e3s.Xqedii_2ahnt5mtafzt9(-1474178180, 13)] = var1;
         String var2 = this.firstNonBlank(var10001).trim();
         int var3 = var2.lastIndexOf(Xqedii_1lt6e3s.Xqedii_vdua4jw1eppr(245174942, 26));
         if (var3 > 0) {
            var2 = var2.substring(Xqedii_1lt6e3s.Xqedii_hyg6u4aj6lxy(-1867877997, 3), var3);
         }

         return Xqedii_2t253qr.Xqedii_376339b(var2);
      }
   }

   private static /* synthetic */ String Xqedii_mqq0rttm3mpy(String string) {
        return Xqedii_1lt6e3s.Xqedii_3jqzr42ng9btc("0707b9bJseHKFsik/8G/IDuyLiD07MDDTSijl17VRnGeRrpL") + string;
    }

    private static /* synthetic */ String Xqedii_li7vzxmw5n5d(String string) {
        return Xqedii_1lt6e3s.Xqedii_3jqzr42ng9btc("0707b9bJseHKFsik/8G/IDuyLiD07MDDTSijl17VRnGeRrpL") + string;
    }
}
